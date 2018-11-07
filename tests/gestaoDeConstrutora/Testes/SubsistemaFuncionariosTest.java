package gestaoDeConstrutora.Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

import gestaoDeConstrutora.SubsistemaClientes.SubsistemaClientes;
import gestaoDeConstrutora.SubsistemaFuncionarios.Funcionario;
import gestaoDeConstrutora.SubsistemaFuncionarios.SubsistemaFuncionarios;

class SubsistemaFuncionariosTest {

	@Test
	public void testPesquisaFuncionarioPeloNomeFuncionarioEncontrado() {
		
		// Preparando teste
		BDMock bdMock = new BDMock();
		bdMock.setFuncionariosArmazenados(criaListaFuncionariosParaTeste());
		SubsistemaFuncionarios subsistemaFuncionarios = new SubsistemaFuncionarios(bdMock);	
	
		int idFuncionarioProcurado = 0;
		String nomeFuncionarioProcurado = "Alberto";
		int permissoesFuncionarioProcurado = 10;
		@SuppressWarnings("deprecation")
		Date dataAdmissaoFuncionarioProcurado = new Date(2018,1,1);
		String departamentoFuncionarioProcurado = "Engenharia";
		
		// Executando teste
		ArrayList<Funcionario> FuncionariosEncontrados = subsistemaFuncionarios
				.pesquisaFuncionarioPeloNome(nomeFuncionarioProcurado);
		
		// Verificando
		assertFalse("Erro! Nenhum Funcionario foi encontrado.", FuncionariosEncontrados.isEmpty());
		assertTrue("Erro! Foi encontrado mais de um Funcionario.", FuncionariosEncontrados.size() == 1);
		assertEquals("Erro! Foi encontrado um Funcionario com id diferente do esperado.", idFuncionarioProcurado, FuncionariosEncontrados.get(0).getId());
		assertEquals("Erro! Foi encontrado um Funcionario com nome diferente do esperado.", nomeFuncionarioProcurado, FuncionariosEncontrados.get(0).getNome());
		assertEquals("Erro! Foi encontrado um Funcionario com permissoes diferente do esperado.", permissoesFuncionarioProcurado, FuncionariosEncontrados.get(0).getPermissoes());
		assertEquals("Erro! Foi encontrado um Funcionario com data de admissao diferente do esperado.", dataAdmissaoFuncionarioProcurado, FuncionariosEncontrados.get(0).getDataAdmissao());
		assertEquals("Erro! Foi encontrado um Funcionario com departamento diferente do esperado.", departamentoFuncionarioProcurado, FuncionariosEncontrados.get(0).getDepartamento());
	}
	
	@Test
	public void testPesquisaFuncionarioPeloNomeMaisDeUmFuncionarioEncontrado() {
		// Preparando teste
		BDMock bdMock = new BDMock();
		bdMock.setFuncionariosArmazenados(criaListaFuncionariosParaTeste());
		SubsistemaFuncionarios subsistemaFuncionarios = new SubsistemaFuncionarios(bdMock);	
		
		String nomeFuncionarioProcurado = "J";
		
		// Executando teste
		ArrayList<Funcionario> FuncionariosEncontrados = subsistemaFuncionarios
				.pesquisaFuncionarioPeloNome(nomeFuncionarioProcurado);
		
		// Verificando
		assertFalse("Erro! Nenhum Funcionario foi encontrado.", FuncionariosEncontrados.isEmpty());
		assertTrue("Erro! Foram encontrados menos ou mais que dois Funcionarios.", FuncionariosEncontrados.size() == 2);
		assertEquals("Erro! Foi encontrado um Funcionario com nome diferente do esperado.", "Jorge", FuncionariosEncontrados.get(0).getNome());
		assertEquals("Erro! Foi encontrado um Funcionario com nome diferente do esperado.", "Joana", FuncionariosEncontrados.get(1).getNome());
	}
	
	@Test
	public void testPesquisaFuncionarioPeloNomeNenhumFuncionarioEncontrado() {
		
		// Preparando teste
		BDMock bdMock = new BDMock();
		bdMock.setFuncionariosArmazenados(criaListaFuncionariosParaTeste());
		SubsistemaFuncionarios subsistemaFuncionarios = new SubsistemaFuncionarios(bdMock);	
		
		String nomeFuncionarioProcurado = "Marina";
		
		// Executando teste
		ArrayList<Funcionario> FuncionariosEncontrados = subsistemaFuncionarios
				.pesquisaFuncionarioPeloNome(nomeFuncionarioProcurado);
		
		// Verificando
		assertTrue("Erro! Foi encontrado um Funcionario.", FuncionariosEncontrados.isEmpty());
	}
	
	@SuppressWarnings("deprecation")
	private ArrayList<Funcionario> criaListaFuncionariosParaTeste() {	
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		listaFuncionarios.add(new Funcionario(0, "Alberto", 10, 10000, new Date(2018,1,1), "Engenharia"));
		listaFuncionarios.add(new Funcionario(1, "Jorge", 20, 10000, new Date(2018,1,2), "Financeiro"));
		listaFuncionarios.add(new Funcionario(2, "Joana", 30, 10000, new Date(2018,1,3), "RH"));
		listaFuncionarios.add(new Funcionario(3, "Maria", 40, 10000, new Date(2018,1,4), "RH"));
		listaFuncionarios.add(new Funcionario(4, "Arrascaeta", 50, 10000, new Date(2018,1,5), "Engenharia"));	
		return listaFuncionarios;
	}

}
