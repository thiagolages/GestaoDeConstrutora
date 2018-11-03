package gestaoDeConstrutora.SubsistemaOrcamento;

import gestaoDeConstrutora.SubsistemaObras.Obra;
import java.util.ArrayList;

public class GerenciadorFinanceiro {

	//Atributos
	private Orcamento orcamento;
	private ArrayList<Transacao> transacoes;
	private Obra obra;
	
	//Construtores
	GerenciadorFinanceiro(Orcamento orcamento, ArrayList<Transacao> transacoes,
			Obra obra) {
		this.orcamento = orcamento;
		this.transacoes = transacoes;
		this.obra = obra;
	}
	
	//Metodos Publicos
	public void enviarEdital() {
		// envia edital ao fornecedor
	}
	
	public ArrayList<Transacao> listarTransacoes() {
		// lista as transacoes do GerenciadorFinanceiro
		
		return transacoes;
	}
	
	//Metodos privados
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

