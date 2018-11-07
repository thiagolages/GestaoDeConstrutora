package gestaoDeConstrutora.Testes;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

import gestaoDeConstrutora.BancoDeDados.InterfaceBD;
import gestaoDeConstrutora.SubsistemaClientes.Cliente;
import gestaoDeConstrutora.SubsistemaClientes.SubsistemaClientes;

public class SubsistemaClientesTest {

	@Test
	public void testPesquisaClientePeloNomeClienteEncontrado() {
		
		// Preparando teste
		BDMock bdMock = new BDMock();
		bdMock.setClientesArmazenados(criaListaClientesParaTeste());
		SubsistemaClientes subsistemaClientes = new SubsistemaClientes(bdMock);	
		int idClienteProcurado = 0;
		String nomeClienteProcurado = "Alberto";
		int permissoesClienteProcurado = 10;
		
		// Executando teste
		ArrayList<Cliente> clientesEncontrados = subsistemaClientes
				.pesquisaClientePeloNome(nomeClienteProcurado);
		
		// Verificando
		assertFalse("Erro! Nenhum cliente foi encontrado.", clientesEncontrados.isEmpty());
		assertTrue("Erro! Foi encontrado mais de um cliente.", clientesEncontrados.size() == 1);
		assertEquals("Erro! Foi encontrado um cliente com id diferente do esperado.", idClienteProcurado, clientesEncontrados.get(0).getId());
		assertEquals("Erro! Foi encontrado um cliente com nome diferente do esperado.", nomeClienteProcurado, clientesEncontrados.get(0).getNome());
		assertEquals("Erro! Foi encontrado um cliente com permissoes diferente do esperado.", permissoesClienteProcurado, clientesEncontrados.get(0).getPermissoes());
	}
	
	@Test
	public void testPesquisaClientePeloNomeMaisDeUmClienteEncontrado() {
		// Preparando teste
		BDMock bdMock = new BDMock();
		bdMock.setClientesArmazenados(criaListaClientesParaTeste());
		SubsistemaClientes subsistemaClientes = new SubsistemaClientes(bdMock);	
		String nomeClienteProcurado = "J";
		
		// Executando teste
		ArrayList<Cliente> clientesEncontrados = subsistemaClientes
				.pesquisaClientePeloNome(nomeClienteProcurado);
		
		// Verificando
		assertFalse("Erro! Nenhum cliente foi encontrado.", clientesEncontrados.isEmpty());
		assertTrue("Erro! Foram encontrados menos ou mais que dois clientes.", clientesEncontrados.size() == 2);
		assertEquals("Erro! Foi encontrado um cliente com nome diferente do esperado.", "Jorge", clientesEncontrados.get(0).getNome());
		assertEquals("Erro! Foi encontrado um cliente com nome diferente do esperado.", "Joana", clientesEncontrados.get(1).getNome());
	}
	
	@Test
	public void testPesquisaClientePeloNomeNenhumClienteEncontrado() {
		
		// Preparando teste
		BDMock bdMock = new BDMock();
		bdMock.setClientesArmazenados(criaListaClientesParaTeste());
		SubsistemaClientes subsistemaClientes = new SubsistemaClientes(bdMock);	
		String nomeClienteProcurado = "Marina";
		
		// Executando teste
		ArrayList<Cliente> clientesEncontrados = subsistemaClientes
				.pesquisaClientePeloNome(nomeClienteProcurado);
		
		// Verificando
		assertTrue("Erro! Foi encontrado um cliente.", clientesEncontrados.isEmpty());
	}
	
	private ArrayList<Cliente> criaListaClientesParaTeste() {	
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes.add(new Cliente(0, "Alberto", 10));
		listaClientes.add(new Cliente(1, "Jorge", 20));
		listaClientes.add(new Cliente(2, "Joana", 30));
		listaClientes.add(new Cliente(3, "Maria", 40));
		listaClientes.add(new Cliente(4, "Arrascaeta", 50));	
		return listaClientes;
	}

}
