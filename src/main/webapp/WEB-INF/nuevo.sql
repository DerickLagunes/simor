

ALTER TABLE evaluacion
    ADD COLUMN manijas_de_puertas INT DEFAULT 0,
    ADD COLUMN chavetas INT DEFAULT 0,
    ADD COLUMN brazo_pitman INT DEFAULT 0,
    ADD COLUMN faro_izquierdo INT DEFAULT 0,
    ADD COLUMN faro_derecho INT DEFAULT 0,
    ADD COLUMN compresor INT DEFAULT 0,
    ADD COLUMN tiempo_de_carga_psi INT DEFAULT 0,
    ADD COLUMN tiempo_de_carga_tiempo DECIMAL(4,2) DEFAULT 0.0,
    ADD COLUMN tanques_de_aire INT DEFAULT 0,
    ADD COLUMN luces_direccionales_delanteras INT DEFAULT 0,
    ADD COLUMN luces_direccionales_traseras INT DEFAULT 0,
    ADD COLUMN humo INT DEFAULT 0,
    ADD COLUMN gobernado INT DEFAULT 0,
    ADD COLUMN evidencia1 VARCHAR(512) DEFAULT '',
    ADD COLUMN evidencia2 VARCHAR(512) DEFAULT '',
    ADD COLUMN comentarios VARCHAR(512) DEFAULT '';