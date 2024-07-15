drop database cocacola;

-- Crear la base de datos
CREATE DATABASE cocacola CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- Usar la base de datos
USE cocacola;

-- Crear la tabla de usuarios
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(50) NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    tipo_usuario ENUM('admin', 'tecnico', 'cliente') NOT NULL
);

-- Crear la tabla de CEDIS
CREATE TABLE cedis (
    id_cedis INT AUTO_INCREMENT PRIMARY KEY,
    nombre_cedis VARCHAR(100) NOT NULL,
    region VARCHAR(100) NOT NULL
);

-- Crear la tabla de económicos (vehículos)
CREATE TABLE economicos (
    id_economico CHAR(10) PRIMARY KEY,
    id_usuario int,
    placa VARCHAR(25),
    id_cedis INT NOT NULL,
    FOREIGN KEY (id_cedis) REFERENCES cedis(id_cedis),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Crear la tabla para registrar el estado de diversas áreas del vehículo
CREATE TABLE evaluacion (
    id_evaluacion INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario int,
    luces_galibo INT NOT NULL,
    luces_altas INT NOT NULL,
    luces_bajas INT NOT NULL,
    luces_demarcadoras_delanteras INT NOT NULL,
    luces_demarcadoras_traseras INT NOT NULL,
    luces_indicadoras INT NOT NULL,
    llantas_rines_delanteros INT NOT NULL,
    llantas_rines_traseros INT NOT NULL,
    llantas_masas_delanteras INT NOT NULL,
    llantas_masas_traseras INT NOT NULL,
    llantas_presion_delantera_izquierda INT NOT NULL,
    llantas_presion_delantera_derecha INT NOT NULL,
    llantas_presion_trasera_izquierda_1 INT NOT NULL,
    llantas_presion_trasera_izquierda_2 INT NOT NULL,
    llantas_presion_trasera_derecha_1 INT NOT NULL,
    llantas_presion_trasera_derecha_2 INT NOT NULL,
    llantas_profundidad_delantera_izquierda INT NOT NULL,
    llantas_profundidad_delantera_derecha INT NOT NULL,
    llantas_profundidad_trasera_izquierda_1 INT NOT NULL,
    llantas_profundidad_trasera_izquierda_2 INT NOT NULL,
    llantas_profundidad_trasera_derecha_1 INT NOT NULL,
    llantas_profundidad_trasera_derecha_2 INT NOT NULL,
    llantas_birlos_delantera_izquierda INT NOT NULL,
    llantas_birlos_delantera_derecha INT NOT NULL,
    llantas_birlos_trasera_izquierda INT NOT NULL,
    llantas_birlos_trasera_derecha INT NOT NULL,
    llantas_birlos_delantera_izquierda_num INT NOT NULL default 0,
    llantas_birlos_delantera_derecha_num INT NOT NULL default 0,
    llantas_birlos_trasera_izquierda_num INT NOT NULL default 0,
    llantas_birlos_trasera_derecha_num INT NOT NULL default 0,
    llantas_tuercas_delantera_izquierda INT NOT NULL,
    llantas_tuercas_delantera_derecha INT NOT NULL,
    llantas_tuercas_trasera_izquierda INT NOT NULL,
    llantas_tuercas_trasera_derecha INT NOT NULL,
    llantas_tuercas_delantera_izquierda_num INT NOT NULL default 0,
    llantas_tuercas_delantera_derecha_num INT NOT NULL default 0,
    llantas_tuercas_trasera_izquierda_num INT NOT NULL default 0,
    llantas_tuercas_trasera_derecha_num INT NOT NULL default 0,
    caja_direccion INT NOT NULL,
    deposito_aceite INT NOT NULL,
    parabrisas INT NOT NULL,
    limpiaparabrisas INT NOT NULL,
    huelgo INT NOT NULL,
    huelgo_cuanto INT NOT NULL DEFAULT 0,
    escape INT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

create table dictamen(
	id_dictamen INT primary key auto_increment,
    folio1 int,
    folio2 int,
    archivo1 varchar(512),
    archivo2 varchar(512)
);

create table dictamen_economico(
	id_economico CHAR(10),
    id_dictamen int,
    PRIMARY KEY (id_economico, id_dictamen),
    FOREIGN KEY (id_economico) REFERENCES economicos(id_economico),
    FOREIGN KEY (id_dictamen) REFERENCES dictamen(id_dictamen)
);

create table economico_evaluacion (
	id_evaluacion INT,
	id_economico CHAR(10),
    fecha_de_evaluacion datetime,
    PRIMARY KEY (id_evaluacion, id_economico),
    FOREIGN KEY (id_evaluacion) REFERENCES evaluacion(id_evaluacion),
	FOREIGN KEY (id_economico) REFERENCES economicos(id_economico)
);

-- Insertar algunos datos de ejemplo
INSERT INTO usuarios (nombre_usuario, contrasena, tipo_usuario) VALUES 
('admin1', 'contrasenaSegura', 'admin'),
('verificador1', 'contrasenaSegura', 'tecnico'),
('cliente1', 'contrasenaSegura', 'cliente');

INSERT INTO cedis (nombre_cedis, region) VALUES 
('CEDIS Norte', 'Región Norte'),
('CEDIS Sur', 'Región Sur');

INSERT INTO economicos (id_economico, id_cedis) VALUES 
('ECON123456', 1),
('ECON654321', 2);


select * from economicos;
select * from dictamen;
select * from dictamen_economico;



