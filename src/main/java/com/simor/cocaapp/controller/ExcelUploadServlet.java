package com.simor.cocaapp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.core.FileUploadException;
import org.apache.commons.fileupload2.jakarta.JakartaServletFileUpload;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;


@MultipartConfig
@WebServlet(name = "ExcelUploadServlet", value = "/uploadexcel")
public class ExcelUploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (JakartaServletFileUpload.isMultipartContent(request)) {
            try {
                DiskFileItemFactory factory = DiskFileItemFactory.builder().get();
                JakartaServletFileUpload upload = new JakartaServletFileUpload(factory);
                List<FileItem> multiparts = upload.parseRequest(request);

                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        String fileName = item.getName();
                        InputStream inputStream = item.getInputStream();

                        if (fileName.endsWith(".csv")) {
                            // Procesar archivo CSV
                            processCSV(inputStream);
                        } else if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) {
                            // Procesar archivo Excel
                            processExcel(inputStream);
                        } else {
                            //Respuesta del servlet (redirect o mensaje)
                            response.getWriter().println("No podemos procesar ese tipo de archivo");
                        }
                    }
                }

            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            response.getWriter().println("Este servlet solo atiende envio de archivos");
        }
    }

    private void processCSV(InputStream inputStream) throws IOException {
        try (InputStreamReader reader = new InputStreamReader(inputStream);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            for (CSVRecord csvRecord : csvParser) { //Itera cada fila del archivo sin contar la primera
                //Selecciona el valor de la celda con la cabecera que se llama Column1
                String column1 = csvRecord.get("Column1");
                //Selecciona el valor de la celda con la cabecera que se llama Column2
                String column2 = csvRecord.get("Column2");

                System.out.println("Column1: " + column1);
                System.out.println("Column2: " + column2);
            }
        }
    }

    private void processExcel(InputStream inputStream) throws IOException {
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0); // Obtener la primera hoja

        // Acceder a celdas específicas (por ejemplo, A1, B2, etc.)
        Cell cellA1 = sheet.getRow(0).getCell(0); // A1
        Cell cellB2 = sheet.getRow(1).getCell(1); // B2

        // Obtener valores de las celdas
        String valueA1 = cellA1.getStringCellValue();
        double valueB2 = cellB2.getNumericCellValue();

        System.out.println("A1: " + valueA1);
        System.out.println("B2: " + valueB2);

        workbook.close();
    }
}