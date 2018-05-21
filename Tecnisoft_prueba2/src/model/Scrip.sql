CREATE DATABASE Prueba_2;
 
USE Prueba_2;

/*
drop database Prueba_2;
*/

CREATE TABLE tipoUsuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(30)
); -- SELECT * FROM tipoUsuario;

INSERT INTO tipoUsuario VALUES(NULL,'admin');
INSERT INTO tipoUsuario VALUES(NULL,'vendedor');

CREATE TABLE tipoVivienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo NVARCHAR(30)
); -- SELECT * FROM tipoVivienda;+

INSERT INTO tipoVivienda VALUES(NULL,'Departamento');
INSERT INTO tipoVivienda VALUES(NULL,'Casa');

 
CREATE TABLE usuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run NVARCHAR(30),
    nombre NVARCHAR(30),
    fk_tipoUsu INT,
    FOREIGN KEY(fk_tipoUsu) REFERENCES tipoUsuario(id) ON DELETE CASCADE
); -- SELECT * FROM usuario;
 
INSERT INTO usuario VALUES(NULL,'11-1','Administrador',1);
INSERT INTO usuario VALUES(NULL,'22-2','Vendedor',2);
 
CREATE TABLE vivienda(
    num_rol NVARCHAR(30) PRIMARY KEY,
    direccion NVARCHAR(50),
    cantPiezas INT,
    cantBaNos INT,
    fk_tipoVivienda INT,
    FOREIGN KEY(fk_tipoVivienda) REFERENCES tipoVivienda(id) ON DELETE CASCADE,
    precio INT,
    nueva BOOLEAN
); -- SELECT * FROM vivienda;

Insert into vivienda Values
 
 
CREATE TABLE cliente(
    run NVARCHAR(30) PRIMARY KEY,
    nombre NVARCHAR(50),
    sueldo INT
); -- SELECT * FROM cliente;
 
CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_vivienda NVARCHAR(30),
    fk_cliente NVARCHAR(30),
    fk_usuario INT,
    FOREIGN KEY(fk_vivienda)REFERENCES vivienda(num_rol) ON DELETE CASCADE,
    FOREIGN KEY(fk_cliente) REFERENCES cliente(run) ON DELETE CASCADE,
    FOREIGN KEY(fk_usuario) REFERENCES usuario(id) ON DELETE CASCADE,
    fecha DATE
   
); -- SELECT * FROM venta;
 
CREATE TABLE restauracion(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    hora TIME
);

-- CREATE TABLE actividad(
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     fecha DATE,
-- );