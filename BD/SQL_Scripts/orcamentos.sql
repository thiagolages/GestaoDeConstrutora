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

INSERT INTO Orcamentos(custo, lista, data_entrega, num_aps, preco_ap) VALUES
(
  100000,
  "1000 kilos de cimento, 500 tijolos, 30 acabeamentos, 15 mão de obra",
  "10/12/2018",
  10,
  20000
);

INSERT INTO Orcamentos(custo, lista, data_entrega, status_material, status_pagamento, num_aps, preco_ap) VALUES
(
  500000,
  "5000 kilos de cimento, 2500 tijolos, 150 acabeamentos, 30 mão de obra",
  "10/10/2018",
  "Pagamentos Realizados",
  "Materiais entregues",
  30,
  40000
);
