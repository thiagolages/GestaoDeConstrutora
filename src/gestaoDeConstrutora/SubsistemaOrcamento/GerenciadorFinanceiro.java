package gestaoDeConstrutora.SubsistemaOrcamento;

import gestaoDeConstrutora.BancoDeDados.BD;
import gestaoDeConstrutora.SubsistemaObras.Fornecedor;
import gestaoDeConstrutora.SubsistemaObras.Obra;
import java.util.ArrayList;
import java.util.Random;


public class GerenciadorFinanceiro {

	//Atributos
	private Orcamento orcamento;
	private ArrayList<Transacao> transacoes;
	private Obra obra;
	
	//Construtores
	public GerenciadorFinanceiro(Orcamento orcamento, ArrayList<Transacao> transacoes) {
		this.orcamento = orcamento;
		this.transacoes = transacoes;
	}
	
	//Metodos Publicos
	public void enviarEdital() {
		if(orcamento.getStatusOrcamento().equals("Aprovado"))
		{
			orcamento.atualizarStatusMaterial("Aguardando Resposta de Fornecedores");
		}
		
		//Tempo para simulação de reposta
		for(int i = 0; i <100000; i++);

	}
	
	public ArrayList<Transacao> listarTransacoes() {
		// lista as transacoes do GerenciadorFinanceiro
		
		return transacoes;
	}
	
	
	public ArrayList<Fornecedor> coletarRespostas() {
		if(orcamento.getStatusOrcamento().equals("Aguardando Resposta de Fornecedores"))
		{
			//O método gera valores aleatórios dos fornecedores.
			Random gerador = new Random();
			
			//Conecta ao banco e busca todos os fornecedores
			BD banco = new BD();
			ArrayList<Fornecedor> forns = banco.getFornecedores();
			
			//Cria array com os fornecedores que serão selecionados
			ArrayList<Fornecedor> selectedForns = new ArrayList<Fornecedor>();
			
			//Cria array para ser usado ao gerar o preco de cada fornecedor
			ArrayList<Integer> randPrice = new ArrayList<Integer>();
			int sum = 0;
			
			//Contador para início de nova categoria
			int inicioCat = 0;
			
			
			String cat = new String();
			for (int i = 0; i <forns.size(); i++) {
				Fornecedor thisForn = forns.get(i);
				String thisCat = thisForn.getProdutoOferecido();
				if(i == 0)
				{
					cat = thisCat;
				}
				
				/*
				 * Sempre que for encontrado um produto de nova categoria, é 
				 * sorteado um fornecedor para o produto da categoria anterior.
				 */
				if(!(thisCat.equals(cat)))
				{
					//Escolha aleatória da categoria anterior
					int escolha = gerador.nextInt(i-inicioCat) + inicioCat;
					selectedForns.add(forns.get(escolha));
					
					//Gera número para preço
					int thisRand = gerador.nextInt(100)+1;
					randPrice.add(thisRand);
					sum += thisRand;
					
					//Novo início de categoria
					inicioCat = i;
					cat = thisCat;
				}
			}
			int escolha = gerador.nextInt(forns.size()-inicioCat) + inicioCat;
			selectedForns.add(forns.get(escolha));
			float max = this.orcamento.getCustoMaximo();
			for (int i = 0; i <randPrice.size(); i++) {
				float thisPrice = (randPrice.get(i)*max)/sum;
				String thisForn = selectedForns.get(i).getNome();
				Transacao newTrans = new Transacao(
						-thisPrice, "Pagamento de fornecedor" + thisForn,
						"Pendente", this.orcamento.getTempoMaximoEntrega()
						);
				this.gerarPagamentos(newTrans);
			}
			return selectedForns;
		}
		return null;
	}
	
	//Metodos privados
	private void gerarPagamentos(Transacao trans) {
		this.transacoes.add(trans);
	}
	
	private void gerarReceitas() {
		// gera transacoes positivas
	}
}

