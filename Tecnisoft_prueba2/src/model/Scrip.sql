CREATE DATABASE Prueba_2;
 
USE Prueba_2;

drop database Prueba_2;

CREATE TABLE tipoUsuario(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo NVARCHAR(10)
); -- SELECT * FROM tipoUsuario;

INSERT INTO tipoUsuario VALUES(NULL,"Admin");

CREATE TABLE tipoVivienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo NVARCHAR(30)
); -- SELECT * FROM tipoVivienda;
 
CREATE TABLE usuario(
    run NVARCHAR(30) PRIMARY KEY,
    nombre NVARCHAR(30),
    fk_tipoUsu INT,
    FOREIGN KEY(fk_tipoUsu) REFERENCES tipoUsuario(id)
); -- SELECT * FROM usuario;
 

 
CREATE TABLE vivienda(
    num_rol NVARCHAR(30) PRIMARY KEY,
    direccion NVARCHAR(50),
    cantPiezas INT,
    cantBaNos INT,
    fk_tipoVivienda INT,
    FOREIGN KEY(fk_tipoVivienda) REFERENCES tipoVivienda(id),
    precio INT,
    nueva BOOLEAN
); -- SELECT * FROM vivienda;
 
 
CREATE TABLE cliente(
    run NVARCHAR(30) PRIMARY KEY,
    nombre NVARCHAR(50),
    sueldo INT
); -- SELECT * FROM cliente;
 
CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_vivienda NVARCHAR(30),
    fk_cliente NVARCHAR(30),
    fk_usuario NVARCHAR(30),
    FOREIGN KEY(fk_vivienda)REFERENCES vivienda(num_rol),
    FOREIGN KEY(fk_cliente) REFERENCES cliente(run),
    FOREIGN KEY(fk_usuario) REFERENCES usuario(run),
    fecha DATE
   
); -- SELECT * FROM venta;
 
CREATE TABLE restauracion(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    hora TIME
);