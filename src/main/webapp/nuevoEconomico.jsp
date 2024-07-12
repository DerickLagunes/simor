<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="templates/header.jsp" />

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
                <form method="post" action="economico" enctype="multipart/form-data">
                    <input type="hidden" name="accion" value="main">
                    <!-- Inicia sección de CEDIS y Unidad -->
                    <div class="section-border">
                        <div class="section-title">Nuevo registro de Económico</div>
                        <div class="row">
                            <label for="cedis_select" class="form-label">CEDIS</label>
                            <div class="col-8 mb-3">
                                <select class="form-select" id="cedis_select" name="economico_cedis" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                </select>
                            </div>
                            <div class="col-4 mb-3">
                                <button type="button" class="btn btn-outline-primary"
                                        data-bs-toggle="modal"
                                        data-bs-target="#nuevoCedisModal"><i class="bi-plus"></i> Nuevo CEDIS</button>
                            </div>
                        </div>
                        <div class="row">
                            <label for="id_economico" class="form-label">Económico</label>
                            <div class="mb-3">
                                <input type="text" maxlength="10" name="id_economico" id="id_economico" required>
                            </div>
                        </div>

                        <!-- Incluir la sección de subida de archivos pdf para los dictamenes -->


                    </div>
                    <br>
                    <button type="submit" class="btn btn-primary">Registrar Económico</button>
                </form>
            </div>
        </div>
    </div>
</main>



<% request.getSession().removeAttribute("mensaje"); %>
<jsp:include page="templates/footer.jsp" />