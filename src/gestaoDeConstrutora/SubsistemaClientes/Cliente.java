package gestaoDeConstrutora.SubsistemaClientes;

import gestaoDeConstrutora.Util;
import java.util.List;
import gestaoDeConstrutora.SubsistemaObras;

public class Cliente extends Pessoa {

	// Atributos
	protected int statusPagamento;
	
	// Construtores
	Cliente(int id, String nome, ArrayList<Obra> obras, int permissoes,
			int statusPagamento) {
		this.id = id;
		this.nome = nome;
		this.obras = obras;
		this.permissoes = permissoes;
		this.statusPagamento = statusPagamento;
	}
	
	// Métodos Públicos
	public void checarStatus() {
		// retorna o status do pagamento da pessoa 
	}
	
	public void realizarPagamento() {
		// realiza o pagamento alterando o status
	}
}


