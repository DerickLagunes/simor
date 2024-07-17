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

                <table id="tabla_economicos" class="table table-striped table-hover" style="width:100%">
                    <thead>
                    <tr>
                        <th>Placa</th>
                        <th>Económico</th>
                        <th>Cedis</th>
                        <th>Región</th>
                        <th>Consultar</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</main>
<jsp:include page="templates/footerDataTablesClient.jsp" />
