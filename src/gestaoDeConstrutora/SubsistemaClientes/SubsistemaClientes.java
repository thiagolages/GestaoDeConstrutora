package gestaoDeConstrutora.SubsistemaClientes;

import java.util.ArrayList;

import gestaoDeConstrutora.BancoDeDados.InterfaceBD;
import gestaoDeConstrutora.SubsistemaObras.Obra;

public class SubsistemaClientes {
	
	private InterfaceBD bancoDeDados;
	public ArrayList<Cliente> clientes;
	
	public SubsistemaClientes(InterfaceBD bancoDeDados) {
		this.bancoDeDados = bancoDeDados;
		this.clientes = bancoDeDados.getClientes();
	}
	
	public ArrayList<Cliente> pesquisaClientePeloNome(String nomeDoCliente) {
					
		ArrayList<Cliente> clientesRetornados = new ArrayList<Cliente>();
		
		for(Cliente cliente : this.clientes) {
			if (cliente.getNome().contains(nomeDoCliente)) {
				clientesRetornados.add(cliente);
			}
		}
		
		return clientesRetornados;
	}
}