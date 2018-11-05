package gestaoDeConstrutora.SubsistemaFuncionarios;

import java.util.ArrayList;

public class SubsistemaFuncionarios {
	
	// Atributos
	public ArrayList<Funcionario> funcionarios;
	
	// Construtores
	public SubsistemaFuncionarios() {
		// this.funcionarios = bancoDeDados.GetFuncionarios
	}
	
	// Metodos publicos
	public ArrayList<Funcionario> pesquisaFuncionarioPeloNome(String nomeDoFuncionario) {
		
		if (nomeDoFuncionario.isEmpty() || nomeDoFuncionario == "")
			return this.funcionarios;
		
		ArrayList<Funcionario> funcionariosRetornados = new ArrayList<Funcionario>();
		
		for(Funcionario funcionario : this.funcionarios) {
			if (funcionario.getNome().contains(nomeDoFuncionario)) {
				funcionariosRetornados.add(funcionario);
			}
		}
		
		return funcionariosRetornados;
	}
}