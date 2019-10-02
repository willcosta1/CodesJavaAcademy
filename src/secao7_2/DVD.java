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
		return ("\nN�mero do Item: " + getNum() + "\nNome: "+ getNome() + "\nDura��o do Filme: "+ getDuracao() + "\nClassifica��o Et�ria: "
	+ getFaixa() + "\nEst�dio Cinematogr�fico: "+ getEstudio() + "\nQuantidade em estoque: "+ getEstoque() + "\nPre�o: " + getPreco() + "\nValor do Estoque: " + totalInventario() + "\nStatus do Produto: " + (getAtivo() == true ? "Ativo" : "Descontinuado"));
	}
}
