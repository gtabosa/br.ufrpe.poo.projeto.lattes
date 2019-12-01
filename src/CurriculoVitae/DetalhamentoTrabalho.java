package CurriculoVitae;

import java.util.Date;

public class DetalhamentoTrabalho extends TrabalhosEmEventos {
	
	private String classificacaoEvento;
	private String nomeEvento;
	private String cidadeEvento;
	private Date anoRealizacao;
	private String tituloAnaisProceedings;
	private int volume;
	private String fasciculos;
	private String serie;
	private int  pagInicial;
	private int pagFinal;
	private String ISBN;
	private String nomeEditora;
	private String cidadeEditora;
	private String nomeEvento_EN;
	
	
	public String getClassificacaoEvento() {
		return classificacaoEvento;
	}
	public void setClassificacaoEvento(String classificacaoEvento) {
		this.classificacaoEvento = classificacaoEvento;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getCidadeEvento() {
		return cidadeEvento;
	}
	public void setCidadeEvento(String cidadeEvento) {
		this.cidadeEvento = cidadeEvento;
	}
	public Date getAnoRealizacao() {
		return anoRealizacao;
	}
	public void setAnoRealizacao(Date anoRealizacao) {
		this.anoRealizacao = anoRealizacao;
	}
	public String getTituloAnaisProceedings() {
		return tituloAnaisProceedings;
	}
	public void setTituloAnaisProceedings(String tituloAnaisProceedings) {
		this.tituloAnaisProceedings = tituloAnaisProceedings;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getFasciculos() {
		return fasciculos;
	}
	public void setFasciculos(String fasciculos) {
		this.fasciculos = fasciculos;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public int getPagInicial() {
		return pagInicial;
	}
	public void setPagInicial(int pagInicial) {
		this.pagInicial = pagInicial;
	}
	public int getPagFinal() {
		return pagFinal;
	}
	public void setPagFinal(int pagFinal) {
		this.pagFinal = pagFinal;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getCidadeEditora() {
		return cidadeEditora;
	}
	public void setCidadeEditora(String cidadeEditora) {
		this.cidadeEditora = cidadeEditora;
	}
	public String getNomeEvento_EN() {
		return nomeEvento_EN;
	}
	public void setNomeEvento_EN(String nomeEvento_EN) {
		this.nomeEvento_EN = nomeEvento_EN;
	}

}
