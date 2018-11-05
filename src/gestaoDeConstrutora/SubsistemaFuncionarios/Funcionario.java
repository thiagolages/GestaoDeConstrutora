package gestaoDeConstrutora.SubsistemaFuncionarios;

import java.util.*;
import gestaoDeConstrutora.SubsistemaObras.*;
import gestaoDeConstrutora.Util.*;

public class Funcionario extends Pessoa{

	// Atributos
	protected float salario;
	protected Date dataAdmissao;
	protected String departamento;
	
	// Construtores
	public Funcionario(int id, String nome, int permissoes,
			float salario, Date dataAdmissao, String departamento) {
            super(id, nome, permissoes);
            this.departamento = departamento;
            this.dataAdmissao = dataAdmissao;
            this.salario = salario;
	}
	
	public  ArrayList<Obra> getObras()
	{
		//TODO Fazer método
		return null;
	}
	
	// Getters
	public String getDepartamento() {
		return departamento;
	}
	
}
