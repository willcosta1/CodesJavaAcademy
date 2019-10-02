package secao7_2;

public class DVD extends Produto {
	private String duracao;
	private String faixa;
	private String estudio;

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getFaixa() {
		return faixa;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public double totalInventario() {
		return (getPreco() * getEstoque() * 1.05);
	}

	public String toString() {
		return ("\nNúmero do Item: " + getNum() + "\nNome: "+ getNome() + "\nDuração do Filme: "+ getDuracao() + "\nClassificação Etária: "
	+ getFaixa() + "\nEstúdio Cinematográfico: "+ getEstudio() + "\nQuantidade em estoque: "+ getEstoque() + "\nPreço: " + getPreco() + "\nValor do Estoque: " + totalInventario() + "\nStatus do Produto: " + (getAtivo() == true ? "Ativo" : "Descontinuado"));
	}
}
