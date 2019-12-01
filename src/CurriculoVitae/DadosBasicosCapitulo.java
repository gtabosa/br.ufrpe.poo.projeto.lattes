package CurriculoVitae;

import java.util.Date;

public class DadosBasicosCapitulo extends CapitulosDeLivrosPublicados{
	
	private String tipo;
	private String tituloCapitulo;
	private Date ano;
	private String paisPublicacao;
	private String idioma;
	private String meioDivulgacao;
	private String homePageTrabalho;
	private boolean flagRelevancia;
	private String DOI;
	private String tituloCapitulo_EN;
	private String flagDivulgacaoCientifica;
	
	
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the tituloCapitulo
	 */
	public String getTituloCapitulo() {
		return tituloCapitulo;
	}
	/**
	 * @param tituloCapitulo the tituloCapitulo to set
	 */
	public void setTituloCapitulo(String tituloCapitulo) {
		this.tituloCapitulo = tituloCapitulo;
	}
	/**
	 * @return the ano
	 */
	public Date getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(Date ano) {
		this.ano = ano;
	}
	/**
	 * @return the paisPublicacao
	 */
	public String getPaisPublicacao() {
		return paisPublicacao;
	}
	/**
	 * @param paisPublicacao the paisPublicacao to set
	 */
	public void setPaisPublicacao(String paisPublicacao) {
		this.paisPublicacao = paisPublicacao;
	}
	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}
	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	/**
	 * @return the meioDivulgacao
	 */
	public String getMeioDivulgacao() {
		return meioDivulgacao;
	}
	/**
	 * @param meioDivulgacao the meioDivulgacao to set
	 */
	public void setMeioDivulgacao(String meioDivulgacao) {
		this.meioDivulgacao = meioDivulgacao;
	}
	/**
	 * @return the homePageTrabalho
	 */
	public String getHomePageTrabalho() {
		return homePageTrabalho;
	}
	/**
	 * @param homePageTrabalho the homePageTrabalho to set
	 */
	public void setHomePageTrabalho(String homePageTrabalho) {
		this.homePageTrabalho = homePageTrabalho;
	}
	/**
	 * @return the flagRelevancia
	 */
	public boolean isFlagRelevancia() {
		return flagRelevancia;
	}
	/**
	 * @param flagRelevancia the flagRelevancia to set
	 */
	public void setFlagRelevancia(boolean flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}
	/**
	 * @return the dOI
	 */
	public String getDOI() {
		return DOI;
	}
	/**
	 * @param dOI the dOI to set
	 */
	public void setDOI(String dOI) {
		DOI = dOI;
	}
	/**
	 * @return the tituloCapitulo_EN
	 */
	public String getTituloCapitulo_EN() {
		return tituloCapitulo_EN;
	}
	/**
	 * @param tituloCapitulo_EN the tituloCapitulo_EN to set
	 */
	public void setTituloCapitulo_EN(String tituloCapitulo_EN) {
		this.tituloCapitulo_EN = tituloCapitulo_EN;
	}
	/**
	 * @return the flagDivulgacaoCientifica
	 */
	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}
	/**
	 * @param flagDivulgacaoCientifica the flagDivulgacaoCientifica to set
	 */
	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

}
