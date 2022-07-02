CREATE TABLE VEM_SER.USUARIO (
  id_usuario NUMBER NOT NULL,
  nome VARCHAR2(200) NOT NULL,
  PRIMARY KEY (id_usuario)
);
             
CREATE TABLE VEM_SER.FUNCIONARIO (
  id_funcionario NUMBER(38) NOT NULL,
  matricula VARCHAR2(100) UNIQUE NOT NULL,
  PRIMARY KEY (id_funcionario),
  CONSTRAINT FK_USUARIO FOREIGN KEY (ID_FUNCIONARIO) REFERENCES USUARIO (ID_USUARIO)
);

CREATE TABLE VEM_SER.CLIENTE (
  id_cliente NUMBER(38) NOT NULL,
  cpf VARCHAR2(14) UNIQUE NOT NULL,
  telefone VARCHAR2(14) NOT NULL,
  endere�o VARCHAR2(200) NOT NULL,
  PRIMARY KEY (id_cliente),
  CONSTRAINT FK_USUARIO_CLIENTE FOREIGN KEY (ID_CLIENTE) REFERENCES USUARIO (ID_USUARIO)
);

CREATE TABLE VEM_SER.ALUGUEL (
  id_aluguel NUMBER(38) NOT NULL,
  id_cliente NUMBER(38) NOT NULL,
  id_carro NUMBER(38) NOT NULL,
  diaDoAluguel DATE NOT NULL,
  diaDaEntrega DATE NOT NULL,
  PRIMARY KEY (id_aluguel),
  CONSTRAINT FK_CLIENTE_ALUGUEL FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE)
);

CREATE TABLE VEM_SER.CARRO (
  id_carro NUMBER(38) NOT NULL,
  id_aluguel NUMBER(38) NOT NULL,
  alugado CHAR(1),
  nome VARCHAR2(200) NOT NULL,
  marca VARCHAR2(200) NOT NULL,
  classe CHAR(1) NOT NULL,
  quantidade_passageiros NUMBER(38) NOT NULL,
  km_rodados NUMBER(38) NOT NULL,
  valor_diaria DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (id_carro),
  CONSTRAINT FK_ALUGUEL_CARRO FOREIGN KEY (ID_ALUGUEL) REFERENCES ALUGUEL (ID_ALUGUEL)
);


CREATE SEQUENCE VEM_SER.SEQ_USUARIO
START WITH 1
INCREMENT BY 1
NOCACHE NOCYCLE;

CREATE SEQUENCE VEM_SER.SEQ_FUNCIONARIO
START WITH 1
INCREMENT BY 1
NOCACHE NOCYCLE;

CREATE SEQUENCE VEM_SER.SEQ_CLIENTE
START WITH 1
INCREMENT BY 1
NOCACHE NOCYCLE;

CREATE SEQUENCE VEM_SER.SEQ_ALUGUEL
START WITH 1
INCREMENT BY 1
NOCACHE NOCYCLE;

CREATE SEQUENCE VEM_SER.SEQ_CARRO
START WITH 1
INCREMENT BY 1
NOCACHE NOCYCLE;

-- INSERT'S DOS USUARIOS;
----------------------------------------------------------------------------------
INSERT INTO VEM_SER.USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Jo�o');

INSERT INTO VEM_SER.USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Paulo');

INSERT INTO VEM_SER.USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Willian');

INSERT INTO VEM_SER.USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Pedro');

INSERT INTO VEM_SER.USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Felipe');

INSERT INTO VEM_SER.USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Ana Barbara');

INSERT INTO VEM_SER.USUARIO (ID_USUARIO, NOME) VALUES (SEQ_USUARIO.nextval, 'Maria Clara');
-----------------------------------------------------------------------------------

-- INSERT'S DOS FUNCIONARIOS;
----------------------------------------------------------------------------------------------
INSERT INTO VEM_SER.FUNCIONARIO (ID_FUNCIONARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, '12141');

INSERT INTO VEM_SER.FUNCIONARIO (ID_FUNCIONARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, '12142');

INSERT INTO VEM_SER.FUNCIONARIO (ID_FUNCIONARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, '12143');

INSERT INTO VEM_SER.FUNCIONARIO (ID_FUNCIONARIO, MATRICULA) VALUES (SEQ_FUNCIONARIO.nextval, '12144');
----------------------------------------------------------------------------------------------

-- INSERT'S DOS CLIENTES;
--------------------------------------------------------------------------------------------------
INSERT INTO VEM_SER.CLIENTE (ID_CLIENTE, CPF, TELEFONE, ENDERE�O) VALUES (SEQ_CLIENTE.nextval, '000.000.000-10', '(61)99999-9999', 'Rua Presidente Dutra, 09, Centro');

