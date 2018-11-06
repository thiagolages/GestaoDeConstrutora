package gestaoDeConstrutora.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaObras.Obra;

public class DBtest {

	public static void main(String[] args) {
		BD db = new BD();
		ArrayList<Obra> x = db.getObras();
		System.out.println(x.get(1).getLocalizacao());
	}

}
