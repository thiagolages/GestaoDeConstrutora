package gestaoDeConstrutora.BancoDeDados;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import gestaoDeConstrutora.SubsistemaClientes.Cliente;
import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaObras.Fornecedor;
import gestaoDeConstrutora.SubsistemaObras.Obra;
import gestaoDeConstrutora.SubsistemaOrcamento.Orcamento;
import gestaoDeConstrutora.SubsistemaOrcamento.Transacao;
import gestaoDeConstrutora.Util.Documento;

public class BD implements InterfaceBD {

	@Override
	public Obra getObraPorID(int id) {
		
		SQLite db = new SQLite();
		Obra obra = null;
		try
		{
			//Conecta e realiza query
			db.connect();
			db.query("SELECT * FROM Obras WHERE obra_id = " + id);
			ResultSet res = db.getResults();
			
			//Pega resultado
			res.next();
			String local  = res.getString("local");
			String tipo  = res.getString("tipo");
			String status  = res.getString("status");
			int nAps  = res.getInt("num_aps_disp");
			int gerId  = res.getInt("gerente_id");
			int engId  = res.getInt("engenheiro_id");
			int finId  = res.getInt("financeiro_id");
			int orcId  = res.getInt("orc_id");
			
			//Procura por funcionarios
			Funcionario gerente = getFuncionarioPorID(gerId);
			Funcionario engenheiro = getFuncionarioPorID(engId);
			Funcionario financeiro = getFuncionarioPorID(finId);
			
			//Procura por orcamento e transacoes
			Orcamento orc = getOrcamentoPorID(orcId);
			ArrayList<Transacao> trans = getTransacaoPorObra(id);
					
			//Cria objeto obra e retorna-o
			//TODO criar aps totais e restantes
			obra = new Obra(id, local, tipo, nAps, nAps, gerente, engenheiro, financeiro, 
					status, orc, trans);
		}
		catch(SQLException e)
		{
			System.out.println("Erro capturado em getObraPorID");
			System.out.println(e);
		}
		finally
		{
			db.disconnect();
		}
		return obra;
	}

	@Override
	public void updateObra(Obra obra) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createObra(Obra obra) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteObra(Obra obra) {
		// TODO Auto-generated method stub

	}

	@Override
	public Obra deleteObraPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void mudarStatus(int id, String novoStatus) {
		// altera o status da obra

		SQLite db = new SQLite();
		db.connect();
		db.query("UPDATE Obras SET status = " + novoStatus + " WHERE obra_id = " + id);
		db.disconnect();
	}

	@Override
	public Cliente getClientePorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente deleteClientePorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario getFuncionarioPorID(int id) {
		SQLite db = new SQLite();
		Funcionario func= null;
		try
		{
			//Conecta e realiza query
			db.connect();
			db.query("SELECT * FROM Funcionarios WHERE func_id = " + id);
			ResultSet res = db.getResults();
			
			//Pega resultado
			res.next();
			String nome = res.getString("nome");
			String dep = res.getString("departamento");
			//TODO definir o que fazer com o campo de senha
			String senha = res.getString("senha");
			int perm = res.getInt("permissao");
			float salario = res.getFloat("salario");
			
			//TODO criar data de admissão no banco
			func  = new Funcionario(id, nome, perm, salario, new Date(), dep);
		}
		catch(SQLException e)
		{
			System.out.print(e);
		}
		finally
		{
			db.disconnect();
		}
		return func;
	}

	@Override
	public void updateFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub

	}

	@Override
	public Funcionario deleteFuncionarioPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fornecedor getFornecedorPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateFornecedor(Fornecedor fornecedor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createFornecedor(Fornecedor fornecedor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFornecedor(Fornecedor fornecedor) {
		// TODO Auto-generated method stub

	}

	@Override
	public Fornecedor deleteFornecedorPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orcamento getOrcamentoPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOrcamento(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createOrcamento(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOrcamento(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public Orcamento deleteOrcamentoPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transacao getTransacaoPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTransacao(Transacao transacao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createTransacao(Transacao transacao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTransacao(Transacao transacao) {
		// TODO Auto-generated method stub

	}

	@Override
	public Transacao deleteTransacaoPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Documento getDocumentoPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDocumento(Documento documento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createDocumento(Documento documento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDocumento(Documento documento) {
		// TODO Auto-generated method stub

	}

	@Override
	public Documento deleteDocumentoPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList <Transacao> getTransacaoPorObra(int idObra) {
		SQLite db = new SQLite();
		ArrayList<Transacao> trans = new ArrayList<Transacao>();
		try
		{
			//Conecta e realiza query
			db.connect();
			db.query("SELECT * FROM Transacoes WHERE obra_id = " + idObra);
			ResultSet res = db.getResults();
			while(res.next())
			{
				int transId = res.getInt("trans_id");
				int prazo = res.getInt("prazo");
				String status = res.getString("status");
				String desc = res.getString("descricao");
				float preco = res.getFloat("preco");
				
				Transacao thisTrans = new Transacao(transId, preco, desc, status, prazo);
				trans.add(thisTrans);
			}
		}
		catch(SQLException e)
		{
			System.out.print(e);
		}
		finally
		{
			db.disconnect();
		}
		return trans;
	}

}
