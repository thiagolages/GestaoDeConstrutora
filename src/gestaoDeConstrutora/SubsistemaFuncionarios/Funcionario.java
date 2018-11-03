package gestaoDeConstrutora.SubsistemaFuncionarios;

import java.util.*;
import gestaoDeConstrutora.SubsistemaObras.*;
import gestaoDeConstrutora.Util.*;

public class Funcionario extends Pessoa{

	// Atributos
	protected int salario;
	protected Date dataAdmissao;
	protected String departamento;
	
	// Construtores
	public Funcionario(int id, String nome, ArrayList<Obra> obras, int permissoes,
			int salario, Date dataAdmissao, String departamento) {
            super(id, nome, obras, permissoes);
            this.departamento = departamento;
            this.dataAdmissao = dataAdmissao;
            this.salario = salario;
	}
}
