CREATE TABLE Documentos
(
  doc_id INTEGER PRIMARY KEY AUTOINCREMENT,
  arquivo TEXT NOT NULL,
  tipo INT NOT NULL DEFAULT 0,
  status TEXT NOT NULL DEFAULT "Enviado para Pagamento",
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

INSERT INTO Documentos(arquivo, func_id, trans_id) VALUES
("Documento de Compra de Terreno Obra Rua dos Loucos", 2, 1),
("Documento de Compra de Terreno Obra Avenida Inexistente", 7, 2);
