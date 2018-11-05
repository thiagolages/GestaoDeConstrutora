package gestaoDeConstrutora.SubsistemaClientes;

import java.util.ArrayList;

public class SubsistemaClientes {
	
	public ArrayList<Cliente> clientes;
	
	public SubsistemaClientes() {
		// this.clientes = bancoDeDados.GetClientes
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
