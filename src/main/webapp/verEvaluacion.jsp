<%@ page import="com.simor.cocaapp.model.Dictamen" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="templates/header.jsp" />

<main>
    <div class="container-fluid" style="padding-top:60px; text-align: center">
        <div class="row justify-content-center">
            <div class="col-12">
                <c:if test="${not empty mensaje}">
                    <div class="alert alert-success alert-dismissible fade show" role="alert">
                        <strong>${mensaje}.</strong>
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                    </div>
                </c:if>
                <div class="section-border">
                    <div class="section-title">Evaluación para ${evaluacion.id_economico} el ${evalauacion.fecha_de_evaluacion}</div>
                    <div class="row">
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<%
    request.getSession().removeAttribute("mensaje");
    request.getSession().removeAttribute("evaluacion");
%>
<jsp:include page="templates/footer.jsp" />
