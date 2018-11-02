package gestaoDeConstrutora.SubsistemaFuncionarios;

import java.Util.Date;
import java.util.List;
import gestaoDeConstrutora.SubsistemaObras;

public class Funcionario {

	// Atributos
	protected int salario;
	protected Date dataAdmissao;
	protected String departamento;
	
	// Construtores
	Funcionario(int id, String nome, ArrayList<Obra> obras, int permissoes,
			int salario, Date dataAdmissao, String departamento) {
		this.id = id;
		this.nome = nome;
		this.obras = obras;
		this.permissoes = permissoes;
		this.departamento = departamento;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
}
