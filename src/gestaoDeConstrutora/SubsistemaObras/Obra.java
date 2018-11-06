package gestaoDeConstrutora.SubsistemaObras;


import gestaoDeConstrutora.BancoDeDados.BD;
import gestaoDeConstrutora.SubsistemaClientes.Cliente;
import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaOrcamento.GerenciadorFinanceiro;
import gestaoDeConstrutora.SubsistemaOrcamento.Orcamento;
import gestaoDeConstrutora.SubsistemaOrcamento.Transacao;
import gestaoDeConstrutora.Util.Documento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Obra {

	
	// Atributos
	private int id;
	private String localizacao;
	private String tipo;
	private int numApartamentos;
	private int numApartamentosDisponiveis;
	private Funcionario gerente;
	private Funcionario engenheiro;
	private Funcionario financeiro;
	private ArrayList<Cliente> clientes;
	private ArrayList<Documento> documentos;
	private ArrayList<Fornecedor> fornecedores;
	private GerenciadorFinanceiro gerenciadorFinanceiro;
	private String status;
	
	
	// Construtores
	public Obra (int id, String localizacao, String tipo, int numApartamentos, 
			int numApartamentosDisponiveis, Funcionario gerente, 
			Funcionario engenheiro, Funcionario financeiro,
			String status, Orcamento orcamento, ArrayList<Transacao> transacoes) {
		this.id = id;
		this.localizacao = localizacao;
		this.tipo = tipo;
		this.numApartamentos = numApartamentos;
		this.numApartamentosDisponiveis = numApartamentosDisponiveis;
		this.gerente = gerente;
		this.engenheiro = engenheiro;
		this.financeiro = financeiro;
		this.clientes = new ArrayList<Cliente>();
		this.documentos = new ArrayList<Documento>();
		this.gerenciadorFinanceiro = new GerenciadorFinanceiro(orcamento, transacoes);
		this.status = status;
	}
	
	public Obra (int id, String localizacao, String tipo, int numApartamentos, 
			int numApartamentosDisponiveis, Funcionario gerente, 
			Funcionario engenheiro, Funcionario financeiro,
			String status, Orcamento orcamento, ArrayList<Transacao> transacoes,
			ArrayList<Cliente> clientes, ArrayList<Documento> documentos, 
			ArrayList<Fornecedor> fornecedores) {
		this.id = id;
		this.localizacao = localizacao;
		this.tipo = tipo;
		this.numApartamentos = numApartamentos;
		this.numApartamentosDisponiveis = numApartamentosDisponiveis;
		this.gerente = gerente;
		this.engenheiro = engenheiro;
		this.financeiro = financeiro;
		this.gerenciadorFinanceiro = new GerenciadorFinanceiro(orcamento, transacoes);
		this.status = status;
		this.clientes = clientes;
		this.documentos = documentos;
		this.fornecedores = fornecedores;
	}
	
	// Metodos publicos	
	public void adicionarObra() {
		// adiciona uma nova obra a base de dados
	}
	
	public int[] getIdsFuncs()
	{
		int idFuncs[] = new int[3];
		idFuncs[0] = this.gerente.getId();
		idFuncs[1] = this.engenheiro.getId();
		idFuncs[2] = this.financeiro.getId();
		return idFuncs;
	}
	
	public void atualizarObra() {
		// atualiza a obra na base de dados
	}
	
	public void adicionarDocumento() {
		// adiciona um novo documento a obra
	}
	
	public void adicionarCliente() {
		// adiciona um novo cliente a obra
	}
	
	public void adicionarFornecedor() {
		// adiciona um novo fornecedor a obra
	}
	
	public void listarFuncionarios () {
		// retorna a lista de funcionarios associados a obra
	}
	
	public void listarClientes() {
		// retorna a lista de clientes associados a obra
	}

	public void mudarStatus(String novoStatus) {
		//muda o status da obra
		
		BD bd = new BD();
		bd.mudarStatus(this.id, novoStatus);
		this.status = novoStatus;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumApartamentos() {
		return numApartamentos;
	}

	public void setNumApartamentos(int numApartamentos) {
		this.numApartamentos = numApartamentos;
	}

	public int getNumApartamentosDisponiveis() {
		return numApartamentosDisponiveis;
	}

	public void setNumApartamentosDisponiveis(int numApartamentosDisponiveis) {
		this.numApartamentosDisponiveis = numApartamentosDisponiveis;
	}

	public Funcionario getGerente() {
		return gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}

	public Funcionario getEngenheiro() {
		return engenheiro;
	}

	public void setEngenheiro(Funcionario engenheiro) {
		this.engenheiro = engenheiro;
	}

	public Funcionario getFinanceiro() {
		return financeiro;
	}

	public void setFinanceiro(Funcionario financeiro) {
		this.financeiro = financeiro;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(ArrayList<Documento> documentos) {
		this.documentos = documentos;
	}

	public GerenciadorFinanceiro getGerenciadorFinanceiro() {
		return gerenciadorFinanceiro;
	}

	public void setGerenciadorFinanceiro(GerenciadorFinanceiro gerenciadorFinanceiro) {
		this.gerenciadorFinanceiro = gerenciadorFinanceiro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
