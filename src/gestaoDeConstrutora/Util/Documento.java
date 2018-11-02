package gestaoDeConstrutora.Util;

import gestaoDeConstrutora.SubsistemaObras;
import gestaoDeConstrutora.SubsistemaFuncionarios;

public class Documento {

	//Atributos
	private int id;
	private obra Obra;
	priva int tipo;
	private int preco;
	private String status;
	private String arquivo;
	private Funcionario responsavel;
	
	//Construtores
	Documento (int id, obra Obra, int tipo, int preco, String status, String arquivo,
			   Funcionario responsavel) {
		this.id = id;
		this.Obra = obra;
		this.tipo = tipo;
		this.preco = preco;
		this.status = status;
		this.arquivo = arquivo;
		this.responsavel = responsavel;
	}
	
	//M�todos P�blicos	
	public void novoDocumento() {
		// cria um novo documento
	}
	
	public void atualizarStatus() {
		// atualiza o status do documento, alterando-o no banco de dados
	}
	
	//M�todos Privados
	private void gerarPagamento() {
		// gera um novo pagamento 
	}
}
