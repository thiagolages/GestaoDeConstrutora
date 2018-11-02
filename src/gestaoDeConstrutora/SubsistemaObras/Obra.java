package gestaoDeConstrutora.SubsistemaObras;

import java.util.List;
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
	private List<Cliente> clientes;
	private List<Documento> documentos;
	private GerenciadorFinanceiro gerenciadorFinanceiro;
	private String status;
	
	
	// Construtores
	Obra (String id, String localizacao, String tipo, int numApartamentos, 
			int numApartamentosDisponiveis, Funcionario gerente, 
			Funcionario engenheiro, Funcionario financeiro,
			GerenciadorFinanceiro gerenciadorFinanceiro, string status) {
		this.id = id;
		this.localizacao = localizacao;
		this.tipo = tipo;
		this.numApartamentos = numApartamentos;
		this.numApartamentosDisponiveis = numApartamentosDisponiveis;
		this.gerente = gerente;
		this.engenheiro = engenheiro;
		this.financeiro = financeiro;
		this.clientes = new ArrayList<Cliente>;
		this.documentos = new ArrayList<Documento>;
		this.gerenciadorFinanceiro = gerenciadorFinanceiro;
		this.status = status;
	}
	
	// Métodos públicos	
	public void adicionarObra() {
		// adiciona uma nova obra à base de dados
	}
	
	public void atualizarObra() {
		// atualiza a obra na base de dados
	}
	
	public void adicionarDocumento() {
		// adiciona um novo documento à obra
	}
	
	public void adicionarCliente() {
		// adiciona um novo cliente à obra
	}
	
	public void adicionarFornecedor() {
		// adiciona um novo fornecedor à obra
	}
	
	public void listarFuncionarios () {
		// retorna a lista de funcionários associados à obra
	}
	
	public void listarClientes() {
		// retorna a lista de clientes associados à obra
	}
		
	// Métodos privados	
	private void mudarStatus() {
		// altera o status da obra
	}
	
}
