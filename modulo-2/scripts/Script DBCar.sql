
ALTER TABLE ALUGUEL
    MODIFY (DIADOALUGUEL NUMBER, DIADAENTREGA NUMBER)

ALTER TABLE CLIENTE ADD ID_USUARIO NUMBER NOT NULL

SELECT * FROM CLIENTE

DROP TABLE CLIENTE


CREATE TABLE USUARIO (
                         id_usuario NUMBER NOT NULL,
                         nome VARCHAR2(200) NOT NULL,
                         PRIMARY KEY (id_usuario)
);

CREATE TABLE FUNCIONARIO (
                             id_funcionario NUMBER(38) NOT NULL,
                             matricula VARCHAR2(100) UNIQUE NOT NULL,
                             id_usuario NUMBER NOT NULL,
                             PRIMARY KEY (id_funcionario),
                             CONSTRAINT FK_USUARIO FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO (ID_USUARIO)
);

CREATE TABLE CLIENTE (
                         id_cliente NUMBER(38) NOT NULL,
                         cpf VARCHAR2(14) UNIQUE NOT NULL,
                         telefone VARCHAR2(14) NOT NULL,
                         endereco VARCHAR2(200) NOT NULL,
                         saldo DECIMAL(8,2) NOT NULL,
                         id_usuario NUMBER NOT NULL,
                         PRIMARY KEY (id_cliente),
                         CONSTRAINT FK_USUARIO_CLIENTE FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO (ID_USUARIO)
);


CREATE TABLE ALUGUEL (
                         id_aluguel NUMBER(38) NOT NULL,
                         id_cliente NUMBER(38) NOT NULL,
                         id_carro NUMBER(38) NOT NULL,
                         diaDoAluguel NUMBER NOT NULL,
                         diaDaEntrega NUMBER NOT NULL,
                         PRIMARY KEY (id_aluguel),
                         CONSTRAINT FK_CLIENTE_ALUGUEL FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE)
);

CREATE TABLE VEM_SER.CARRO (
                               id_carro NUMBER(38) NOT NULL,
                               alugado CHAR(1),
                               nome VARCHAR2(200) NOT NULL,
                               marca VARCHAR2(200) NOT NULL,
                               classe CHAR(1) NOT NULL,
                               quantidade_passageiros NUMBER(38) NOT NULL,
                               km_rodados NUMBER(38) NOT NULL,
                               valor_diaria DECIMAL(8,2) NOT NULL,
                               PRIMARY KEY (id_carro),
);

CREATE SEQUENCE SEQ_USUARIO
    START WITH 1
    INCREMENT BY 1
    NOCACHE NOCYCLE;

CREATE SEQUENCE SEQ_FUNCIONARIO
    START WITH 1
    INCREMENT BY 1
    NOCACHE NOCYCLE;

CREATE SEQUENCE SEQ_CLIENTE
    START WITH 1
    INCREMENT BY 1
    NOCACHE NOCYCLE;

CREATE SEQUENCE SEQ_ALUGUEL
    START WITH 1
    INCREMENT BY 1
    NOCACHE NOCYCLE;

CREATE SEQUENCE SEQ_CARRO
    START WITH 1
    INCREMENT BY 1
    NOCACHE NOCYCLE;


INSERT INTO USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'João');

INSERT INTO USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Paulo');

INSERT INTO USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Willian');

INSERT INTO USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Pedro');

INSERT INTO USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Felipe');

INSERT INTO USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Ana Barbara');

INSERT INTO USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Maria Clara');

INSERT INTO VEMSER_WILLIAN.USUARIO (ID_USUARIO, NOME) VALUES (VEMSER_WILLIAN.SEQ_USUARIO.nextval, 'Fernando');

INSERT INTO VEMSER_WILLIAN.USUARIO (ID_USUARIO, NOME) VALUES (VEMSER_WILLIAN.SEQ_USUARIO.nextval, 'Marcos');

INSERT INTO VEMSER_WILLIAN.USUARIO (ID_USUARIO, NOME) VALUES (VEMSER_WILLIAN.SEQ_USUARIO.nextval, 'Antônio');
-----------------------------------------------------------------------------------

