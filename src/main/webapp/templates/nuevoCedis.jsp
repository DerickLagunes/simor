<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!-- Vertically centered scrollable modal -->
<div class="modal fade" id="nuevoCedisModal"  data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
    <div class="modal-content">

      <div class="modal-header">
        <h5 class="modal-title">Agregar un CEDIS</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>

      <div class="modal-body">
        <div class="offset-2 col-8" style="padding-top: 60px;padding-bottom: 60px">
          <h4 class="text-center">Nuevo CEDIS</h4>
          <br>
          <form id="cedis_form" method="post" action="cedis">
            <div class="row">

              <div class="mb-3">
                <label for="nombre_cedis" class="form-label">Nombre del CEDIS<i class="text-danger">*</i></label>
                <input maxlength="100" required="" type="text" class="form-control" id="nombre_cedis"
                       name="nombre_cedis" aria-describedby="nombre_cedis_ayuda">
                <div id="nombre_cedis_ayuda" class="form-text">Escribe aquí el nombre del nuevo CEDIS.</div>
              </div>

              <div class="mb-3">
                <label for="region_cedis" class="form-label">Región del CEDIS<i class="text-danger">*</i></label>
                <input maxlength="100" required="" type="text" class="form-control" id="region_cedis"
                       name="region_cedis" aria-describedby="region_cedis_ayuda">
                <div id="region_cedis_ayuda" class="form-text">Escribe aquí la región del nuevo CEDIS.</div>
              </div>

            </div>
          </form>
        </div>
      </div>

      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-bs-dismiss="modal"><i class="bi bi-x"></i> Cancelar</button>
        <button onclick="enviarCedis()" type="button" class="btn btn-primary">Registrar Cedis</button>
      </div>

    </div>
  </div>
</div>

<script>
  var myModal = document.getElementById('nuevoCedisModal')
  var nombre = document.getElementById('nombre_cedis')
  var region = document.getElementById('region_cedis')

  myModal.addEventListener('shown.bs.modal', function () {
    nombre.focus()
  })
</script>
<script>
  function enviarCedis(){
    let form = document.querySelector("#cedis_form");

    // Asegúrate de que el formulario es válido antes de enviarlo
    if (!form.checkValidity()) {
      alert("Por favor, completa todos los campos obligatorios.");
      return;
    }

    var req = new XMLHttpRequest();
    req.open ("POST", "cedis", true);
    req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    req.onload = function(){
      if (req.readyState == 4 && req.status == 200){
        let myModalEl = document.getElementById('nuevoCedisModal');
        let modal = bootstrap.Modal.getInstance(myModalEl)
        modal.hide();
        updateCedis();
      }
      else{
        alert ("¡No se pudo registrar la información contacte a soporte tecnico!");
      }
    };
    req.send(new URLSearchParams(new FormData(form)).toString());
  }

  //Función que actuliza la lista de cedis en el formulario de evaluación
  // Debe hacer que el selector de unidades se reinicie
  function updateCedis(){
    let select = document.getElementById("cedis_select");
    let select2 = document.getElementById("economico_cedis");
    let req = new XMLHttpRequest();

    if(document.getElementById("cedis_select")){limpiarSelect("cedis_select");}
    if(document.getElementById("economico_cedis")){limpiarSelect("economico_cedis");}
    if(document.getElementById("economico")){limpiarSelect("economico");}

    req.open("GET", "cedis", true);
    req.onreadystatechange = function() {
      if (req.readyState === XMLHttpRequest.DONE) {
        if (req.status == 200) {
          let respuesta = JSON.parse(req.responseText); //json
          for (let key in respuesta) {
            if (respuesta.hasOwnProperty(key)) {
              //Crear elementos del select
              let option = document.createElement("option");
              option.setAttribute("value", respuesta[key].id_cedis);
              option.text = respuesta[key].nombre_cedis;
              select.appendChild(option);

              if(document.getElementById("economico_cedis")) {
                let option2 = document.createElement("option");
                option2.setAttribute("value", respuesta[key].id_cedis);
                option2.text = respuesta[key].nombre_cedis;
                select2.appendChild(option2);
              }
            }
          }
        } else {
          console.log('Error on updating Categories');
          console.log(req.status);
          console.log(req.readyState );
          console.log(req.responseText);
        }
      }
    };
    req.send(null);
  }
</script>