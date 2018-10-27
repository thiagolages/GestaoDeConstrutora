DROP TABLE IF EXISTS Fornecedores_Obras;
DROP TABLE IF EXISTS Clientes_Obras;
DROP TABLE IF EXISTS Documentos;
DROP TABLE IF EXISTS Transacoes;
DROP TABLE IF EXISTS Obras;
DROP TABLE IF EXISTS Funcionarios;
DROP TABLE IF EXISTS Clientes;
DROP TABLE IF EXISTS Orcamentos;
DROP TABLE IF EXISTS Fornecedores;


CREATE TABLE Funcionarios
(
  func_id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome  TEXT NOT NULL,
  permissao INTEGER NOT NULL,
  salario REAL NOT NULL,
  departamento TEXT NOT NULL,
  senha TEXT NOT NULL DEFAULT "senha123"
);

CREATE TABLE Clientes
(
  client_id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome  TEXT NOT NULL,
  permissao INTEGER NOT NULL DEFAULT 0,
  senha TEXT NOT NULL DEFAULT "senha123"
);

CREATE TABLE Fornecedores
(
  forn_id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome  TEXT NOT NULL,
  produtos TEXT NOT NULL
);

CREATE TABLE Orcamentos
(
  orc_id INTEGER PRIMARY KEY AUTOINCREMENT,
  custo REAL NOT NULL,
  lista TEXT NOT NULL,
  data_entrega TEXT NOT NULL,
  status_material TEXT NOT NULL DEFAULT "Aguardando Aprovação do Orçamento",
  status_pagamento TEXT NOT NULL DEFAULT "Aguardando Aprovação do Orçamento",
  num_aps INT NOT NULL,
  preco_ap REAL NOT NULL
);

CREATE TABLE Obras
(
  obra_id INTEGER PRIMARY KEY AUTOINCREMENT,
  local TEXT NOT NULL,
  tipo INTEGER NOT NULL,
  num_aps_disp INTEGER NOT NULL,
  status TEXT NOT NULL,
  gerente_id INTEGER NOT NULL,
  engenheiro_id INTEGER NOT NULL,
  financeiro_id INTEGER NOT NULL,
  orc_id INTEGER NOT NULL,
    FOREIGN KEY (gerente_id) REFERENCES Funcionarios(func_id),
    FOREIGN KEY (engenheiro_id) REFERENCES Funcionarios(func_id),
    FOREIGN KEY (financeiro_id) REFERENCES Funcionarios(func_id),
    FOREIGN KEY (orc_id) REFERENCES Orcamentos(orc_id)
);


CREATE TABLE Transacoes
(
  trans_id INTEGER PRIMARY KEY AUTOINCREMENT,
  status INTEGER NOT NULL,
  preco REAL NOT NULL,
  prazo TEXT NOT NULL,
  descricao TEXT NOT NULL,
  obra_id INTEGER NOT NULL,
    FOREIGN KEY (obra_id) REFERENCES Obras(obra_id)
);

CREATE TABLE Documentos
(
  doc_id INTEGER PRIMARY KEY AUTOINCREMENT,
  endereco TEXT NOT NULL,
  titulo TEXT NOT NULL,
  func_id INTEGER NOT NULL,
  trans_id INTEGER NOT NULL,
    FOREIGN KEY (func_id) REFERENCES Funcionarios(func_id),
    FOREIGN KEY (trans_id) REFERENCES Transacoes(trans_id)
);


CREATE TABLE Clientes_Obras
(
  client_id INTEGER NOT NULL,
  obra_id INTEGER NOT NULL,
    FOREIGN KEY (client_id) REFERENCES Clientes(client_id),
    FOREIGN KEY (obra_id) REFERENCES Obras(obra_id)
    PRIMARY KEY (client_id, obra_id)
);


CREATE TABLE Fornecedores_Obras
(
  forn_id INTEGER NOT NULL,
  obra_id INTEGER NOT NULL,
    FOREIGN KEY (forn_id) REFERENCES Fornecedores(forn_id),
    FOREIGN KEY (obra_id) REFERENCES Obras(obra_id),
    PRIMARY KEY (forn_id, obra_id)
);
