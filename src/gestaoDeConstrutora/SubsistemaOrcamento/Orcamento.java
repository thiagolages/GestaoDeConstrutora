package gestaoDeConstrutora.SubsistemaOrcamento;

import java.util.List;
import java.util.ArrayList;

public class Orcamento {

	//Atributos
	private float custoMaximo;
	private String listaMateriais;
	private int tempoMaximoEntrega;
	private String statusMaterial;
	private float precoPorApartamento;
	private int numApartamentosIncluidos;
	private String statusOrcamento;
	
	// Construtores
        public Orcamento(){
            
        }
        
	public Orcamento(float custoMaximo, String listaMateriais, int tempoMaximoEntrega,
			String statusMaterial, float precoPorApartamento, int numApartamentosIncluidos,
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
	
	public void atualizarStatusMaterial(String novoStatus) {
		// atualiza o status do material, realizando tal alteracao no banco
	}
	
	public void atualizarStatusOrcamento() {
		// atualiza o status do orcamento, realizando tal alteracao no banco
	}
	
	//Getters e setters
	public float getCustoMaximo() {
		return custoMaximo;
	}

	public void setCustoMaximo(float custoMaximo) {
		this.custoMaximo = custoMaximo;
	}

	public String getListaMateriais() {
		return listaMateriais;
	}

	public void setListaMateriais(String listaMateriais) {
		this.listaMateriais = listaMateriais;
	}

	public int getTempoMaximoEntrega() {
		return tempoMaximoEntrega;
	}

	public void setTempoMaximoEntrega(int tempoMaximoEntrega) {
		this.tempoMaximoEntrega = tempoMaximoEntrega;
	}

	public String getStatusMaterial() {
		return statusMaterial;
	}

	public void setStatusMaterial(String statusMaterial) {
		this.statusMaterial = statusMaterial;
	}

	public float getPrecoPorApartamento() {
		return precoPorApartamento;
	}

	public void setPrecoPorApartamento(float precoPorApartamento) {
		this.precoPorApartamento = precoPorApartamento;
	}

	public int getNumApartamentosIncluidos() {
		return numApartamentosIncluidos;
	}

	public void setNumApartamentosIncluidos(int numApartamentosIncluidos) {
		this.numApartamentosIncluidos = numApartamentosIncluidos;
	}

	public String getStatusOrcamento() {
		return statusOrcamento;
	}

	public void setStatusOrcamento(String statusOrcamento) {
		this.statusOrcamento = statusOrcamento;
	}
	
	
	
}

