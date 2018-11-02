package gestaoDeConstrutora.Util;

import java.util.List;
import gestaoDeConstrutora.SubsistemaObras;

public class Pessoa {

	// Atributos
	protected int id;
	protected String nome;
	protected List<Obra> obras;
	protected int permissoes;
	
	// Construtores
	Pessoa(int id, String nome, ArrayList<Obra> obras, int permissoes) {
		this.id = id;
		this.nome = nome;
		this.obras = obras;
		this.permissoes = permissoes;
	}
	
	// Métodos Públicos	
	public void login() {
		// loga a pessoa no sistema
	}
	
	public void excluirConta() {
		// exclui a pessoa do sistema
	}
	
	public void atualizarDados() {
		// atualiza os dados da pessoa, realizando a alteração no banco de dados
	}
	
}

