<%@ page import="com.simor.cocaapp.model.Dictamen" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="templates/header.jsp" />

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
                <div class="section-border">
                    <div class="section-title">Datos Económico</div>
                    <div class="row">
                        <div class="col-6 mb-3">
                            <p class="mb-3"><strong>Placa: </strong>${data.economico.placa}</p>
                            <p class="mb-3"><strong>Cedis: </strong>${data.cedis.nombre_cedis}</p>
                        </div>
                        <div class="col-6 mb-3">
                            <p class="mb-3"><strong>Fecha: </strong><fmt:formatDate value="${data.fecha_de_evaluacion}" pattern="dd/MM/yyyy"/></p>
                            <p class="mb-3"><strong>Económico: </strong>${data.economico.id_economico}</p>
                            <p class="mb-3"><strong>Cedis: </strong>${data.cedis.region}</p>
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
                                    <th>Resultado</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% int i = 1; %>
                                <c:forEach items="${resultados}" var="r">
                                    <c:choose>
                                        <c:when test="${tipoSesion == 'tecnico'}">
                                            <tr>
                                                <td><%=i%></td>
                                                <td>${r.categoria}</td>
                                                <td>${r.elemento}</td>
                                                <td>${r.resultado}</td>
                                            </tr>
                                            <% i++; %>
                                        </c:when>
                                        <c:otherwise>
                                            <c:if test="${not r.aprobado}">
                                                <tr>
                                                    <td><%=i%></td>
                                                    <td>${r.categoria}</td>
                                                    <td>${r.elemento}</td>
                                                    <td>${r.resultado}</td>
                                                </tr>
                                                <% i++; %>
                                            </c:if>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<%
    request.getSession().removeAttribute("mensaje");
    request.getSession().removeAttribute("data");
    request.getSession().removeAttribute("evaluacion");
    request.getSession().removeAttribute("resultados");
%>
<jsp:include page="templates/footer.jsp" />
