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
                         folio_humo varchar(20),
                         folio_fisico varchar(20),
                         archivo_humo varchar(512),
                         archivo_fisico varchar(512)
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


-- Datos usuarios
INSERT INTO usuarios (nombre_usuario, contrasena, tipo_usuario) VALUES 
("minerva", sha2("RMAD3224641",256),"tecnico"),
("uriel", sha2("FUGA3224641",256),"tecnico"),
("esteban", sha2("EGA322464",256),"tecnico"),
("elizau", sha2("REF322464",256),"tecnico"),
("mayra", sha2("MRMA322464",256),"tecnico"),
("sayra", sha2("SMA322464",256),"tecnico"),
("samuel", sha2("SAVF322464",256),"tecnico"),
("enrique", sha2("EGR322464",256),"tecnico"),
("michelle", sha2("MLH322464",256),"tecnico");

INSERT INTO usuarios (nombre_usuario, contrasena, tipo_usuario) VALUES 
("TABASCO-7", sha2("T322464",256),"cliente"),
("VERACRUZ-8",  sha2("V322464",256),"cliente"),
("QUERETARO-9",  sha2("Q322464",256),"cliente"),
("SJDR-15",  sha2("S322464",256),"cliente"),
("TLAXCALA-8",  sha2("T322464",256),"cliente"),
("PUEBLA-6",  sha2("P322464",256),"cliente"),
("TAMAULIPAS-10",  sha2("T322464",256),"cliente"),
("CDMX-4",  sha2("C322464",256),"cliente"),
("TENANGO-7",  sha2("T322464",256),"cliente"),
("MONARCA-7",  sha2("M322464",256),"cliente"),
("TOLUCA-6",  sha2("T322464",256),"cliente"),
("GUERRERO-8",  sha2("G322464",256),"cliente"),
("OAXACA-6",  sha2("O322464",256),"cliente"),
("MORELOS-7",  sha2("M322464",256),"cliente"),
("MMCARGA-5",  sha2("M322464",256),"cliente"),
("TRAMUSA-7",  sha2("T322464",256),"cliente"),
("TJL-3",  sha2("T322464",256),"cliente"),
("GUEMES-6",  sha2("G322464",256),"cliente");