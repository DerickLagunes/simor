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
<style>
    .archivo {
        display: none;
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
                <form method="post" action="economicocondictamen" enctype="multipart/form-data">
                    <input type="hidden" name="accion" value="main">
                    <!-- Inicia sección de CEDIS y Unidad -->
                    <div class="section-border">
                        <div class="section-title">Nuevo registro de Económico</div>
                        <p class="disabled text-start text-body-secondary mb-3">Si se registra un Económico con un identificador que ya existe en la Base de Datos, no se reemplazaran los datos del económico. Sin embargo, si se agregara un nuevo dictamen, en caso de ser registrado.</p>
                        <p class="disabled text-start text-body-secondary mb-3" style="color: dimgrey">Todos los campos son obligatorios <i class="text-danger">*</i>.</p>
                        <br>
                        <div class="row">
                            <label for="cedis_select" class="form-label">CEDIS<i class="text-danger">*</i></label>
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
                            <div class="mb-3">
                                <label for="id_usuario" class="form-label">Dueño de la unidad económica<i class="text-danger">*</i></label>
                                <select class="form-select" id="id_usuario" name="id_usuario" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="id_economico" class="form-label">Identificador del Económico<i class="text-danger">*</i></label>
                                <input maxlength="10" required="" type="text" class="form-control" id="id_economico"
                                       name="id_economico" aria-describedby="id_economico_ayuda">
                                <div id="id_economico_ayuda" class="form-text">Escribe aquí el identificador del nuevo Económico.</div>
                            </div>
                            <div class="mb-3">
                                <label for="placa" class="form-label">Placa<i class="text-danger">*</i></label>
                                <input maxlength="20" required="" type="text" class="form-control" id="placa"
                                       name="placa" aria-describedby="placa_ayuda">
                                <div id="placa_ayuda" class="form-text">Escribe aquí la placa del nuevo Económico.</div>
                            </div>
                            <div class="mb-3">
                                <div class="form-check form-switch mb-3">
                                    <input type="checkbox" class="form-check-input" id="test"
                                           name="test" value="">
                                    <label for="test" class="form-check text-start">¿Tiene dictamen?<i class="text-danger">*</i></label>
                                </div>
                                <div class="archivo mb-3">
                                    <div class="row">
                                        <div class="col-6">
                                            <label for="folio_humo" class="form-label">Folio del primer dictamen<i class="text-danger">*</i></label>
                                            <input type="text" class="form-control archi" id="folio_humo"
                                                   name="folio_humo" maxlength="20" aria-describedby="folio_humo_ayuda">
                                            <div id="folio_humo_ayuda" class="form-text">Escribe aquí <i class="bi-arrow-up"></i> el folio del dictamen de humo.</div>
                                        </div>
                                        <div class="col-6">
                                            <label for="archivo_humo" class="form-label">Archivo PDF<i class="text-danger">*</i></label>
                                            <div class="input-group custom-file-button">
                                                <label class="input-group-text" for="archivo_humo">Adjuntar archivo</label>
                                                <input type="file" accept="application/pdf" class="form-control archi" id="archivo_humo"
                                                       name="archivo_humo" aria-describedby="archivo_humo_ayuda">
                                            </div>
                                            <div id="archivo_humo_ayuda" class="form-text">Sube aqui <i class="bi-upload"></i> el archivo PDF del dictamen de humo.</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="archivo mb-3">
                                    <div class="row">
                                        <div class="col-6">
                                            <label for="folio_fisico" class="form-label">Folio del dictamen físico<i class="text-danger">*</i></label>
                                            <input type="text" maxlength="20" class="form-control archi" id="folio_fisico"
                                                   name="folio_fisico" aria-describedby="folio_fisico_ayuda">
                                            <div id="folio_fisico_ayuda" class="form-text">Escribe aquí <i class="bi-arrow-up"></i> el folio del dictamen físico.</div>
                                        </div>
                                        <div class="col-6">
                                            <label for="archivo_fisico" class="form-label">Archivo PDF<i class="text-danger">*</i></label>
                                            <div class="input-group custom-file-button">
                                                <label class="input-group-text" for="archivo_fisico">Adjuntar archivo</label>
                                                <input type="file" accept="application/pdf" class="form-control archi" id="archivo_fisico"
                                                       name="archivo_fisico" aria-describedby="archivo_fisico_ayuda">
                                            </div>
                                            <div id="archivo_fisico_ayuda" class="form-text">Sube aqui <i class="bi-upload"></i> el archivo PDF del dictamen físico.</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <br>
                    <button type="submit" class="btn btn-primary">Registrar Económico</button>
                </form>
            </div>
        </div>
    </div>
</main>
<script>
    function limpiarSelect(id){
        let select = document.getElementById(id);

        let def = document.createElement("option");
        def.setAttribute("selected", "");
        def.text = "Selecciona...";
        select.replaceChildren(def);
    }
</script>
<script>
    function loadCedis() {
        let req = new XMLHttpRequest();
        let cedisSelect = document.getElementById("cedis_select");
        req.onreadystatechange = function() {
            if (req.readyState == XMLHttpRequest.DONE) { // XMLHttpRequest.DONE == 4
                if (req.status == 200) {
                    let respuesta = JSON.parse(req.responseText); //json
                    for(let key in respuesta){
                        if (respuesta.hasOwnProperty(key)) {
                            //Crear elementos del select
                            let option = document.createElement("option");
                            option.setAttribute("value", respuesta[key].id_cedis);
                            option.text = respuesta[key].nombre_cedis;
                            cedisSelect.appendChild(option);
                        }
                    }
                }
                else if (req.status == 400) {
                    console.log('There was an error 400');
                }
                else {
                    console.log('something else other than 200 was returned');
                }
            }
        };

        req.open("GET", "cedis", true);
        req.send(null);
    }
</script>
<script>
    function loadClientes() {
        let req = new XMLHttpRequest();
        let userSelect = document.getElementById("id_usuario");
        req.onreadystatechange = function() {
            if (req.readyState == XMLHttpRequest.DONE) { // XMLHttpRequest.DONE == 4
                if (req.status == 200) {
                    let respuesta = JSON.parse(req.responseText); //json
                    for(let key in respuesta){
                        if (respuesta.hasOwnProperty(key)) {
                            //Crear elementos del select
                            let option = document.createElement("option");
                            option.setAttribute("value", respuesta[key].id_usuario);
                            option.text = respuesta[key].nombre_usuario;
                            userSelect.appendChild(option);
                        }
                    }
                }
                else if (req.status == 400) {console.log('There was an error 400');}
                else {console.log('something else other than 200 was returned');}
            }
        };
        req.open("POST", "clientes", true);
        req.send(null);
    }
</script>
<script>
    document.addEventListener("DOMContentLoaded", (event) => {
        loadCedis();
        loadClientes();
    });
</script>
<script>
    document.getElementById('test').addEventListener('change', function() {
        var isChecked = this.checked;
        var archivoDivs = document.querySelectorAll('.archivo');
        var archis = document.querySelectorAll('.archi');
        archivoDivs.forEach(function(div) {
            div.style.display = isChecked ? 'block' : 'none';
        });
        archis.forEach(function(input) {
            input.required = isChecked ? "true" : "";
        });
    });
</script>

<% request.getSession().removeAttribute("mensaje"); %>
<jsp:include page="templates/footer.jsp" />