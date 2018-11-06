package gestaoDeConstrutora.BancoDeDados;

import java.util.ArrayList;

import gestaoDeConstrutora.SubsistemaClientes.Cliente;
import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaObras.Fornecedor;
import gestaoDeConstrutora.SubsistemaObras.Obra;
import gestaoDeConstrutora.SubsistemaOrcamento.Orcamento;
import gestaoDeConstrutora.SubsistemaOrcamento.Transacao;
import gestaoDeConstrutora.Util.Documento;

public interface InterfaceBD 
{
	
	//CRUD Obra
	
	public Obra getObraPorID(int id);
	
	public void updateObra(Obra obra);
	
	public void createObra(Obra obra);
	
	public void deleteObra(Obra obra);
	
	public Obra deleteObraPorID(int id);
	
	public void mudarStatus(int id, String novoStatus);
	
	public ArrayList<Obra> getObras();
	
	
	//CRUD Cliente
	
	public ArrayList<Cliente> getClientes();
	
	public Cliente getClientePorID(int id);
	
	public void updateCliente(Cliente cliente);
	
	public void createCliente(Cliente cliente);
	
	public void deleteCliente(Cliente cliente);
	
	public Cliente deleteClientePorID(int id);
	
	ArrayList<Cliente> getClientePorObra(int idObra);
	
	
	//CRUD Funcionário
	
	public ArrayList<Funcionario> getFuncionarios();
	
	public Funcionario getFuncionarioPorID(int id);
	
	public void updateFuncionario(Funcionario funcionario);
	
	public void createFuncionario(Funcionario funcionario);
	
	public void deleteFuncionario(Funcionario funcionario);
	
	public Funcionario deleteFuncionarioPorID(int id);
	
	
	//CRUD Fornecedor
	
	public Fornecedor getFornecedorPorID(int id);
	
	public void updateFornecedor(Fornecedor fornecedor);
	
	public void createFornecedor(Fornecedor fornecedor);
	
	public void deleteFornecedor(Fornecedor fornecedor);
	
	public Fornecedor deleteFornecedorPorID(int id);
	
	public ArrayList<Fornecedor> getFornecedorPorObra(int idObra);
	
	public ArrayList<Fornecedor> getFornecedores();
	
	
	//CRUD Orcamento
	
	public Orcamento getOrcamentoPorID(int id);
	
	public void updateOrcamento(Orcamento orcamento);
	
	public void createOrcamento(Orcamento orcamento);
	
	public void deleteOrcamento(Orcamento orcamento);
	
	public Orcamento deleteOrcamentoPorID(int id);
	
	public ArrayList<Orcamento> getOrcamentos();
	
	
	//CRUD Transacao
	
	public Transacao getTransacaoPorID(int id);
	
	public void updateTransacao(Transacao transacao);
	
	public void createTransacao(Transacao transacao);
	
	public void deleteTransacao(Transacao transacao);
	
	public Transacao deleteTransacaoPorID(int id);
	
	public ArrayList <Transacao> getTransacaoPorObra(int idObra);
	
	
	//CRUD Documento
	
	public Documento getDocumentoPorID(int id);
	
	public void updateDocumento(Documento documento);
	
	public void createDocumento(Documento documento);
	
	public void deleteDocumento(Documento documento);
	
	public Documento deleteDocumentoPorID(int id);
	
	ArrayList<Documento> getDocumentoPorObra(int idObra);
	
}
