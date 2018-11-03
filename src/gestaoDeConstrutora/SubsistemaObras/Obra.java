package gestaoDeConstrutora.SubsistemaObras;

import gestaoDeConstrutora.SubsistemaClientes.Cliente;
import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaOrcamento.GerenciadorFinanceiro;
import gestaoDeConstrutora.Util.Documento;
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
	private GerenciadorFinanceiro gerenciadorFinanceiro;
	private String status;
	
	
	// Construtores
	Obra (int id, String localizacao, String tipo, int numApartamentos, 
			int numApartamentosDisponiveis, Funcionario gerente, 
			Funcionario engenheiro, Funcionario financeiro,
			GerenciadorFinanceiro gerenciadorFinanceiro, String status) {
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
		this.gerenciadorFinanceiro = gerenciadorFinanceiro;
		this.status = status;
	}
	
	// Metodos publicos	
	public void adicionarObra() {
		// adiciona uma nova obra a base de dados
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
		
	// Metodos privados	
	private void mudarStatus() {
		// altera o status da obra
	}
	
}
