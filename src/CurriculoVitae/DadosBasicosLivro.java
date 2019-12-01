package CurriculoVitae;

import java.util.Date;

public class DadosBasicosLivro extends LivrosPublicadosOUorganizados{
	
	private String tipo;
	private String natureza;
	private String tituloLivro;
	private Date ano;
	private String paisPublicacao;
	private String idioma;
	private String meioDivulgacao;
	private String homePageTrabalho;
	private boolean flagRelevancia;
	private String DOI;
	private String tituloLivro_EN;
	private boolean flagDivulgacaoCientifica;
	
	
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
	 * @return the tituloLivro
	 */
	public String getTituloLivro() {
		return tituloLivro;
	}
	/**
	 * @param tituloLivro the tituloLivro to set
	 */
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
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
	 * @return the tituloLivro_EN
	 */
	public String getTituloLivro_EN() {
		return tituloLivro_EN;
	}
	/**
	 * @param tituloLivro_EN the tituloLivro_EN to set
	 */
	public void setTituloLivro_EN(String tituloLivro_EN) {
		this.tituloLivro_EN = tituloLivro_EN;
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
