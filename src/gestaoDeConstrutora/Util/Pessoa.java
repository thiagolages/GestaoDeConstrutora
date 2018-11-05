package gestaoDeConstrutora.Util;

import java.util.ArrayList;

import gestaoDeConstrutora.SubsistemaObras.Obra;

public abstract class Pessoa {

    // Atributos
    protected int id;
	protected String nome;
    protected ArrayList<Obra> obras;
    protected int permissoes;
    
    // Construtores
    public Pessoa(int id, String nome, int permissoes) {
            this.id = id;
            this.nome = nome;
            this.permissoes = permissoes;
    }
    
	public abstract ArrayList<Obra> getObras();

    // M�todos P�blicos	
    public void login() {
            // loga a pessoa no sistema
    }

    public void excluirConta() {
            // exclui a pessoa do sistema
    }

    public void atualizarDados() {
            // atualiza os dados da pessoa, realizando a altera��o no banco de dados
    }
    
    //Getters e Setters
    
    
    
    public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(int permissoes) {
		this.permissoes = permissoes;
	}

	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}
	
}

