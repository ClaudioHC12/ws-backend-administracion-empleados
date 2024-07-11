--- Creacion de Base de Batos ---
DROP DATABASE IF EXISTS admin_empleados;
CREATE DATABASE admin_empleados;

--- Creacion de Tabla Estado ---
DROP TABLE IF EXISTS estado;
CREATE TABLE estado(
	id_estado SERIAL PRIMARY KEY,
	nombre VARCHAR(30) NOT NULL
);

--- Creacion de Tabla Municipio ---
DROP TABLE IF EXISTS municipio;
CREATE TABLE municipio(
	id_municipio SERIAL NOT NULL,
	id_estado INTEGER NOT NULL REFERENCES estado(id_estado),
	nombre VARCHAR(30) NOT NULL,
	PRIMARY KEY(id_estado, id_municipio)
);

--- Creacion de Tabla Empleado ---
DROP TABLE IF EXISTS empleado;
CREATE TABLE empleado(
	id_empleado SERIAL PRIMARY KEY,
	nombre VARCHAR(30) NOT NULL,
	email VARCHAR(40) NOT NULL CHECK (email ~* '^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'),
	fecha_nacimiento DATE NOT NULL,
	id_estado INTEGER NOT NULL,
	id_municipio INTEGER NOT NULL,
	fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (id_estado, id_municipio) REFERENCES municipio(id_estado, id_municipio)
);

--- Insert en Tabla Estado ---
INSERT INTO estado(nombre) VALUES
	('Coahuila'),
	('Nuevo Leon'),
	('Durango ')
	RETURNING *;
	
--- Insert en Tabla Municipio ---
INSERT INTO municipio(id_estado, nombre) VALUES
	(1, 'San Pedro'),
	(1, 'Torreon'),
	(1, 'Ramos Arizpe'),
	(2, 'Monterrey'),
	(2, 'San Pedro Garza Garcia'),
	(2, 'Guadalupe'),
	(3, 'Durango'),
	(3, 'Gomez Palacio')
	RETURNING *;
	
	
SELECT CURRENT_TIMESTAMP
SELECT * FROM estado
SELECT * FROM municipio
SELECT * FROM empleado

TRUNCATE TABLE EMPLEADO RESTART IDENTITY

INSERT INTO empleado(nombre, email, fecha_nacimiento, id_estado, id_municipio, fecha_registro)
	VALUES('ssssss','ddddd@ssss.com', '1999-10-12', 1, 19, '2024-07-10 22:43:04')