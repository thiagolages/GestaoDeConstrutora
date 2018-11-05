package gestaoDeConstrutora.SubsistemaClientes;

import gestaoDeConstrutora.Util.*;
import java.util.*;
import gestaoDeConstrutora.SubsistemaObras.*;

public class Cliente extends Pessoa {

	// Atributos
	protected int statusPagamento;
	
	// Construtores
	public Cliente(int id, String nome, int permissoes,
			int statusPagamento) {
		super(id, nome, permissoes);
                this.statusPagamento = statusPagamento;
	}
	
	// Metodos Publicos
	public void checarStatus() {
		// retorna o status do pagamento da pessoa 
	}
	
	public void realizarPagamento() {
		// realiza o pagamento alterando o status
	}
}