-- INSERT'S DOS FUNCIONARIOS;
----------------------------------------------------------------------------------------------
INSERT INTO FUNCIONARIO (ID_FUNCIONARIO, ID_USUARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, 1, '12141');

INSERT INTO FUNCIONARIO (ID_FUNCIONARIO, ID_USUARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, 2, '12142');

INSERT INTO FUNCIONARIO (ID_FUNCIONARIO, ID_USUARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, 3, '12143');

INSERT INTO FUNCIONARIO (ID_FUNCIONARIO, ID_USUARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, 4, '12144');
----------------------------------------------------------------------------------------------

-- INSERT'S DOS CLIENTES;
--------------------------------------------------------------------------------------------------
INSERT INTO CLIENTE (ID_CLIENTE, ID_USUARIO, CPF, TELEFONE, ENDERECO, SALDO) VALUES (SEQ_CLIENTE.nextval, 5, '000.111.000-10', '(61)99999-9999', 'Rua Presidente Dutra, 09, Centro', 800);

INSERT INTO CLIENTE (ID_CLIENTE, ID_USUARIO, CPF, TELEFONE, ENDERECO, SALDO) VALUES (SEQ_CLIENTE.nextval, 5, '000.222.000-12', '(61)99999-9998', 'Rua Presidente Dutra, 154, Bairro Maria Cândida', 1500);

INSERT INTO CLIENTE (ID_CLIENTE, ID_USUARIO, CPF, TELEFONE, ENDERECO, SALDO) VALUES (SEQ_CLIENTE.nextval, 6, '000.333.000-23', '(61)99999-9997', 'Avenida Antônio Carlos Guimar�es, 154A, Centro', 2100);

INSERT INTO CLIENTE (ID_CLIENTE, ID_USUARIO, CPF, TELEFONE, ENDERECO, SALDO) VALUES (SEQ_CLIENTE.nextval, 7, '000.444.000-34', '(61)99999-9996', 'Avenida Boolevard, apartamento 1001, Parque dos Viajantes', 3400);

INSERT INTO CLIENTE (ID_CLIENTE, ID_USUARIO, CPF, TELEFONE, ENDERECO, SALDO) VALUES (SEQ_CLIENTE.nextval, 7, '000.555.000-45', '(61)99999-9995', 'Avenida das Flores, apartamento 505, Praça das Flores', 1300);
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------

-- INSERT'S DA LISTA DE CARRO;
---------------------------------------------------------------------------------------------------
INSERT INTO CARRO (ID_CARRO, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA) VALUES(SEQ_CARRO.nextval, 'N', 'P�lio', 'Fiat', 'C', 5, 20000, 200);

INSERT INTO CARRO (ID_CARRO, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA) VALUES(SEQ_CARRO.nextval, 'N', 'Gol', 'Volkswagen', 'C', 5, 25000, 300);

INSERT INTO CARRO (ID_CARRO, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA) VALUES(SEQ_CARRO.nextval, 'N', 'Onix', 'Chevrolet', 'C', 5, 30000, 400);

INSERT INTO CARRO (ID_CARRO, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA) VALUES(SEQ_CARRO.nextval, 'N', 'Compass', 'Jeep', 'B', 5, 10000, 500);

INSERT INTO CARRO (ID_CARRO, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA)
VALUES(SEQ_CARRO.nextval, 'N', 'Civic', 'Honda', 'B', 5, 10000, 500);

INSERT INTO CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA)
VALUES(SEQ_CARRO.nextval, 'N', 'T-Cross', 'Volkswagen', 'B', 5, 15000, 400);

INSERT INTO CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA)
VALUES(SEQ_CARRO.nextval, 'N', 'Elegance', 'Mercedes-Benz', 'A', 5, 20000, 500);

INSERT INTO CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA)
VALUES(SEQ_CARRO.nextval, 'N', '911 GTS', 'Porsche', 'A', 5, 5000, 1000);

INSERT INTO CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA)
VALUES(SEQ_CARRO.nextval, 'N', 'Shelby GT500', 'Mustang', 'A', 5, 5000, 900);



SELECT * FROM VEM_SER.ALUGUEL
SELECT * FROM VEM_SER.CLIENTE
SELECT * FROM VEM_SER.CARRO
SELECT * FROM VEM_SER.FUNCIONARIO
SELECT * FROM VEM_SER.USUARIO
