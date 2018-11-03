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
        public Orcamento(){
            
        }
        
	public Orcamento(int custoMaximo, ArrayList<String> listaMateriais, int tempoMaximoEntrega,
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
	
	//Metodos Publicos
	public void criarNovo() {
		// cria novo orcamento, adicionando-o ao banco de dados
	}
	
	public void aprovar() {
		// aprova o orcamento, alterando seu status
	}
	
	public void atualizarStatusMaterial() {
		// atualiza o status do material, realizando tal alteracao no banco
	}
	
	public void atualizarStatusOrcamento() {
		// atualiza o status do orcamento, realizando tal alteracao no banco
	}
}

