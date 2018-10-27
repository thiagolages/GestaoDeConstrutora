
CREATE TABLE Fornecedores
(
  forn_id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome  TEXT NOT NULL,
  produtos TEXT NOT NULL
);


INSERT INTO Fornecedores(nome, produtos) VALUES
("Cimentos Qualidade","Cimento"),
("Mentos Cimentos","Cimento"),
("Tijolos Três Pquinhos","Tijolo"),
("Tio Jolo Tijolos","Tijolo"),
("Vigas Vigarista","Vigas"),
("Vigário Vigas","Vigas"),
("Acabou Acabamentos","Acabamentos"),
("Acabamentos Já era","Acabamentos"),
("Contrate um Pedreiro","Mão de Obra"),
("Pedreiraria","Mão de Obra");
