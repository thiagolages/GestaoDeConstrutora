package gestaoDeConstrutora.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;

import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaObras.Obra;

public class DBtest {

	public static void main(String[] args) {
		BD db = new BD();
		Obra x = db.getObraPorID(1);
		//System.out.println(x.getNome());
	}

}
