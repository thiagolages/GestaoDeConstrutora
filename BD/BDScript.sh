#!/bin/bash

sqlite3 database.db ".read ./SQL_Scripts/drop.sql"
sqlite3 database.db ".read ./SQL_Scripts/clientes.sql"
sqlite3 database.db ".read ./SQL_Scripts/funcionarios.sql"
sqlite3 database.db ".read ./SQL_Scripts/fornecedores.sql"
sqlite3 database.db ".read ./SQL_Scripts/orcamentos.sql"
sqlite3 database.db ".read ./SQL_Scripts/obras.sql"
sqlite3 database.db ".read ./SQL_Scripts/transacoes.sql"
sqlite3 database.db ".read ./SQL_Scripts/documentos.sql"
sqlite3 database.db ".read ./SQL_Scripts/clientes_obras.sql"
sqlite3 database.db ".read ./SQL_Scripts/fornecedores_obras.sql"
