package gestaoDeConstrutora.SubsistemaOrcamento;

import java.util.ArrayList;

import gestaoDeConstrutora.BancoDeDados.*;

public class SubsistemaOrcamento implements ISubsistemaOrcamento {

	private InterfaceBD bancoDeDados;
	
	public SubsistemaOrcamento(InterfaceBD bancoDeDados) {
		this.bancoDeDados = bancoDeDados;
	}
	
	public ArrayList<Orcamento> listaTodosOsOrcamentos() {
		// lista todos os orcamentos armazenados no banco de dados
		return new ArrayList<Orcamento>();
	};
}
