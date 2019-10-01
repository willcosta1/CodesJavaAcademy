package Seção7_2;

public class CD extends Produto {
	private String artista;
	private int numSongs;
	private String selo;
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getNumSongs() {
		return numSongs;
	}
	public void setNumSongs(int numSongs) {
		this.numSongs = numSongs;
	}
	public String getSelo() {
		return selo;
	}
	public void setSelo(String selo) {
		this.selo = selo;
	}
	public String toString() {
		return ("\nNúmero do Item: " + getNum() + "\nNome: "+ getNome() + "\nArtista: "+ getArtista() + "\nMúsicas do Álbum: "
	+ getNumSongs() + "\nSelo de gravação: "+ getSelo() + "\nQuantidade em estoque: "+ getEstoque() + "\nPreço: " + getPreco() + "\nValor do Estoque: " + totalInventario() + "\nStatus do Produto: " + (getAtivo() == true ? "Ativo" : "Descontinuado"));
	}

}
