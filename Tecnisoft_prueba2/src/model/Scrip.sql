
CREATE DATABASE Prueba_2;
 
USE Prueba_2;
 
CREATE TABLE tipoUsuario(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(10)
); -- SELECT * FROM tipoUsuario;
 
CREATE TABLE tipoVivienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(30)
); -- SELECT * FROM tipoVivienda;
 
--INSERT INTO tipoVivienda VALUES(NULL,'Casa'),(NULL,'Departamento');
 
--INSERT INTO tipoUsuario VALUES(NULL, 'Administrador'),(NULL, 'Vendedor');
 
CREATE TABLE usuario(
    run VARCHAR(30) PRIMARY KEY,
    nombre VARCHAR(30)
    fk_tipoUsu REFERENCES tipoUsuario(id)
); -- SELECT * FROM usuario;
 
INSERT INTO usuario VALUES(NULL,'11-1','admin',1);
 
CREATE TABLE vivienda(
    num_rol VARCHAR(30) PRIMARY KEY,
    direccion VARCHAR(50),
    cantPiezas INT,
    cantBaNos INT,
    fk_tipoVivienda INT  REFERENCES tipoVivienda(id),
    precio INT,
    nueva BOOLEAN
); -- SELECT * FROM vivienda;
 
 
CREATE TABLE cliente(
    run VARCHAR(30) PRIMARY KEY,
    nombre VARCHAR(50),
    sueldo INT
); -- SELECT * FROM cliente;
 
CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_vivienda INT REFERENCES vivienda(id),
    fk_cliente INT REFERENCES cliente(id),
    fk_usuario INT REFERENCES usuario(run),
    fecha DATE
   
); -- SELECT * FROM venta;
 
CREATE TABLE restauracion(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    hora TIME
   
); -- SELECT * FROM restauracion;