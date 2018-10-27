CREATE TABLE Clientes_Obras
(
  client_id INTEGER NOT NULL,
  obra_id INTEGER NOT NULL,
    FOREIGN KEY (client_id) REFERENCES Clientes(client_id),
    FOREIGN KEY (obra_id) REFERENCES Obras(obra_id),
    PRIMARY KEY (client_id, obra_id)
);

INSERT INTO Clientes_Obras(client_id, obra_id) VALUES
(1,1),
(2,1),
(3,2),
(4,2),
(5,2),
(6,2),
(7,2),
(8,2),
(9,2),
(10,2),
(11,2),
(12,2),
(13,2),
(14,2),
(15,2),
(16,2);
