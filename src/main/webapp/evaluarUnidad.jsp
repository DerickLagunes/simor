<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:include page="templates/header.jsp" />

<main> <-- Cuerpo de la página --!>

    <div class="container-fluid" style="padding-top:60px; text-align: center">
        <div class="row justify-content-center">
            <div class="col-12 col-md-5">
                <form>
                    <div class="mb-3">
                        <label for="id_estado" class="form-label">ID Estado</label>
                        <select class="form-select" id="id_estado" name="id_estado" required>
                            <option value="1">Opción 1</option>
                            <option value="2">Opción 2</option>
                            <option value="3">Opción 3</option>
                        </select>
                    </div>
                    <!-- Inicia sección de Luces -->
                    <div class="section-border">
                        <div class="section-title">Luces</div>
                        <!-- Luces Galibo -->
                        <div class="mb-3">
                            <label for="luces_galibo" class="form-label"><strong>Galibo</strong></label>
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
                            <label for="luces_altas" class="form-label"><strong>Altas</strong></label>
                            <select class="form-select" id="luces_altas" name="luces_altas" required>
                                <option value="" disabled selected>Seleccione...</option>
                                <option value="1">Izquierda fundida o rota</option>
                                <option value="2">Derecha fundida o rota</option>
                                <option value="3">Ambas fundidas o rotas</option>
                                <option value="4">Aprobadas</option>
                            </select>
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="luces_bajas" class="form-label"><strong>Bajas</strong></label>
                            <select class="form-select" id="luces_bajas" name="luces_bajas" required>
                                <option value="" disabled selected>Seleccione...</option>
                                <option value="1">Izquierda fundida o rota</option>
                                <option value="2">Derecha fundida o rota</option>
                                <option value="3">Ambas fundidas o rotas</option>
                                <option value="4">Aprobadas</option>
                            </select>
                        </div>
                        </div>
                        <!-- Luces Demarcadoras -->
                        <div class="row">
                            <div class="subsection-title">Demarcadoras</div>
                            <div class="col-md-6 mb-3">
                                <label for="luces_demarcadoras_delanteras" class="form-label"><strong>Delanteras</strong></label>
                                <select class="form-select" id="luces_demarcadoras_delanteras" name="luces_demarcadoras_delanteras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Delantera izquierda fundida</option>
                                    <option value="2">Delantera derecha fundida</option>
                                    <option value="3">Ambas fundidas</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="luces_demarcadoras_traseras" class="form-label"><strong>Traseras</strong></label>
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
                            <label for="luces_indicadoras" class="form-label"><strong>Indicadoras</strong></label>
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
                                <label for="llantas_rines_delanteros" class="form-label"><strong>Delanteros</strong></label>
                                <select class="form-select" id="llantas_rines_delanteros" name="llantas_rines_delanteros" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Derecho roto o soldado</option>
                                    <option value="2">Izquierdo roto o soldado</option>
                                    <option value="3">Ambos rotos o soldados</option>
                                    <option value="4">Aprobados</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="llantas_rines_traseros" class="form-label"><strong>Traseros</strong></label>
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
                                <label for="llantas_masas_delanteras" class="form-label"><strong>Delanteras</strong></label>
                                <select class="form-select" id="llantas_masas_delanteras" name="llantas_masas_delanteras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Derecha con fuga</option>
                                    <option value="2">Izquierda con fuga</option>
                                    <option value="3">Ambas con fuga</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="llantas_masas_traseras" class="form-label"><strong>Traseras</strong></label>
                                <select class="col-md-6 form-select" id="llantas_masas_traseras" name="llantas_masas_traseras" required>
                                    <option value="" disabled selected>Seleccione...</option>
                                    <option value="1">Derecha con fuga</option>
                                    <option value="2">Izquierda con fuga</option>
                                    <option value="3">Ambas con fuga</option>
                                    <option value="4">Aprobadas</option>
                                </select>
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="llantas_presion" class="form-label">Llantas Presión</label>
                            <select class="form-select" id="llantas_presion" name="llantas_presion" required>
                                <option value="1">Alta</option>
                                <option value="2">Media</option>
                                <option value="3">Baja</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="llantas_profundidad" class="form-label">Llantas Profundidad</label>
                            <select class="form-select" id="llantas_profundidad" name="llantas_profundidad" required>
                                <option value="1">Buena</option>
                                <option value="2">Regular</option>
                                <option value="3">Mala</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="llantas_birlos_delanteros" class="form-label">Llantas Birlos Delanteros</label>
                            <select class="form-select" id="llantas_birlos_delanteros" name="llantas_birlos_delanteros" required>
                                <option value="1">Buena</option>
                                <option value="2">Regular</option>
                                <option value="3">Mala</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="llantas_birlos_traseros" class="form-label">Llantas Birlos Traseros</label>
                            <select class="form-select" id="llantas_birlos_traseros" name="llantas_birlos_traseros" required>
                                <option value="1">Buena</option>
                                <option value="2">Regular</option>
                                <option value="3">Mala</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="llantas_tuercas_delanteros" class="form-label">Llantas Tuercas Delanteros</label>
                            <select class="form-select" id="llantas_tuercas_delanteros" name="llantas_tuercas_delanteros" required>
                                <option value="1">Buena</option>
                                <option value="2">Regular</option>
                                <option value="3">Mala</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="llantas_tuercas_traseros" class="form-label">Llantas Tuercas Traseros</label>
                            <select class="form-select" id="llantas_tuercas_traseros" name="llantas_tuercas_traseros" required>
                                <option value="1">Buena</option>
                                <option value="2">Regular</option>
                                <option value="3">Mala</option>
                            </select>
                        </div>
                    </div>




                    <div class="mb-3">
                        <label for="caja_direccion" class="form-label">Caja Dirección</label>
                        <select class="form-select" id="caja_direccion" name="caja_direccion" required>
                            <option value="1">Buena</option>
                            <option value="2">Regular</option>
                            <option value="3">Mala</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="deposito_aceite" class="form-label">Depósito de Aceite</label>
                        <select class="form-select" id="deposito_aceite" name="deposito_aceite" required>
                            <option value="1">Buena</option>
                            <option value="2">Regular</option>
                            <option value="3">Mala</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="parabrisas" class="form-label">Parabrisas</label>
                        <select class="form-select" id="parabrisas" name="parabrisas" required>
                            <option value="1">Buena</option>
                            <option value="2">Regular</option>
                            <option value="3">Mala</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="limpiaparabrisas" class="form-label">Limpiaparabrisas</label>
                        <select class="form-select" id="limpiaparabrisas" name="limpiaparabrisas" required>
                            <option value="1">Buena</option>
                            <option value="2">Regular</option>
                            <option value="3">Mala</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="huelgo" class="form-label">Huelgo</label>
                        <select class="form-select" id="huelgo" name="huelgo" required>
                            <option value="1">Buena</option>
                            <option value="2">Regular</option>
                            <option value="3">Mala</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="escape" class="form-label">Escape</label>
                        <select class="form-select" id="escape" name="escape" required>
                            <option value="1">Buena</option>
                            <option value="2">Regular</option>
                            <option value="3">Mala</option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </form>
            </div>
        </div>
    </div>
</main> <-- Termina el cuerpo de la página --!>

<jsp:include page="templates/footer.jsp" />
