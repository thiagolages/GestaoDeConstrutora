package gestaoDeConstrutora.SubsistemaOrcamento;

import java.util.List;
import java.util.ArrayList;

public class Transacao {

	//Atributos
	private int id;
	private float valor;
	private String descricao;
	private String status;
	private int prazo;
	
	public Transacao(int id, float valor, String descricao, String status, int prazo)
	{
		this.id = id;
		this. valor = valor;
		this.descricao = descricao;
		this.status = status;
		this.prazo = prazo;
	}
	
	public Transacao(float valor, String descricao, String status, int prazo)
	{
		this. valor = valor;
		this.descricao = descricao;
		this.status = status;
		this.prazo = prazo;
	}
	
	//M�todos P�blicos
	public void atualizarStatus() {
		// atualizar o status da obra, realizando a altera��o no banco de dados
	}
	
	public void criarTransacao() {
		// cria uma nova transacao
	}
}
