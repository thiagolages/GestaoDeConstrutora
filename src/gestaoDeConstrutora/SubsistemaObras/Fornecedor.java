package gestaoDeConstrutora.SubsistemaObras;

public class Fornecedor {
	
	// Atributos
	private int id;
	private String nome;
	private String produtoOferecido;
	
	// Construtores	
	Fornecedor(int id, String nome, String produtoOferecido){
		this.id = id;
		this.nome = nome;
		this.produtoOferecido = produtoOferecido;
	}
	
	// Metodos Publicos	
	public void cadastrarFornecedor(String nome, String ProdutoOferecido) {
		// cadastra o fornecedor, inserindo-o na base de dados. 
	}
	
	public void atualizarFornecedor() {
		// atualiza o fornecedor existente na base de dados
	}
}
