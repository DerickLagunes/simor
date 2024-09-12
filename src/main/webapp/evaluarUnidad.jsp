<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="templates/header.jsp" />
<jsp:include page="templates/nuevoCedis.jsp" />
<jsp:include page="templates/nuevoEconomico.jsp" />

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
                <form id="form" method="post" action="evaluacion">
                    <!-- Inicia sección de CEDIS y Unidad -->
                    <div class="section-border">
                        <div class="section-title">Nueva evaluación de económico</div>
                        <p class="disabled text-start text-body-secondary mb-3" style="color: dimgrey">Todos los campos son obligatorios <i class="text-danger">*</i>.</p>
                        <br>
                        <div class="row">
                            <label for="cedis_select" class="form-label">CEDIS</label>
                            <div class="col-8 mb-3">
                                <select class="form-select" id="cedis_select" name="cedis" required>
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
                            <label for="economico" class="form-label">Económico</label>
                            <div class="col-8 mb-3">
                                <select class="form-select" id="economico" name="economico" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                </select>
                            </div>
                            <div class="col-4 mb-3">
                                <button type="button" class="btn btn-outline-primary"
                                        data-bs-toggle="modal"
                                        data-bs-target="#nuevoEconomicoModal"><i class="bi-plus"></i> Nuevo Económico</button>
                            </div>
                        </div>
                    </div>
                    <!-- Inicia sección de Luces -->
                    <div class="section-border">
                        <div class="section-title">Luces</div>
                        <!-- Luces Galibo -->
                        <div class="mb-3">
                            <label for="luces_galibo" class="form-label"><strong>Galibo<i class="text-danger">*</i></strong></label>
                            <select class="form-select" id="luces_galibo" name="luces_galibo" required>
                                <option value="" disabled selected>Seleccione...</option>
                                <option value="1">Izquierda fundida o rota</option>
                                <option value="2">Derecha fundida o rota</option>
                                <option value="3">Ambas fundidas o rotas</option>
                                <option value="4">Aprobadas</option>
                            </select>
                        </div>
                        <!-- Luces Altas y Bajas -->
                        <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="luces_altas" class="form-label"><strong>Altas<i class="text-danger">*</i></strong></label>
                            <select class="form-select" id="luces_altas" name="luces_altas" required>
                                <option value="" disabled selected>Seleccione...</option>
                                <option value="1">Izquierda fundida o rota</option>
                                <option value="2">Derecha fundida o rota</option>
                                <option value="3">Ambas fundidas o rotas</option>
                                <option value="4">Aprobadas</option>
                            </select>
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="luces_bajas" class="form-label"><strong>Bajas<i class="text-danger">*</i></strong></label>
                            <select class="form-select" id="luces_bajas" name="luces_bajas" required>
                                <option value="" disabled selected>Seleccione...</option>
                                <option value="1">Izquierda fundida o rota</option>
                                <option value="2">Derecha fundida o rota</option>
                                <option value="3">Ambas fundidas o rotas</option>
                                <option value="4">Aprobadas</option>
                            </select>
                        </div>
                        </div>
                        <!-- Luces Direccionales -->
                        <div class="row">
                            <div class="subsection-title">Demarcadoras</div>
                            <div class="col-md-6 mb-3">
                                <label for="luces_direccionales_delanteras" class="form-label"><strong>Delanteras<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="luces_direccionales_delanteras" name="luces_direccionales_delanteras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Delantera izquierda fundida</option>
                                    <option value="2">Delantera derecha fundida</option>
                                    <option value="3">Ambas fundidas</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="luces_direccionales_traseras" class="form-label"><strong>Traseras<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="luces_direccionales_traseras" name="luces_direccionales_traseras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Trasera izquierda fundida</option>
                                    <option value="2">Trasera derecha fundida</option>
                                    <option value="3">Ambas fundidas</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                        </div>
                        <!-- Luces Demarcadoras -->
                        <div class="row">
                            <div class="subsection-title">Demarcadoras</div>
                            <div class="col-md-6 mb-3">
                                <label for="luces_demarcadoras_delanteras" class="form-label"><strong>Delanteras<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="luces_demarcadoras_delanteras" name="luces_demarcadoras_delanteras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Delantera izquierda fundida</option>
                                    <option value="2">Delantera derecha fundida</option>
                                    <option value="3">Ambas fundidas</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="luces_demarcadoras_traseras" class="form-label"><strong>Traseras<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="luces_demarcadoras_traseras" name="luces_demarcadoras_traseras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Trasera izquierda fundida</option>
                                    <option value="2">Trasera derecha fundida</option>
                                    <option value="3">Ambas fundidas</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                        </div>
                        <!-- Luces Indicadoras -->
                        <div class="mb-3">
                            <label for="luces_indicadoras" class="form-label"><strong>Indicadoras<i class="text-danger">*</i></strong></label>
                            <select class="form-select" id="luces_indicadoras" name="luces_indicadoras" required>
                                <option value="" disabled selected>Seleccione...</option>
                                <option value="1">1 fundida</option>
                                <option value="2">2 fundida</option>
                                <option value="3">3 fundida</option>
                                <option value="4">Aprobadas</option>
                            </select>
                        </div>
                    </div>
                    <!-- Comienza Llantas -->
                    <div class="section-border">
                        <div class="section-title">Llantas</div>
                        <!-- Rines -->
                        <div class="row">
                            <div class="subsection-title">Rines</div>
                            <div class="col-md-6 mb-3">
                                <label for="llantas_rines_delanteros" class="form-label"><strong>Delanteros<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="llantas_rines_delanteros" name="llantas_rines_delanteros" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Derecho roto o soldado</option>
                                    <option value="2">Izquierdo roto o soldado</option>
                                    <option value="3">Ambos rotos o soldados</option>
                                    <option value="4">Aprobados</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="llantas_rines_traseros" class="form-label"><strong>Traseros<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="llantas_rines_traseros" name="llantas_rines_traseros" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Derecho roto o soldado</option>
                                    <option value="2">Izquierdo roto o soldado</option>
                                    <option value="3">Ambos rotos o soldados</option>
                                    <option value="4">Aprobados</option>
                                </select>
                            </div>
                        </div>
                        <!-- Masas -->
                        <div class="row">
                            <div class="subsection-title">Masas</div>
                            <div class="col-md-6 mb-3">
                                <label for="llantas_masas_delanteras" class="form-label"><strong>Delanteras<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="llantas_masas_delanteras" name="llantas_masas_delanteras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Derecha con fuga</option>
                                    <option value="2">Izquierda con fuga</option>
                                    <option value="3">Ambas con fuga</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="llantas_masas_traseras" class="form-label"><strong>Traseras<i class="text-danger">*</i></strong></label>
                                <select class="col-md-6 form-select" id="llantas_masas_traseras" name="llantas_masas_traseras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Derecha con fuga</option>
                                    <option value="2">Izquierda con fuga</option>
                                    <option value="3">Ambas con fuga</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                        </div>
                        <!-- Presión y Profundidad -->
                        <div class="row">
                            <div class="subsection-title">Presión y Profundidad</div>
                            <div class="col-6 mb-3">
                                <label class="form-label"><strong>Delantera Izquierda<i class="text-danger">*</i></strong></label>
                                <div class="input-group">
                                    <input type="number" min="0" id="presion_delantera_izquierda" name="presion_delantera_izquierda" required class="form-control" placeholder="PSI">
                                </div>
                                <div class="input-group">
                                    <input type="number" step="0.01" max="99.99" min="0" id="profundidad_delantera_izquierda" name="profundidad_delantera_izquierda" required class="form-control" placeholder="mm">
                                </div>
                            </div>
                            <div class="col-6 mb-3">
                                <label class="form-label"><strong>Delantera Derecha<i class="text-danger">*</i></strong></label>
                                <div class="input-group">
                                    <input type="number" min="0" id="presion_delantera_derecha" name="presion_delantera_derecha" required class="form-control" placeholder="PSI">
                                </div>
                                <div class="input-group">
                                    <input type="number" step="0.01" max="99.99" min="0" id="profundidad_delantera_derecha" name="profundidad_delantera_derecha" required class="form-control" placeholder="mm">
                                </div>
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-6 mb-3">
                                <div class="row">
                                    <label class="form-label"><strong>Traseras Izquierdas<i class="text-danger">*</i></strong></label>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input type="number" min="0" id="presion_trasera_izquierda_1" name="presion_trasera_izquierda_1" required class="form-control" placeholder="PSI">
                                        </div>
                                        <div class="input-group">
                                            <input type="number" step="0.01" max="99.99" min="0" id="profundidad_trasera_izquierda_1" name="profundidad_trasera_izquierda_1" required class="form-control" placeholder="mm">
                                        </div>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input type="number" min="0" id="presion_trasera_izquierda_2" name="presion_trasera_izquierda_2" required class="form-control" placeholder="PSI">
                                        </div>
                                        <div class="input-group">
                                            <input type="number" step="0.01" max="99.99" min="0" id="profundidad_trasera_izquierda_2" name="profundidad_trasera_izquierda_2" required class="form-control" placeholder="mm">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-6 mb-3">
                                <div class="row">
                                    <label class="form-label"><strong>Traseras Derechas<i class="text-danger">*</i></strong></label>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input type="number" min="0" id="presion_trasera_derecha_1" name="presion_trasera_derecha_1" required class="form-control" placeholder="PSI">
                                        </div>
                                        <div class="input-group">
                                            <input type="number" step="0.01" max="99.99" min="0" id="profundidad_trasera_derecha_1" name="profundidad_trasera_derecha_1" required class="form-control" placeholder="mm">
                                        </div>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input type="number" min="0" id="presion_trasera_derecha_2" name="presion_trasera_derecha_2" required class="form-control" placeholder="PSI">
                                        </div>
                                        <div class="input-group">
                                            <input type="number" step="0.01" max="99.99" min="0" id="profundidad_trasera_derecha_2" name="profundidad_trasera_derecha_2" required class="form-control" placeholder="mm">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>


                        <!-- Birlos delanteros -->
                        <div class="row">
                            <div class="subsection-title">Birlos</div>
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Delantera Izquierda<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_birlos_delantera_izquierda" name="llantas_birlos_delantera_izquierda" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Roto / Rotos</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_birlos_delantera_izquierda_num" name="llantas_birlos_delantera_izquierda_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Delantera Derecha<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_birlos_delantera_derecha" name="llantas_birlos_delantera_derecha" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Roto / Rotos</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_birlos_delantera_derecha_num" name="llantas_birlos_delantera_derecha_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Birlos traseros -->
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Trasera Izquierda<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_birlos_trasera_izquierda" name="llantas_birlos_trasera_izquierda" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Roto / Rotos</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_birlos_trasera_izquierda_num" name="llantas_birlos_trasera_izquierda_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Trasera Derecha<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_birlos_trasera_derecha" name="llantas_birlos_trasera_derecha" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Roto / Rotos</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_birlos_trasera_derecha_num" name="llantas_birlos_trasera_derecha_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Tuercas -->
                        <!-- Tuercas delanteros -->
                        <div class="row">
                            <div class="subsection-title">Tuercas</div>
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Delantera Izquierda<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_tuercas_delantera_izquierda" name="llantas_tuercas_delantera_izquierda" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Faltante / Faltantes</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_tuercas_delantera_izquierda_num" name="llantas_tuercas_delantera_izquierda_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Delantera Derecha<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_tuercas_delantera_derecha" name="llantas_tuercas_delantera_derecha" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Faltante / Faltantes</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_tuercas_delantera_derecha_num" name="llantas_tuercas_delantera_derecha_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- tuercas traseros -->
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Trasera Izquierda<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_tuercas_trasera_izquierda" name="llantas_tuercas_trasera_izquierda" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Faltante / Faltantes</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_tuercas_trasera_izquierda_num" name="llantas_tuercas_trasera_izquierda_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <div class="row">
                                    <div class="subsection-title">Trasera Derecha<i class="text-danger">*</i></div>
                                    <div class="col-6 mb-3">
                                        <select class="form-select" id="llantas_tuercas_trasera_derecha" name="llantas_tuercas_trasera_derecha" required>
                                            <option value="" disabled selected>Seleccione...</option>
                                            <option value="1">Faltante / Faltantes</option>
                                            <option value="2">Aprobados</option>
                                        </select>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <div class="input-group">
                                            <input id="llantas_tuercas_trasera_derecha_num" name="llantas_tuercas_trasera_derecha_num" type="number" min="0" max="10" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Comienza Otros -->
                    <div class="section-border">
                        <div class="section-title">Otros</div>
                        <!-- Caja de dirección -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="caja_direccion" class="form-label"><strong>Caja Dirección<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="caja_direccion" name="caja_direccion" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Fuga de aceite</option>
                                    <option value="2">Aprobada</option>
                                </select>
                            </div>
                        </div>
                        <!-- Deposito de aceite -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="deposito_aceite" class="form-label"><strong>Depósito de Aceite<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="deposito_aceite" name="deposito_aceite" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Fuga de aceite</option>
                                    <option value="2">Aprobada</option>
                                </select>
                            </div>
                        </div>
                        <!-- Parabrisas -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="parabrisas" class="form-label"><strong>Parabrisas<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="parabrisas" name="parabrisas" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Aprobado</option>
                                    <option value="2">Estrellado</option>
                                </select>
                            </div>
                        </div>
                        <!-- Limpiaparabrisas -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="limpiaparabrisas" class="form-label"><strong>Limpiaparabrisas<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="limpiaparabrisas" name="limpiaparabrisas" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Aprobado</option>
                                    <option value="2">No funciona</option>
                                    <option value="3">Falta 1 pluma</option>
                                    <option value="4">Faltan 2 plumas</option>
                                </select>
                            </div>
                        </div>
                        <!-- Huelgo -->
                        <div class="row">
                            <label for="huelgo" class="form-label"><strong>Huelgo<i class="text-danger">*</i></strong></label>
                            <div class="col-6 mb-3">
                                <select class="form-select" id="huelgo" name="huelgo" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Aprobado</option>
                                    <option value="2">Indicar cuanto...</option>
                                </select>
                            </div>
                            <div class="col-6 mb-3">
                                <div class="input-group">
                                    <input id="huelgo_cuanto" name="huelgo_cuanto" type="number" min="0" class="form-control" required>
                                </div>
                            </div>
                        </div>

                        <!-- manijas_de_puertas -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="manijas_de_puertas" class="form-label"><strong>Manijas de las puertas<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="manijas_de_puertas" name="manijas_de_puertas" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">1 rota</option>
                                    <option value="2">2 rotas</option>
                                    <option value="3">Aprobadas</option>
                                </select>
                            </div>
                        </div>
                        <!-- chavetas -->
                        <div class="row">
                            <label for="chavetas" class="form-label"><strong>Chavetas<i class="text-danger">*</i></strong></label>
                            <div class="col-6 mb-3">
                                <select class="form-select" id="chavetas" name="chavetas" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Aprobadas</option>
                                    <option value="2">Faltantes (Indicar cuantas)</option>
                                </select>
                            </div>
                            <div class="col-6 mb-3">
                                <div class="input-group">
                                    <input id="chavetas_cuanto" name="chavetas_cuanto" type="number" min="0" class="form-control" required>
                                </div>
                            </div>
                        </div>
                        <!-- brazo_pitman -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="brazo_pitman" class="form-label"><strong>Brazo Pitman<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="brazo_pitman" name="brazo_pitman" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Golpeado</option>
                                    <option value="2">Aprobado</option>
                                </select>
                            </div>
                        </div>
                        <!-- faros -->
                        <div class="row">
                            <div class="subsection-title">Faros</div>
                            <div class="col-md-6 mb-3">
                                <label for="faro_izquierdo" class="form-label"><strong>Izquierdo<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="faro_izquierdo" name="faro_izquierdo" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Flojo</option>
                                    <option value="2">Roto</option>
                                    <option value="3">Aprobado</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="faro_derecho" class="form-label"><strong>Derecho<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="faro_derecho" name="faro_derecho" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Flojo</option>
                                    <option value="2">Roto</option>
                                    <option value="3">Aprobado</option>
                                </select>
                            </div>
                        </div>
                        <!-- compresor -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="compresor" class="form-label"><strong>Compresor<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="compresor" name="compresor" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">No corta</option>
                                    <option value="2">No Aprobado</option>
                                    <option value="3">Aprobado</option>
                                </select>
                            </div>
                        </div>
                        <!-- tiempo_de_carga -->
                        <div class="row">
                            <div class="subsection-title">Tiempo de Carga</div>
                            <div class="col-md-6 mb-3">
                                <label for="tiempo_de_carga_psi" class="form-label"><strong>PSI<i class="text-danger">*</i></strong></label>
                                <div class="input-group">
                                    <input type="number" min="0" id="tiempo_de_carga_psi" name="tiempo_de_carga_psi" required class="form-control" placeholder="PSI">
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="tiempo_de_carga_tiempo" class="form-label"><strong>Tiempo<i class="text-danger">*</i></strong></label>
                                <div class="input-group">
                                    <input type="number" step="0.01" max="99.99" min="0" id="tiempo_de_carga_tiempo" name="tiempo_de_carga_tiempo" required class="form-control" placeholder="En minutos">
                                </div>
                            </div>
                        </div>
                        <!-- tanques_de_aire -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="tanques_de_aire" class="form-label"><strong>Tanques de aire<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="tanques_de_aire" name="tanques_de_aire" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">No Aprobados (Con agua)</option>
                                    <option value="2">Aprobados</option>
                                </select>
                            </div>
                        </div>
                        <!-- humo -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="humo" class="form-label"><strong>Humo<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="humo" name="humo" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">No Aprobado</option>
                                    <option value="2">Aprobado</option>
                                </select>
                            </div>
                        </div>
                        <!-- gobernado -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="gobernado" class="form-label"><strong>Gobernado<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="gobernado" name="gobernado" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">No Aprobado</option>
                                    <option value="2">Aprobado</option>
                                </select>
                            </div>
                        </div>
                        <!-- Escape -->
                        <div class="row">
                            <div class="mb-3">
                                <label for="escape" class="form-label"><strong>Escape<i class="text-danger">*</i></strong></label>
                                <select class="form-select" id="escape" name="escape" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Aprobado</option>
                                    <option value="2">Faltante</option>
                                    <option value="3">Roto</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <!-- Comienza Evidencias -->
                    <div class="section-border">
                        <div class="section-title">Evidencias y Comentarios</div>
                        <!-- evidencias -->
                        <div class="row">
                            <div class="subsection-title">Evidencias</div>
                            <div class="col-md-6 mb-3">
                                <label for="evidencia1" class="form-label"><strong>Evidencia 1<i class="text-danger">*</i></strong></label>
                                <div class="input-group">
                                    <input type="file" id="evidencia1" name="evidencia1" accept="image/png, image/jpeg" required class="form-control">
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="evidencia2" class="form-label"><strong>Evidencia 2<i class="text-danger">*</i></strong></label>
                                <div class="input-group">
                                    <input type="file" id="evidencia2" name="evidencia2" accept="image/png, image/jpeg" required class="form-control">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 mb-3">
                                <label for="comentarios" class="form-label"><strong>Comentarios</strong></label>
                                <textarea class="form-control" id="comentarios" name="comentarios" rows="4" placeholder="Escribe tus comentarios aquí..."></textarea>
                            </div>
                        </div>
                    </div>
                    <br>
                    <input type="hidden" name="id_usuario_evaluador" value="${sesion.id_usuario}" />
                    <button type="submit" class="btn btn-primary">Enviar</button>
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
    // Espera a que el DOM esté completamente cargado
    document.addEventListener('DOMContentLoaded', function() {
        // Obtén el elemento select por su id
        var birlos_delantera_izquierda = document.getElementById('llantas_birlos_delantera_izquierda');
        var birlos_delantera_derecha = document.getElementById('llantas_birlos_delantera_derecha');
        var birlos_trasera_izquierda = document.getElementById('llantas_birlos_trasera_izquierda');
        var birlos_trasera_derecha = document.getElementById('llantas_birlos_trasera_derecha');
        document.getElementById('llantas_birlos_delantera_izquierda_num').setAttribute("disabled","true");
        document.getElementById('llantas_birlos_delantera_derecha_num').setAttribute("disabled","true");
        document.getElementById('llantas_birlos_trasera_izquierda_num').setAttribute("disabled","true");
        document.getElementById('llantas_birlos_trasera_derecha_num').setAttribute("disabled","true");

        // Agrega un event listener para el evento 'change'
        birlos_delantera_izquierda.addEventListener('change', function() {
            var input = document.getElementById('llantas_birlos_delantera_izquierda_num');
            input.removeAttribute("disabled");
            if(birlos_delantera_izquierda.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });
        birlos_delantera_derecha.addEventListener('change', function() {
            var input = document.getElementById('llantas_birlos_delantera_derecha_num');
            input.removeAttribute("disabled");
            if(birlos_delantera_derecha.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });
        birlos_trasera_izquierda.addEventListener('change', function() {
            var input = document.getElementById('llantas_birlos_trasera_izquierda_num');
            input.removeAttribute("disabled");
            if(birlos_trasera_izquierda.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });
        birlos_trasera_derecha.addEventListener('change', function() {
            var input = document.getElementById('llantas_birlos_trasera_derecha_num');
            input.removeAttribute("disabled");
            if(birlos_trasera_derecha.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });


        //Tuercas
        var tuercas_delantera_izquierda = document.getElementById('llantas_tuercas_delantera_izquierda');
        var tuercas_delantera_derecha = document.getElementById('llantas_tuercas_delantera_derecha');
        var tuercas_trasera_izquierda = document.getElementById('llantas_tuercas_trasera_izquierda');
        var tuercas_trasera_derecha = document.getElementById('llantas_tuercas_trasera_derecha');
        document.getElementById('llantas_tuercas_delantera_izquierda_num').setAttribute("disabled","true");
        document.getElementById('llantas_tuercas_delantera_derecha_num').setAttribute("disabled","true");
        document.getElementById('llantas_tuercas_trasera_izquierda_num').setAttribute("disabled","true");
        document.getElementById('llantas_tuercas_trasera_derecha_num').setAttribute("disabled","true");

        // Agrega un event listener para el evento 'change'
        tuercas_delantera_izquierda.addEventListener('change', function() {
            var input = document.getElementById('llantas_tuercas_delantera_izquierda_num');
            input.removeAttribute("disabled");
            if(tuercas_delantera_izquierda.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });
        tuercas_delantera_derecha.addEventListener('change', function() {
            var input = document.getElementById('llantas_tuercas_delantera_derecha_num');
            input.removeAttribute("disabled");
            if(tuercas_delantera_derecha.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });
        tuercas_trasera_izquierda.addEventListener('change', function() {
            var input = document.getElementById('llantas_tuercas_trasera_izquierda_num');
            input.removeAttribute("disabled");
            if(tuercas_trasera_izquierda.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });
        tuercas_trasera_derecha.addEventListener('change', function() {
            var input = document.getElementById('llantas_tuercas_trasera_derecha_num');
            input.removeAttribute("disabled");
            if(tuercas_trasera_derecha.value == 1){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });

        var huelgo = document.getElementById('huelgo');
        document.getElementById('huelgo_cuanto').setAttribute("disabled","true");

        // Agrega un event listener para el evento 'change'
        huelgo.addEventListener('change', function() {
            var input = document.getElementById('huelgo_cuanto');
            input.removeAttribute("disabled");
            if(huelgo.value == 2){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });


        var chavetas = document.getElementById('chavetas');
        document.getElementById('chavetas_cuanto').setAttribute("disabled","true");

        // Agrega un event listener para el evento 'change'
        chavetas.addEventListener('change', function() {
            var input = document.getElementById('chavetas_cuanto');
            input.removeAttribute("disabled");
            if(chavetas.value == 2){
                input.focus();
            }else{
                input.value = 0;
                input.setAttribute("disabled","true");
            }
        });
    });
</script>

<script>
    function loadCedis() {
        let req = new XMLHttpRequest();
        let cedisSelect = document.getElementById("cedis_select");
        let economicoCedisSelect = document.getElementById("economico_cedis");

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

                            let option2 = document.createElement("option");
                            option2.setAttribute("value", respuesta[key].id_cedis);
                            option2.text = respuesta[key].nombre_cedis;

                            cedisSelect.appendChild(option);
                            economicoCedisSelect.appendChild(option2);
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
    function loadEconomico(cedis) {
        limpiarSelect("economico")
        let req = new XMLHttpRequest();
        let cedisSelect = document.getElementById("economico");

        req.onreadystatechange = function() {
            if (req.readyState == XMLHttpRequest.DONE) { // XMLHttpRequest.DONE == 4
                if (req.status == 200) {
                    let respuesta = JSON.parse(req.responseText); //json
                    for(let key in respuesta){
                        if (respuesta.hasOwnProperty(key)) {
                            let option = document.createElement("option");
                            if(respuesta[key].id_economico==""){
                                option.setAttribute("value", "");
                                option.text = "No se encontraron económicos en el CEDIS";
                                option.disabled = true;
                            }else{
                                option.setAttribute("value", respuesta[key].id_economico);
                                option.text = respuesta[key].id_economico;
                            }
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

        req.open("GET", "economico?id_cedis="+cedis, true);
        req.send(null);
    }
</script>

<script>
    function loadClientes() {
        let req = new XMLHttpRequest();
        let userSelect = document.getElementById("id_usuario_economico");
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
    document.getElementById("cedis_select").addEventListener("change", (valor) => {
        const cedis = valor.target.value; // Obtiene el valor del option seleccionado
        var economicoCedisSelect = document.getElementById("economico_cedis");
        economicoCedisSelect.value = cedis;
        loadEconomico(cedis); // Llama a la función con el valor seleccionado
    });
</script>
<c:if test="${not empty id_cedis}">
    <script>
        loadEconomico(${id_cedis});
        let selectorC = document.getElementById("cedis_select");
        let selectorE = document.getElementById("economico");
        selectorC.value = ${id_cedis};
        setTimeout(function() {
            selectorE.value = '${id_economico}';
        }, 2000); // 3000 milisegundos = 3 segundos

    </script>
    <% request.getSession().removeAttribute("id_cedis"); %>
    <% request.getSession().removeAttribute("id_economico"); %>
</c:if>
<script>
    document.addEventListener("DOMContentLoaded", function() {
        var form = document.getElementById("form");

        form.addEventListener("submit", function(event) {
            // Get all input elements in the form
            var inputs = form.querySelectorAll("input[disabled]");

            // Temporarily enable all disabled inputs before submitting the form
            inputs.forEach(function(input) {
                input.disabled = false;
            });

            // Form will be submitted with enabled inputs
        });
    });
</script>

<% request.getSession().removeAttribute("mensaje"); %>
<jsp:include page="templates/footer.jsp" />
