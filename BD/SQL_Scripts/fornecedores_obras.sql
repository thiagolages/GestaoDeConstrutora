CREATE TABLE Fornecedores_Obras
(
  forn_id INTEGER NOT NULL,
  obra_id INTEGER NOT NULL,
    FOREIGN KEY (forn_id) REFERENCES Fornecedores(forn_id),
    FOREIGN KEY (obra_id) REFERENCES Obras(obra_id),
    PRIMARY KEY (forn_id, obra_id)
);

INSERT INTO Fornecedores_Obras(forn_id,obra_id) VALUES
(1,2),
(3,2),
(5,2),
(7,2),
(9,2);
