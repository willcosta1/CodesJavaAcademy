package secao7_2;


public class Produto {
	//Declarações de campo de instância
	private int num;
	private String nome;
	private int estoque;
	private double preco;
	private Boolean ativo;
	public static Produto addToInventory(Produto p,int quant) {
		if(p.ativo==false) {
			System.out.println("Não é possível adicionar a uma linha descontinuada!");
		}else {
			p.setEstoque(p.getEstoque()+quant);
			System.out.println("Adicionado");
		}
		return p;
	}
	public static Produto deductFromInventory(Produto p,int quant) {
		p.setEstoque(p.getEstoque()-quant);
		return p;
	}
	//iniciar com valores padrões
	public Produto() {
		
	}
	public Produto(int num,String nome,int estoque,double preco, String duracao, String faixa, String estudio) {
		super();
	}
	public Produto(int num,String nome,int estoque,double preco, String artista, int numSongs, String selo) {
		super();
	}
	public Produto(int num,String nome,int estoque,double preco) {
		this.num = num;
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
		this.ativo = true;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	//gets para pegar valores e sets para inserir valores, servem para acoplamento

	@Override
	public String toString() {
		return "\nNúmero do Item: " + num + "\nNome: " + nome + "\nQuantidade em estoque: " + estoque + "\nPreço: " + preco + "\nValor do Estoque: " + totalInventario() +"\nStatus do Produto: " + (ativo == true ? "Ativo" : "Descontinuado");
	}
	
	public double totalInventario() {
		return getPreco()*getEstoque();
	}
}
