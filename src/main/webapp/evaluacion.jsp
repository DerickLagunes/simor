<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="templates/header.jsp" />
<main>
  <div class="container-fluid" style="padding-top:60px; text-align: center;">
    <div class="row">
      <!-- Parte opcional de imagen -->
      <div class="d-none d-sm-block offset-md-1 col-md-4 align-content-center">
        <h1>Nueva evaluación de unidad econommica:</h1><br/>
        <img class="img-fluid" src="assets/img/check_truck.png" alt="cehcar el camión">
        <p class="lead">Recuerda ser objetivo en tu evaluación</p>
      </div>
      <c:if test="${not empty sesion}">
        <!-- Parte obligatoria del formulario -->
        <div class="col-sm-12 col-md-6 align-content-center">
          <div class="row">
            <div class="col">

            </div>
            <div class="col-6">
              <br>
              <a class="btn btn-danger" href="login"><i class="bi bi-door-open-fill"></i> Cerrar sesión</a>
            </div>
          </div>

          <div class="row">
            <c:forEach items="${operaciones}" var="o">
              <div class="col-6">
                <a href="${o.operacion}?operacion=&quot;&quot;">
                  <div class="card shadow-sm">
                    <img class="bd-placeholder-img card-img-top"
                         width="100%"
                         height="160"
                         src="${o.media}"
                         alt="Imagen representativa"
                    />

                    <div class="card-body">
                      <p class="text-break"><strong>${o.operacion}</strong></p>
                    </div>
                  </div>
                </a>
              </div>
            </c:forEach>
          </div>
        </div>
      </c:if>

      <c:if test="${empty sesion}">
        <div class="col-sm-12 col-md-6 align-content-center">
          <h1>No tienes permiso para ver esta página</h1>
          <h2>Por favor inicia sesión antes</h2>
          <h3><a href="login">Iniciar sesión</a></h3>
        </div>
      </c:if>
    </div>
    <p class="mt-5 mb-3 text-muted">©SIMOR</p>
  </div>
</main>

<jsp:include page="templates/footer.jsp" />