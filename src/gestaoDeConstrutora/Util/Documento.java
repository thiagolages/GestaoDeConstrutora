package gestaoDeConstrutora.Util;

import gestaoDeConstrutora.SubsistemaObras.*;
import gestaoDeConstrutora.SubsistemaFuncionarios.*;

public class Documento {

	//Atributos
	private int id;
	private Obra obra;
	private int tipo;
	private int preco;
	private String status;
	private String arquivo;
	private Funcionario responsavel;
	
	//Construtores
	public Documento (int id, Obra obra, int tipo, int preco, String status, String arquivo,
			   Funcionario responsavel) {
		this.id = id;
		this.obra = obra;
		this.tipo = tipo;
		this.preco = preco;
		this.status = status;
		this.arquivo = arquivo;
		this.responsavel = responsavel;
	}
	
	//Metodos Publicos	
	public void novoDocumento() {
		// cria um novo documento
	}
	
	public void atualizarStatus() {
		// atualiza o status do documento, alterando-o no banco de dados
	}
	
	//Metodos Privados
	private void gerarPagamento() {
		// gera um novo pagamento 
	}
}

