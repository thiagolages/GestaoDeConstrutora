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

/*
  Gestor: 5
  Gerentes: 4
  Engeheiros: 1, 6
  Financeiro: 2, 7

  Transacoes: 1, 2 (Compra de Terreno);
*/

INSERT INTO Documentos(endereco, titulo, func_id, trans_id) VALUES
("home/user/Documents","Documento de Compra de Terreno Obra Rua dos Loucos", 2, 1),
("home/user/Documents","Documento de Compra de Terreno Obra Avenida Inexistente", 7, 2);
