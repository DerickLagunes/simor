<%@ page import="com.simor.cocaapp.model.Dictamen" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="templates/header.jsp" />

<main>
    <div class="container-fluid" style="padding-top:60px; text-align: center">
        <div class="row justify-content-center">
            <div class="col-10">
            <c:if test="${not empty mensaje}">
                <div class="alert alert-success alert-dismissible fade show" role="alert">
                    <strong>${mensaje}.</strong>
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            </c:if>
            <c:if test="${not empty dictamen.folio_humo_1}">
                <div class="section-border">
                    <div class="section-title">Dictamenes para el primer semestre de ${id_economico}</div>
                    <div class="row">
                        <h4 class="mb-3">Folio: ${dictamen.folio_humo_1}</h4>
                        <iframe class="mb-3" src="${dictamen.archivo_humo_1}" width="100%" height="600px" style="border: none;"></iframe>
                        <br><br>
                        <br><br>
                        <h4 class="mb-3">Folio: ${dictamen.folio_fisico_1}</h4>
                        <iframe class="mb-3" src="${dictamen.archivo_fisico_1}" width="100%" height="600px" style="border: none;"></iframe>
                    </div>
                </div>
            </c:if>
            <c:if test="${not empty dictamen.folio_humo_2}">
                <div class="section-border">
                    <div class="section-title">Dictamenes para el segundo semestre de ${id_economico}</div>
                    <div class="row">
                        <h4 class="mb-3">Folio: ${dictamen.folio_humo_2}</h4>
                        <iframe class="mb-3" src="${dictamen.archivo_humo_2}" width="100%" height="600px" style="border: none;"></iframe>
                        <br><br>
                        <br><br>
                        <h4 class="mb-3">Folio: ${dictamen.folio_fisico_2}</h4>
                        <iframe class="mb-3" src="${dictamen.archivo_fisico_2}" width="100%" height="600px" style="border: none;"></iframe>
                    </div>
                </div>
            </c:if>
            </div>
        </div>
    </div>
</main>
<%
    request.getSession().removeAttribute("mensaje");
    request.getSession().removeAttribute("dictamen");
    request.getSession().removeAttribute("id_economico");
%>
<jsp:include page="templates/footer.jsp" />