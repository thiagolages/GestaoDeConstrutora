package gestaoDeConstrutora.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaObras.Fornecedor;
import gestaoDeConstrutora.SubsistemaObras.Obra;
import gestaoDeConstrutora.SubsistemaOrcamento.GerenciadorFinanceiro;

public class DBtest {

	public static void main(String[] args) {
		BD db = new BD();
		Obra x = db.getObraPorID(2);
		GerenciadorFinanceiro yay = x.getGerenciadorFinanceiro();
		ArrayList<Fornecedor> z = yay.coletarRespostas();
		//for(int i = 0; i < z.size(); i++)
		{
		//	System.out.println(z.get(i).getNome());
		}
	}

}
