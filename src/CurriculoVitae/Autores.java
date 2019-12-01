package CurriculoVitae;

public class Autores{
	/*
	 * Usado em Trabalhos em eventos, Artigos publicados e Livros publicados
	 * */
	
	private String nomeCompletoAutor;
	private String nomeParaCitacao;
	private int  ordemAutoria;
	private int NroIdCnpq;
	
	
	public String getNomeCompletoAutor() {
		return nomeCompletoAutor;
	}
	public void setNomeCompletoAutor(String nomeCompletoAutor) {
		this.nomeCompletoAutor = nomeCompletoAutor;
	}
	public String getNomeParaCitacao() {
		return nomeParaCitacao;
	}
	public void setNomeParaCitacao(String nomeParaCitacao) {
		this.nomeParaCitacao = nomeParaCitacao;
	}
	public int getOrdemAutoria() {
		return ordemAutoria;
	}
	public void setOrdemAutoria(int ordemAutoria) {
		this.ordemAutoria = ordemAutoria;
	}
	public int getNroIdCnpq() {
		return NroIdCnpq;
	}
	public void setNroIdCnpq(int nroIdCnpq) {
		NroIdCnpq = nroIdCnpq;
	}
	
}
