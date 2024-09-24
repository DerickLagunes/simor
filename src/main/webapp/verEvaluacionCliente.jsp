<%@ page import="com.simor.cocaapp.model.Dictamen" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="templates/header.jsp" />
<style>
    .bi {
        font-size: 24px; /* Ajusta el tamaño del icono */
    }
</style>
<main>
    <div class="container-fluid" style="padding-top:60px; text-align: center">
        <div class="row justify-content-center">
            <div class="col-8">
                <c:if test="${not empty mensaje}">
                    <div class="alert alert-success alert-dismissible fade show" role="alert">
                        <strong>${mensaje}.</strong>
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                    </div>
                </c:if>
                <div class="section-border" style="background-color: #7ab6fa">
                    <div class="section-title">Datos Económico</div>
                    <div class="row">
                        <div class="col-6 mb-3">
                            <p class="mb-3"><strong>Placa: </strong>${data.economico.placa}</p>
                            <p class="mb-3"><strong>Cedis: </strong>${data.cedis.nombre_cedis}</p>
                        </div>
                        <div class="col-6 mb-3">
                            <p class="mb-3"><strong>Fecha: </strong><fmt:formatDate value="${data.fecha_de_evaluacion}" pattern="dd/MM/yyyy"/></p>
                            <p class="mb-3"><strong>Económico: </strong>${data.economico.id_economico}</p>
                        </div>
                        <div class="col-12 mb-3">
                            <p class="mb-3"><strong>Cedis: </strong>${data.cedis.region}</p>
                        </div>
                    </div>
                </div>
                <div class="section-border">
                    <div class="section-title">Información</div>
                    <div class="row">
                        <div class="col-8 mb-3 text-start">
                            <p class="mb-3">
                                <strong>Luces: </strong><br>
                                Mejoran la visibilidad y seguridad en la carretera, indicando maniobras y asegurando la visibilidad en condiciones adversas.<br>
                                Las luces traseras que se activan al frenar, señalan a los vehículos detrás que el camión está frenando, y son esenciales para la seguridad vial.
                            </p>
                            <p class="mb-3">
                                <strong>Llantas: </strong><br>
                                Proporcionan tracción y soporte al camión, distribuyendo el peso de manera uniforme. Aseguran tracción adecuada, estabilidad y seguridad en la carretera. Llantas desgastadas o mal mantenidas pueden aumentar el riesgo de deslizamientos y accidentes.
                            </p>
                            <p class="mb-3">
                                <strong>Caja de dirección: </strong><br>
                                Facilita el control y maniobrabilidad del camión, permitiendo un manejo más preciso y menos esfuerzo por parte del conductor. Un mal funcionamiento puede llevar a una pérdida de control, aumento del desgaste de neumáticos y problemas en la alineación, afectando la estabilidad del camión.
                            </p>
                            <p class="mb-3">
                                <strong>Parabrisas: </strong><br>
                                Bastidor con cristal que lleva el automóvil en su parte delantera para resguardar a los viajeros del aire cuando el vehículo se pone en movimiento. Proporciona una vista clara de la carretera y protege al conductor de elementos externos como viento, lluvia y escombros. Las grietas o daños pueden obstruir la visibilidad y aumentar el riesgo de accidentes.
                            </p>
                            <p class="mb-3">
                                <strong>Sistema de escape: </strong><br>
                                Dirige los gases de escape del motor fuera del vehículo y reduce el ruido del motor, es vital para el cumplimiento de normas ambientales y para la reducción del ruido. El mantenimiento previene problemas de emisión y garantiza que los gases tóxicos sean correctamente eliminados.
                            </p>
                            <p class="mb-3">
                                <strong>Depósito de aceite: </strong><br>
                                Almacena el aceite necesario para la lubricación del motor y la transmisión, es esencial para evitar el sobrecalentamiento, reducir la fricción y el desgaste prematuro de las piezas móviles. El mantenimiento regular asegura un rendimiento eficiente y prolonga la vida útil del motor.
                            </p>
                            <p class="mb-3">
                                <strong>Huelgo: </strong><br>
                                Se refiere al espacio o movimiento permitido entre las piezas mecánicas, como en los componentes del sistema de suspensión y dirección. Mantener el huelgo dentro de los parámetros especificados asegura un funcionamiento suave y previene el desgaste prematuro de las piezas. <br>
                                Un huelgo excesivo puede provocar ruidos, vibraciones y un manejo ineficiente del camión, mientras que un huelgo insuficiente puede llevar a un desgaste acelerado y fallos mecánicos.
                            </p>
                        </div>
                        <div class="col-4 mb-3">
                            <div class="row">
                                <div class="col-12 mb-2">
                                    <img src="assets/img/camioninfo2.jpeg" alt="Imagen 1" class="img-fluid">
                                </div>
                                <div class="col-12 mb-2">
                                    <img src="assets/img/llantas.jpeg" alt="Imagen 2" class="img-fluid">
                                </div>
                                <div class="col-12 mb-2">
                                    <img src="assets/img/camioninfo.jpeg" alt="Imagen 3" class="img-fluid">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="section-border">
                    <div class="section-title">Reporte de elementos</div>
                    <div class="row">
                        <p class="mb-3">Tras realizar la inspección del económico, el técnico verificador encontró lo siguiente:</p>
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>No.</th>
                                    <th>Categoría</th>
                                    <th>Elemento</th>
                                    <th>Aprueba con</th>
                                    <th>Resultado</th>
                                    <th>Evaluación</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% int i = 1; %>
                                <c:forEach items="${resultados}" var="r">
                                    <c:if test="${r.valor != 0}">
                                        <c:choose>
                                            <c:when test="${tipoSesion == 'tecnico' or tipoSesion == 'admin'}">
                                                <tr>
                                                    <td class="align-middle"><%=i%></td>
                                                    <td class="align-middle">${r.categoria}</td>
                                                    <td class="align-middle">${r.elemento}</td>
                                                    <td class="align-middle">${r.apruebaCon}</td>
                                                    <td class="align-middle">${r.resultado}</td>
                                                    <td class="${r.aprobado} align-middle"></td>
                                                </tr>
                                                <% i++; %>
                                            </c:when>
                                            <c:otherwise>
                                                <c:if test="${not r.aprobado or r.aprobado}">
                                                    <tr>
                                                        <td class="align-middle"><%=i%></td>
                                                        <td class="align-middle">${r.categoria}</td>
                                                        <td class="align-middle">${r.elemento}</td>
                                                        <td class="align-middle">${r.apruebaCon}</td>
                                                        <td class="align-middle">${r.resultado}</td>
                                                        <td class="${r.aprobado} align-middle"></td>
                                                    </tr>
                                                    <% i++; %>
                                                </c:if>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="section-border">
                    <div class="section-title">Evidencias y comentarios</div>
                    <div class="row">
                        <figure class="figure">
                            <img src="${evaluacion.evidencia1}" class="figure-img img-fluid rounded" alt="Evidencia 1">
                            <figcaption class="figure-caption text-center"><strong>Evidencia 1</strong></figcaption>
                        </figure>
                        <div class="col-6 mb-3">
                            <figure class="figure">
                                <img src="${evaluacion.evidencia2}" class="figure-img img-fluid rounded" alt="Evidencia 1">
                                <figcaption class="figure-caption text-center"><strong>Evidencia 2</strong></figcaption>
                            </figure>
                        </div>
                    </div>
                    <div class="row">
                        <div class="mb-3">
                            <h5>Comentarios del Técnico:</h5>
                            <div id="comentariosDisplay" class="border p-3">
                                <span>${evaluacion.comentarios}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<script>
    document.addEventListener('DOMContentLoaded', () => {
        // Seleccionar todas las celdas con la clase "true"
        const trueCells = document.querySelectorAll('td.true');
        const falseCells = document.querySelectorAll('td.false');

        // Cambiar el contenido de cada celda a "aprobado"
        trueCells.forEach(cell => {
            let icono = document.createElement("i");

            icono.setAttribute("class","bi text-success bi-clipboard-check-fill")
            let texto = document.createElement("span");
            texto.textContent = "Aprobado";

            let contenedor = document.createElement("span");
            //contenedor.appendChild(texto);
            contenedor.appendChild(icono);


            cell.appendChild(contenedor);
        });
        // Cambiar el contenido de cada celda a "reprobado"
        falseCells.forEach(cell => {
            let icono = document.createElement("i");

            icono.setAttribute("class","bi text-danger bi-clipboard-x-fill")
            let texto = document.createElement("span");
            texto.textContent = "Reprobado";

            let contenedor = document.createElement("span");
            //contenedor.appendChild(texto);
            contenedor.appendChild(icono);

            cell.appendChild(contenedor);
        });
    });
</script>
<%
    request.getSession().removeAttribute("mensaje");
    request.getSession().removeAttribute("data");
    request.getSession().removeAttribute("evaluacion");
    request.getSession().removeAttribute("resultados");
%>
<jsp:include page="templates/footer.jsp" />
