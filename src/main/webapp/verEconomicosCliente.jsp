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

                <!-- Filtros adicionales -->
                <div class="mb-3 row">
                    <div class="col-5">
                        <label for="filtro" class="form-label">Filtro:</label>
                        <select id="filtro" class="form-select" name="filtro">
                            <option value="">Seleccione...</option>
                            <optgroup label="Luces">
                                <option value="luces_galibo">Galibo</option>
                                <option value="luces_altas">Altas</option>
                                <option value="luces_bajas">Bajas</option>
                                <option value="luces_demarcadoras_delanteras">Demarcadoras delanteras</option>
                                <option value="luces_demarcadoras_traseras">Demarcadoras traseras</option>
                                <option value="luces_indicadoras">Indicadoras</option>
                                <option value="luces_direccionales_delanteras">Direccionales delanteras</option>
                                <option value="luces_direccionales_traseras">Direccionales traseras</option>
                            </optgroup>

                            <optgroup label="Llantas">
                                <option value="llantas_rines_delanteros">Rines delanteros</option>
                                <option value="llantas_rines_traseros">Rines traseros</option>
                                <option value="llantas_masas_delanteras">Masas delanteras</option>
                                <option value="llantas_masas_traseras">Masas traseras</option>
                                <!--
                                <option value="llantas_presion_delantera_izquierda">Presión delantera izquierda</option>
                                <option value="llantas_presion_delantera_derecha">Presión delantera derecha</option>
                                <option value="llantas_presion_trasera_izquierda_1">Presión trasera izquierda 1</option>
                                <option value="llantas_presion_trasera_izquierda_2">Presión trasera izquierda 2</option>
                                <option value="llantas_presion_trasera_derecha_1">Presión trasera derecha 1</option>
                                <option value="llantas_presion_trasera_derecha_2">Presión trasera derecha 2</option>
                                <option value="llantas_profundidad_delantera_izquierda">Profundidad delantera izquierda</option>
                                <option value="llantas_profundidad_delantera_derecha">Profundidad delantera derecha</option>
                                <option value="llantas_profundidad_trasera_izquierda_1">Profundidad trasera izquierda 1</option>
                                <option value="llantas_profundidad_trasera_izquierda_2">Profundidad trasera izquierda 2</option>
                                <option value="llantas_profundidad_trasera_derecha_1">Profundidad trasera derecha 1</option>
                                <option value="llantas_profundidad_trasera_derecha_2">Profundidad trasera derecha 2</option>
                                -->
                                <option value="llantas_birlos_delantera_izquierda">Birlos delantera izquierda</option>
                                <option value="llantas_birlos_delantera_derecha">Birlos delantera derecha</option>
                                <option value="llantas_birlos_trasera_izquierda">Birlos trasera izquierda</option>
                                <option value="llantas_birlos_trasera_derecha">Birlos trasera derecha</option>
                                <option value="llantas_birlos_delantera_izquierda_num">Birlos delantera izquierda (número)</option>
                                <option value="llantas_birlos_delantera_derecha_num">Birlos delantera derecha (número)</option>
                                <option value="llantas_birlos_trasera_izquierda_num">Birlos trasera izquierda (número)</option>
                                <option value="llantas_birlos_trasera_derecha_num">Birlos trasera derecha (número)</option>
                                <option value="llantas_tuercas_delantera_izquierda">Tuercas delantera izquierda</option>
                                <option value="llantas_tuercas_delantera_derecha">Tuercas delantera derecha</option>
                                <option value="llantas_tuercas_trasera_izquierda">Tuercas trasera izquierda</option>
                                <option value="llantas_tuercas_trasera_derecha">Tuercas trasera derecha</option>
                                <option value="llantas_tuercas_delantera_izquierda_num">Tuercas delantera izquierda (número)</option>
                                <option value="llantas_tuercas_delantera_derecha_num">Tuercas delantera derecha (número)</option>
                                <option value="llantas_tuercas_trasera_izquierda_num">Tuercas trasera izquierda (número)</option>
                                <option value="llantas_tuercas_trasera_derecha_num">Tuercas trasera derecha (número)</option>
                            </optgroup>

                            <optgroup label="Otros">
                                <option value="caja_direccion">Caja de dirección</option>
                                <option value="deposito_aceite">Depósito de aceite</option>
                                <option value="parabrisas">Parabrisas</option>
                                <option value="limpiaparabrisas">Limpiaparabrisas</option>
                                <option value="huelgo">Huelgo</option>
                                <option value="huelgo_cuanto">Huelgo (cuánto)</option>
                                <option value="manijas_de_puertas">Manijas de puertas</option>
                                <option value="chavetas">Chavetas</option>
                                <option value="chavetas_cuanto">Chavetas (cuánto)</option>
                                <option value="brazo_pitman">Brazo Pitman</option>
                                <option value="faro_izquierdo">Faro izquierdo</option>
                                <option value="faro_derecho">Faro derecho</option>
                                <option value="compresor">Compresor</option>
                                <!--
                                <option value="tiempo_de_carga_psi">Tiempo de carga (PSI)</option>
                                <option value="tiempo_de_carga_tiempo">Tiempo de carga (tiempo)</option
                                -->
                                <option value="tanques_de_aire">Tanques de aire</option>
                                <option value="humo">Humo</option>
                                <option value="gobernado">Governado</option>
                            </optgroup>
                        </select>
                    </div>

                    <div class="col-5">
                        <label for="valor" class="form-label">Valor:</label>
                        <select id="valor" class="form-select" name="valor">
                            <option value="">Todos</option>
                            <option value="4">Aprobado</option>
                            <option value="1">No Aprobado</option>
                        </select>
                    </div>

                    <!-- Botón para aplicar filtros -->
                    <div class="mt-3 mb-3 col-2">
                        <button class="btn btn-primary" id="filtrar">Aplicar filtros <i class="bi-search"></i></button>
                    </div>

                </div>

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
