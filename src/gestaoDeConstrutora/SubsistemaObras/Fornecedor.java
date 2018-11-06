package gestaoDeConstrutora.SubsistemaObras;

public class Fornecedor {
	
	// Atributos
	private int id;
	private String nome;
	private String produtoOferecido;
	
	// Construtores	
	public Fornecedor(int id, String nome, String produtoOferecido){
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
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProdutoOferecido() {
		return produtoOferecido;
	}

	public void setProdutoOferecido(String produtoOferecido) {
		this.produtoOferecido = produtoOferecido;
	}
	
	
}
