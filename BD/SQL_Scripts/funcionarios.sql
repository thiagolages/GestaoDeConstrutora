
CREATE TABLE Funcionarios
(
  func_id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome  TEXT NOT NULL,
  permissao INTEGER NOT NULL,
  salario REAL NOT NULL,
  departamento TEXT NOT NULL,
  senha TEXT NOT NULL DEFAULT "senha123"
);


INSERT INTO Funcionarios(nome, permissao, salario, departamento) VALUES
("João",1,1000,"Engenharia"),
("Maria",2,2000,"Financeiro"),
("Ana",3,3000,"RH"),
("Lucas",4,4000,"Gerente"),
("Guilherme",5,5000,"Diretor"),
("Thiago",1,1000,"Engenharia"),
("Alice",2,2000,"Financeiro"),
("Marcelo",3,3000,"RH");
