<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!-- Vertically centered scrollable modal WIP -->
<div class="modal fade" id="nuevoEconomicoModal"  data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
    <div class="modal-content">

      <div class="modal-header">
        <h5 class="modal-title">Agregar un Económico</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>

      <div class="modal-body">
        <div class="offset-2 col-8" style="padding-top: 60px;padding-bottom: 60px">
          <h4 class="text-center">Nuevo Económico</h4>
          <br>
          <form id="economico_form" method="post" action="economico">
            <div class="row">

              <div class="mb-3">
                <label for="economico_cedis" class="form-label">CEDIS<i class="text-danger">*</i></label>
                <select class="form-select" id="economico_cedis" name="economico_cedis" required>
                  <option value="" disabled selected>Seleccione...</option>
                </select>
                <div id="economico_cedis_ayuda" class="form-text">Selecciona la el CEDIS al que pertenece el económico.</div>
              </div>

              <div class="mb-3">
                <label for="id_usuario_economico" class="form-label">Dueño de la unidad económica<i class="text-danger">*</i></label>
                <select class="form-select" id="id_usuario_economico" name="id_usuario_economico" required>
                  <option value="" disabled selected>Seleccione...</option>
                </select>
                <div id="id_usuario_economico_ayuda" class="form-text">Selecciona el dueño del económico.</div>
              </div>

              <div class="mb-3">
                <label for="id_economico" class="form-label">Identificador del Económico<i class="text-danger">*</i></label>
                <input maxlength="10" required="" type="text" class="form-control" id="id_economico"
                       name="id_economico" aria-describedby="id_economico_ayuda">
                <div id="id_economico_ayuda" class="form-text">Escribe aquí el identificador del nuevo Económico.</div>
              </div>

              <div class="mb-3">
                <label for="placa" class="form-label">Placa<i class="text-danger">*</i></label>
                <input maxlength="25" required="" type="text" class="form-control" id="placa"
                       name="placa" aria-describedby="placa_ayuda">
                <div id="placa_ayuda" class="form-text">Escribe aquí la placa del nuevo Económico.</div>
              </div>

              <div class="mb-3">
                <p>Nota: En este formulario no puedes cargar dictamenes, usa el formulario dedicado en <a href="../nuevoEconomico.jsp">este enlace</a>.</p>
              </div>

            </div>
          </form>
        </div>
      </div>

      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-bs-dismiss="modal"><i class="bi bi-x"></i> Cancelar</button>
        <button onclick="enviarEconomico()" type="button" class="btn btn-primary">Registrar Económico</button>
      </div>

    </div>
  </div>
</div>

<script>
  var myModal = document.getElementById('nuevoEconomicoModal')
  var id = document.getElementById('id_economico')
  var id_user = document.getElementById('id_usuario_economico')
  var placa = document.getElementById('placa')
  var cedis = document.getElementById('economico_cedis')

  myModal.addEventListener('shown.bs.modal', function () {
    id.focus()
  })
</script>
<script>
  function enviarEconomico(){
    let form = document.querySelector("#economico_form");

    // Asegúrate de que el formulario es válido antes de enviarlo
    if (!form.checkValidity()) {
      alert("Por favor, completa todos los campos obligatorios.");
      return;
    }

    var req = new XMLHttpRequest();
    req.open ("POST", "economico", true);
    req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    req.onload = function(){
      if (req.readyState == 4 && req.status == 200){
        let myModalEl = document.getElementById('nuevoEconomicoModal');
        let modal = bootstrap.Modal.getInstance(myModalEl)
        modal.hide();
        updateEconomico();
      }
      else{
        alert ("¡No se pudo registrar la información contacte a soporte tecnico!");
      }
    };
    req.send(new URLSearchParams(new FormData(form)).toString());
  }

  //Función que actuliza la lista de cedis en el formulario de evaluación
  // Debe hacer que el selector de unidades se reinicie
  function updateEconomico(){
    let select = document.getElementById("economico");
    let cedis = document.getElementById("economico_cedis").value;
    let req = new XMLHttpRequest();

    limpiarSelect("economico");
    req.open("GET", "economico?id_cedis="+cedis, true);
    req.onreadystatechange = function() {
      if (req.readyState === XMLHttpRequest.DONE) {
        if (req.status == 200) {
          let respuesta = JSON.parse(req.responseText); //json
          for (let key in respuesta) {
            if (respuesta.hasOwnProperty(key)) {
              //Crear elementos del select
              let option = document.createElement("option");
              option.setAttribute("value", respuesta[key].id_economico);
              option.text = respuesta[key].id_economico;
              select.appendChild(option);
            }
          }
        } else {
          console.log('Error on updating Económicos');
          console.log(req.status);
          console.log(req.readyState );
          console.log(req.responseText);
        }
      }
    };
    req.send(null);
  }
</script>