package gestaoDeConstrutora.Util;

import gestaoDeConstrutora.SubsistemaObras.*;
import gestaoDeConstrutora.SubsistemaFuncionarios.*;

public class Documento {

	//Atributos
	private int id;
	private Obra obra;
	private int tipo;
	private String status;
	private String arquivo;
	private Funcionario responsavel;
	
	//Construtores
	public Documento (int id, int tipo, String status, String arquivo) {
		this.id = id;
		this.tipo = tipo;
		this.status = status;
		this.arquivo = arquivo;
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

