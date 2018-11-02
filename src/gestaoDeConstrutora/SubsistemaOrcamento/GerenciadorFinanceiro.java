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
	
	//Métodos Públicos
	public void enviarEdital() {
		// envia edital ao fornecedor
	}
	
	public ArrayList<Transacao> listarTransacoes() {
		// lista as transacoes do GerenciadorFinanceiro
		
		return transacoes;
	}
	
	//Métodos privados
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

