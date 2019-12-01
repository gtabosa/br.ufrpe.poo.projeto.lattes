package CurriculoVitae;

import java.util.Date;

public class DadosBasicosArtigo extends ArtigosPublicados{
	
	private String natureza;
	private String tituloArtigo;
	private Date anoArtigo;
	private String paisPublicacao;
	private String idioma;
	private String meioDivulgacao;
	private String homePAgetrabalho;
	private boolean flagRelevancia;
	private String DOI;
	private String tituloArtigo_EN;
	private boolean flagDivulgacaoCientifica;
	
	
	/**
	 * @return the natureza
	 */
	public String getNatureza() {
		return natureza;
	}
	/**
	 * @param natureza the natureza to set
	 */
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	/**
	 * @return the tituloArtigo
	 */
	public String getTituloArtigo() {
		return tituloArtigo;
	}
	/**
	 * @param tituloArtigo the tituloArtigo to set
	 */
	public void setTituloArtigo(String tituloArtigo) {
		this.tituloArtigo = tituloArtigo;
	}
	/**
	 * @return the anoArtigo
	 */
	public Date getAnoArtigo() {
		return anoArtigo;
	}
	/**
	 * @param anoArtigo the anoArtigo to set
	 */
	public void setAnoArtigo(Date anoArtigo) {
		this.anoArtigo = anoArtigo;
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
	 * @return the homePAgetrabalho
	 */
	public String getHomePAgetrabalho() {
		return homePAgetrabalho;
	}
	/**
	 * @param homePAgetrabalho the homePAgetrabalho to set
	 */
	public void setHomePAgetrabalho(String homePAgetrabalho) {
		this.homePAgetrabalho = homePAgetrabalho;
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
	 * @return the tituloArtigo_EN
	 */
	public String getTituloArtigo_EN() {
		return tituloArtigo_EN;
	}
	/**
	 * @param tituloArtigo_EN the tituloArtigo_EN to set
	 */
	public void setTituloArtigo_EN(String tituloArtigo_EN) {
		this.tituloArtigo_EN = tituloArtigo_EN;
	}
	/**
	 * @return the flagDivulgacaoCientifica
	 */
	public boolean isFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}
	/**
	 * @param flagDivulgacaoCientifica the flagDivulgacaoCientifica to set
	 */
	public void setFlagDivulgacaoCientifica(boolean flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}	
}
