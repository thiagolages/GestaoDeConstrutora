package gestaoDeConstrutora.SubsistemaOrcamento;

import java.util.List;
import java.util.ArrayList;

public class Orcamento {

	//Atributos
	private int custoMaximo;
	private List<String> listaMateriais;
	private int tempoMaximoEntrega;
	private String statusMaterial;
	private int precoPorApartamento;
	private int numApartamentosIncluidos;
	private String statusOrcamento;
	
	// Construtores
	Orcamento(int custoMaximo, ArrayList<String> listaMateriais, int tempoMaximoEntrega,
			String statusMaterial, int precoPorApartamento, int numApartamentosIncluidos,
			String statusOrcamento) {
		this.custoMaximo = custoMaximo;
		this.listaMateriais = listaMateriais;
		this.tempoMaximoEntrega = tempoMaximoEntrega;
		this.statusMaterial = statusMaterial;
		this.precoPorApartamento = precoPorApartamento;
		this.numApartamentosIncluidos = numApartamentosIncluidos;
		this.statusOrcamento = statusOrcamento;
	}
	
	//Métodos Públicos
	public void criarNovo() {
		// cria novo orçamento, adicionando-o ao banco de dados
	}
	
	public void aprovar() {
		// aprova o orçamento, alterando seu status
	}
	
	public void atualizarStatusMaterial() {
		// atualiza o status do material, realizando tal alteração no banco
	}
	
	public atualizarStatusOrcamento {
		// atualiza o status do orcamento, realizando tal alteração no banco
	}
}

