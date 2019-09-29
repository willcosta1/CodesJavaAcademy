package Seção4;

public class Produto {
	//Declarações de campo de instância
	private int num;
	private String nome;
	private int estoque;
	private double preco;
	//iniciar com valores padrões
	public Produto() {
		
	}
	public Produto(int num,String nome,int estoque,double preco) {
		this.num = num;
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
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
	//gets para pegar valores e sets para inserir valores, servem para acoplamento
	
	@Override
	public String toString() {
		return "\nNúmero do Item: " + num + "\nNome: " + nome + "\nQuantidade em estoque: " + estoque + "\nPreço: " + preco;
	}
	
}
