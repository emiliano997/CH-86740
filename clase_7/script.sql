-- Mostrar todas las bases de datos
SHOW databases;

-- Crear base de datos
CREATE DATABASE coderhouse;

-- Utilizar una base de datos
USE coderhouse;

-- Crear tabla
CREATE TABLE alumnos (
	nombre VARCHAR(150) NOT NULL,
	apellido VARCHAR(150) NOT NULL,
    dni INT NOT NULL,
    legajo INT NOT NULL
);

-- Detallar tabla
DESCRIBE alumnos;

-- Mostrar tablas (usar la sentencia USE previamente)
SHOW TABLES;

-- Insertar datos
INSERT INTO alumnos (nombre, apellido, dni, legajo)
VALUES ("Ramiro", "Moscarelli", 12345678, 563),
("Anderson", "Ocaña", 12345679, 564);

-- Obtener datos
SELECT nombre, apellido FROM alumnos; -- Obtener datos de columnas especificas
SELECT * FROM alumnos; -- Obtener todos los datos de todas las columnas y registros

-- Where -> Condicion
SELECT * FROM alumnos WHERE legajo > 560;

-- Modificar una tabla
-- ALTER TABLE alumnos ADD fecha_nacimiento datetime DEFAULT(current_date);
ALTER TABLE alumnos ADD fecha_nacimiento VARCHAR(10);

-- Modificar un registro de la tabla
UPDATE alumnos SET fecha_nacimiento = "10/05/2006" WHERE legajo = 563;
UPDATE alumnos SET fecha_nacimiento = "15/03/1991" WHERE legajo = 564;

-- Relaciones
-- Creamos la tabla nota_alumno
CREATE TABLE nota_alumnos (
	dni INT NOT NULL,
    nota INT NOT NULL
);

INSERT INTO nota_alumnos (dni, nota) 
VALUES (12345678, 8),
(12345679, 8);

SELECT * FROM nota_alumnos;

-- Join
SELECT A.dni, A.nombre, A.apellido, A.legajo, NA.nota FROM alumnos AS A
INNER JOIN nota_alumnos AS NA
ON A.dni = NA.dni;

CREATE TABLE cursos(
	dni INT NOT NULL,
    curso VARCHAR(100) NOT NULL
);

INSERT INTO cursos(dni, curso)
VALUES (12345678, 'Java'),
(12345678, 'PHP'),
(12345679, 'Angular');

SELECT * FROM cursos;

SELECT * FROM alumnos
INNER JOIN cursos
ON alumnos.dni = cursos.dni;

-- Delete
DELETE FROM cursos WHERE curso = "PHP";