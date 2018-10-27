
CREATE TABLE Clientes
(
  client_id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome  TEXT NOT NULL,
  permissao INTEGER NOT NULL DEFAULT 0,
  senha TEXT NOT NULL DEFAULT "senha123"
);


INSERT INTO Clientes(nome) VALUES
("João"),
("Luis"),
("Luvison"),
("Leila"),
("Luana"),
("Lucas"),
("Joice"),
("Joana"),
("Josenisse"),
("Juliana"),
("Jeremias"),
("Jorge"),
("José"),
("Julio"),
("Julia"),
("Maria");
