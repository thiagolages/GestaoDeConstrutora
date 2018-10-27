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
  orc_id INTEGER,
    FOREIGN KEY (gerente_id) REFERENCES Funcionarios(func_id),
    FOREIGN KEY (engenheiro_id) REFERENCES Funcionarios(func_id),
    FOREIGN KEY (financeiro_id) REFERENCES Funcionarios(func_id),
    FOREIGN KEY (orc_id) REFERENCES Orcamentos(orc_id)
);

/*
  Gerentes: 4
  Engeheiros: 1, 6
  Financeiro: 2, 7
  Orçamentos: 1 (Ñ aprovado)
              2 (Aprovado)
*/

INSERT INTO Obras(local, tipo, num_aps_disp, status, gerente_id,engenheiro_id,financeiro_id,orc_id) VALUES
(
  "Rua dos  Loucos, número 0",
  "Construção",
  8,
  "Aguardando aprovação de Orçamento",
  4,
  1,
  2,
  1
),
(
  "Avenida inexistente, número 3,14",
  "Construção",
  18,
  "Obra em execução",
  4,
  6,
  7,
  2
);
