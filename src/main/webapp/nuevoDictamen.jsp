<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="templates/header.jsp" />
<jsp:include page="templates/nuevoCedis.jsp" />
<style>
    .custom-file-button input[type=file]{
        margin-left: -2px !important;
    }
    .custom-file-button input[type=file]::-webkit-file-upload-button {
        display: none;
    }
    .custom-file-button input[type=file]::file-selector-button {
         display: none;
    }
    .custom-file-button:hover label {
        background-color: #dde0e3;
        cursor: pointer;
    }
</style>
<main>
    <div class="container-fluid" style="padding-top:60px; text-align: center">
        <div class="row justify-content-center">
            <div class="col-12 col-md-5">
                <c:if test="${not empty mensaje}">
                    <div class="alert alert-success alert-dismissible fade show" role="alert">
                        <strong>${mensaje}.</strong>
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                    </div>
                </c:if>
                <form method="post" action="cargarDictamenEspecifico" enctype="multipart/form-data">
                    <input type="hidden" name="id_economico" value="${id_economico}">
                    <!-- Inicia sección de CEDIS y Unidad -->
                    <div class="section-border">
                        <div class="section-title">Dictamenes para económico ${id_economico}:</div>
                        <div class="row">
                            <p class="disabled text-start text-body-secondary mb-3" style="color: dimgrey">Todos los campos son obligatorios <i class="text-danger">*</i>.</p>
                            <br>
                            <div class="mb-3">
                                <div class="archivo mb-3">
                                    <div class="row">
                                        <div class="col-6">
                                            <label for="folio1" class="form-label">Folio del primer dictamen<i class="text-danger">*</i></label>
                                            <input maxlength="25" type="text" class="form-control archi" id="folio1"
                                                   name="folio1" aria-describedby="folio1_ayuda">
                                            <div id="folio1_ayuda" class="form-text">Escribe aquí <i class="bi-arrow-up"></i> el folio del primer dictamen.</div>
                                        </div>
                                        <div class="col-6">
                                            <label for="file1" class="form-label">Archivo PDF<i class="text-danger">*</i></label>
                                            <div class="input-group custom-file-button">
                                                <label class="input-group-text" for="file1">Adjuntar archivo</label>
                                                <input type="file" accept="application/pdf" class="form-control archi" id="file1"
                                                       name="file1" aria-describedby="file1_ayuda">
                                            </div>
                                            <div id="file1_ayuda" class="form-text">Sube aqui <i class="bi-upload"></i> el primer archivo PDF.</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="archivo mb-3">
                                    <div class="row">
                                        <div class="col-6">
                                            <label for="folio1" class="form-label">Folio del segundo dictamen<i class="text-danger">*</i></label>
                                            <input maxlength="25" type="text" class="form-control archi" id="folio2"
                                                   name="folio2" aria-describedby="folio2_ayuda">
                                            <div id="folio2_ayuda" class="form-text">Escribe aquí <i class="bi-arrow-up"></i> el folio del segundo dictamen.</div>
                                        </div>
                                        <div class="col-6">
                                            <label for="file2" class="form-label">Archivo PDF<i class="text-danger">*</i></label>
                                            <div class="input-group custom-file-button">
                                                <label class="input-group-text" for="file2">Adjuntar archivo</label>
                                                <input type="file" accept="application/pdf" class="form-control archi" id="file2"
                                                       name="file2" aria-describedby="file2_ayuda">
                                            </div>
                                            <div id="file2_ayuda" class="form-text">Sube aqui <i class="bi-upload"></i> el segundo archivo PDF.</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <br>
                    <button type="submit" class="btn btn-primary">Registrar Dictamen</button>
                </form>
            </div>
        </div>
    </div>
</main>

<% request.getSession().removeAttribute("mensaje"); %>
<jsp:include page="templates/footer.jsp" />