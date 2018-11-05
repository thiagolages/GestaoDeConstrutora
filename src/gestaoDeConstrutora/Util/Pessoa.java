package gestaoDeConstrutora.Util;

import java.util.*;
import gestaoDeConstrutora.SubsistemaObras.*;

public class Pessoa {

    // Atributos
    protected int id;
    protected String nome;
    protected ArrayList<Obra> obras;
    protected int permissoes;
    
    // Getters
    public String getNome() {
    	return this.nome;
    }
    
    // Construtores
    public Pessoa(int id, String nome, ArrayList<Obra> obras, int permissoes) {
            this.id = id;
            this.nome = nome;
            this.obras = obras;
            this.permissoes = permissoes;
    }

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
	
}

