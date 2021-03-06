package gestaoDeConstrutora.Testes;

import java.util.ArrayList;

import gestaoDeConstrutora.BancoDeDados.InterfaceBD;
import gestaoDeConstrutora.SubsistemaClientes.Cliente;
import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaObras.Fornecedor;
import gestaoDeConstrutora.SubsistemaObras.Obra;
import gestaoDeConstrutora.SubsistemaOrcamento.Orcamento;
import gestaoDeConstrutora.SubsistemaOrcamento.Transacao;
import gestaoDeConstrutora.Util.Documento;

public class BDMock implements InterfaceBD {

	private ArrayList<Cliente> clientesArmazenados;
	private ArrayList<Funcionario> funcionariosArmazenados;
	
	public void setClientesArmazenados(ArrayList<Cliente> clientesArmazenados) {
		this.clientesArmazenados = clientesArmazenados;
	}
	
	public void setFuncionariosArmazenados(ArrayList<Funcionario> funcionariosArmazenados) {
		this.funcionariosArmazenados = funcionariosArmazenados;
	}

	@Override
	public Obra getObraPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateObra(Obra obra) 
	{
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
		// TODO Auto-generated method stub
	}
	
	@Override
	public ArrayList<Obra> getObras() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ArrayList<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return clientesArmazenados;
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
	public ArrayList<Funcionario> getFuncionarios() {
		// TODO Auto-generated method stub
		return funcionariosArmazenados;
	}
	
	@Override
	public Funcionario getFuncionarioPorID(int id) {
		// TODO Auto-generated method stub
		return null;
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
	
	public ArrayList<Orcamento> getOrcamentos(){
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
		return null;
	}

	@Override
	public ArrayList<Cliente> getClientePorObra(int idObra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Documento> getDocumentoPorObra(int idObra) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ArrayList<Fornecedor> getFornecedorPorObra(int idObra) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<Fornecedor> getFornecedores(){
		// TODO Auto-generated method stub
		return null;
	}
}
