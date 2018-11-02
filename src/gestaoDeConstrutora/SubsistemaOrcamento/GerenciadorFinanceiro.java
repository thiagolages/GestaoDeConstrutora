package gestaoDeConstrutora.SubsistemaOrcamento;

import java.util.List;
import java.util.ArrayList;

public class GerenciadorFinanceiro {

	//Atributos
	private Orcamento orcamento;
	private List<Transacao> transacoes;
	private Obra obra;
	
	//Construtores
	GerenciadorFinanceiro(Orcamento orcamento, ArrayList<Transacao> transacoes,
			Obra obra) {
		this.orcamento = orcamento;
		this.transacoes = transacoes;
		this.obra = obra;
	}
	
	//M�todos P�blicos
	public void enviarEdital() {
		// envia edital ao fornecedor
	}
	
	public ArrayList<Transacao> listarTransacoes() {
		// lista as transacoes do GerenciadorFinanceiro
		
		return transacoes;
	}
	
	//M�todos privados
	private void coletarRespostas() {
		// ? 
	}
	
	private void gerarPagamentos() {
		// gera transacoes negativas
	}
	
	private void gerarReceitas() {
		// gera transacoes positivas
	}
}

