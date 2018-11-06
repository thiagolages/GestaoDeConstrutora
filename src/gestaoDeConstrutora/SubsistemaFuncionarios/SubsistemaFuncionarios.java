package gestaoDeConstrutora.SubsistemaFuncionarios;

import java.util.ArrayList;

import gestaoDeConstrutora.BancoDeDados.InterfaceBD;

public class SubsistemaFuncionarios implements ISubsistemaFuncionarios {
	
	// Atributos
	public ArrayList<Funcionario> funcionarios;
	private InterfaceBD bancoDeDados;
	
	// Construtores
	public SubsistemaFuncionarios(InterfaceBD bancoDeDados) {
		this.bancoDeDados = bancoDeDados;
		this.funcionarios = bancoDeDados.getFuncionarios();
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