INSERT INTO VEM_SER.CLIENTE (ID_CLIENTE, CPF, TELEFONE, ENDERE�O) VALUES (SEQ_CLIENTE.nextval, '000.000.000-11', '(61)99999-9998', 'Rua Presidente Dutra, 154, Bairro Maria C�ndida');

INSERT INTO VEM_SER.CLIENTE (ID_CLIENTE, CPF, TELEFONE, ENDERE�O) VALUES (SEQ_CLIENTE.nextval, '000.000.000-22', '(61)99999-9997', 'Avenida Ant�nio Carlos Guimar�es, 154A, Centro');

INSERT INTO VEM_SER.CLIENTE (ID_CLIENTE, CPF, TELEFONE, ENDERE�O) VALUES (SEQ_CLIENTE.nextval, '000.000.000-33', '(61)99999-9996', 'Avenida Boolevard, apartamento 1001, Parque dos Viajantes');

INSERT INTO VEM_SER.CLIENTE (ID_CLIENTE, CPF, TELEFONE, ENDERE�O) VALUES (SEQ_CLIENTE.nextval, '000.000.000-44', '(61)99999-9995', 'Avenida das Flores, apartamento 505, Pra�a das Flores');
---------------------------------------------------------------------------------------------------

-- INSERT'S DOS ALUGUEIS;
---------------------------------------------------------------------------------------------------
INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 1, 1, TO_DATE('30-06-2022', 'dd-mm-yyyy'), TO_DATE('02-07-2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 1, 2, TO_DATE('10-06-2022', 'dd-mm-yyyy'), TO_DATE('15-06-2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 2, 4, TO_DATE('30/06/2022', 'dd-mm-yyyy'), TO_DATE('02-07-2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 3, 9, TO_DATE('30/06/2022', 'dd-mm-yyyy'), TO_DATE('02-07-2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 4, 6, TO_DATE('30/06/2022', 'dd-mm-yyyy'), TO_DATE('02/07/2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 2, 6, TO_DATE('30/06/2022', 'dd-mm-yyyy'), TO_DATE('02/07/2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 5, 7, TO_DATE('15/06/2022', 'dd-mm-yyyy'), TO_DATE('18/06/2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 3, 8, TO_DATE('18/06/2022', 'dd-mm-yyyy'), TO_DATE('20/06/2022', 'dd-mm-yyyy'));

INSERT INTO VEM_SER.ALUGUEL (ID_ALUGUEL, ID_CLIENTE, ID_CARRO, DIADOALUGUEL, DIADAENTREGA) VALUES (SEQ_ALUGUEL.nextval, 2, 3, TO_DATE('18/06/2022', 'dd-mm-yyyy'), TO_DATE('20/06/2022', 'dd-mm-yyyy'));
---------------------------------------------------------------------------------------------------

-- INSERT'S DA LISTA DE CARRO;
---------------------------------------------------------------------------------------------------
INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA) VALUES(SEQ_CARRO.nextval, 1, 'S', 'P�lio', 'Fiat', 'C', 5, 20000, 100);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA) VALUES(SEQ_CARRO.nextval, 2, 'S', 'Gol', 'Volkswagen', 'C', 5, 25000, 100);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA) VALUES(SEQ_CARRO.nextval, 3, 'F', 'Onix', 'Chevrolet', 'C', 5, 30000, 100);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA) VALUES(SEQ_CARRO.nextval, 4, 'S', 'Compass', 'Jeep', 'B', 5, 10000, 300);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA)
VALUES(SEQ_CARRO.nextval, 5, 'S', 'Civic', 'Honda', 'B', 5, 10000, 300);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA)
VALUES(SEQ_CARRO.nextval, 6, 'F', 'T-Cross', 'Volkswagen', 'B', 5, 15000, 300);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA)
VALUES(SEQ_CARRO.nextval, 7, 'S', 'Elegance', 'Mercedes-Benz', 'A', 5, 20000, 500);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA)
VALUES(SEQ_CARRO.nextval, 8, 'S', '911 GTS', 'Porsche', 'A', 5, 5000, 1000);

INSERT INTO VEM_SER.CARRO (ID_CARRO, ID_ALUGUEL, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, VALOR_DIARIA)
VALUES(SEQ_CARRO.nextval, 9, 'F', 'Shelby GT500', 'Mustang', 'A', 5, 5000, 500);


SELECT * FROM VEM_SER.ALUGUEL
SELECT * FROM VEM_SER.CLIENTE
SELECT * FROM VEM_SER.CARRO
SELECT * FROM VEM_SER.FUNCIONARIO
SELECT * FROM VEM_SER.USUARIO
