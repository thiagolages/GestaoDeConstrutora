package gestaoDeConstrutora.SubsistemaObras;

import java.util.ArrayList;

import gestaoDeConstrutora.BancoDeDados.*;

public class SubsistemaObras implements ISubsistemaObras {

	private InterfaceBD bancoDeDados;
	
	public SubsistemaObras(InterfaceBD bancoDeDados) {
		this.bancoDeDados = bancoDeDados;
	}
	
	public ArrayList<Obra> listaTodasAsObras() {
		// lista todas as obras armazenadas no banco de dados
		return new ArrayList<Obra>();
	}
}
