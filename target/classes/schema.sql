CREATE DATABASE IF NOT EXISTS translog;

USE translog;


-- TABLA: cuentaAnual_processed

CREATE TABLE IF NOT EXISTS cuentaAnual_processed (
    cuentaId INT PRIMARY KEY,
    fecha VARCHAR(50),
    transaccion VARCHAR(100),
    monto DOUBLE,
    descripcion VARCHAR(255)
);

-- TABLA: interes_processed

CREATE TABLE IF NOT EXISTS interes_processed (
    cuentaId INT,
    nombre VARCHAR(150),
    saldoOriginal DOUBLE,
    edad INT,
    tipo VARCHAR(50),
    interesAplicado DOUBLE,
    saldoFinal DOUBLE
);


-- TABLA: transaccion_processed

CREATE TABLE IF NOT EXISTS transaccion_processed (
    id INT PRIMARY KEY,
    fecha VARCHAR(50),
    monto DOUBLE,
    tipo VARCHAR(50),
    estado VARCHAR(50)
);