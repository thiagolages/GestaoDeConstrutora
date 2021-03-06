CREATE TABLE Transacoes
(
  trans_id INTEGER PRIMARY KEY AUTOINCREMENT,
  status TEXT NOT NULL,
  preco REAL NOT NULL,
  prazo INT NOT NULL,
  descricao TEXT NOT NULL,
  obra_id INTEGER NOT NULL,
    FOREIGN KEY (obra_id) REFERENCES Obras(obra_id)
);

/*
  Obra 1- 100.000 de gasto,
          200.000 de receita bruta,
          10 aps
          2 clientes

  Obra 2- 500.000 de gasto,
          1.200.000 de receita bruta,
          30 aps
          14 clientes

*/

INSERT INTO Transacoes(status, preco, prazo, descricao, obra_id) VALUES
(
  "Realizada no prazo",
  -10000,
  -100,
  "Compra de Terreno",
  1
),
(
  "Realizada no prazo",
  -96000,
  -1,
  "Compra de Terreno",
  2
),
(
  "Realizada no prazo",
  -96000,
  -10,
  "Compra de Cimento",
  2
),
(
  "Realizada no prazo",
  -96000,
  -10,
  "Compra de Tijolos",
  2
),
(
  "Realizada no prazo",
  -96000,
  -10,
  "Compra de Vigas",
  2
),
(
  "Realizada com atraso",
  -96000,
  -10,
  "Compra de Acabamentos",
  2
),
(
  "Atrasada",
  -96000,
  -10,
  "Contratação de Mão de obra",
  2
);
