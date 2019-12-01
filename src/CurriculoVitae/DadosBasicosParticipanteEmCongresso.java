package CurriculoVitae;

import java.util.Date;

public class DadosBasicosParticipanteEmCongresso extends ParticipacaoEmCongresso{
	private String natureza;
	private String titulo;
	private Date ano;
	private String pais;
	private String idioma;
	private String meioDivulgacao;
	private String homePAgeTrabalho;
	private boolean flagRelevancia;
	private String tipoParticipação;
	private String formaParticipacao;
	private String DOI;
	private String titulo_EN;
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
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
	 * @return the homePAgeTrabalho
	 */
	public String getHomePAgeTrabalho() {
		return homePAgeTrabalho;
	}
	/**
	 * @param homePAgeTrabalho the homePAgeTrabalho to set
	 */
	public void setHomePAgeTrabalho(String homePAgeTrabalho) {
		this.homePAgeTrabalho = homePAgeTrabalho;
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
	 * @return the tipoParticipação
	 */
	public String getTipoParticipação() {
		return tipoParticipação;
	}
	/**
	 * @param tipoParticipação the tipoParticipação to set
	 */
	public void setTipoParticipação(String tipoParticipação) {
		this.tipoParticipação = tipoParticipação;
	}
	/**
	 * @return the formaParticipacao
	 */
	public String getFormaParticipacao() {
		return formaParticipacao;
	}
	/**
	 * @param formaParticipacao the formaParticipacao to set
	 */
	public void setFormaParticipacao(String formaParticipacao) {
		this.formaParticipacao = formaParticipacao;
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
	 * @return the titulo_EN
	 */
	public String getTitulo_EN() {
		return titulo_EN;
	}
	/**
	 * @param titulo_EN the titulo_EN to set
	 */
	public void setTitulo_EN(String titulo_EN) {
		this.titulo_EN = titulo_EN;
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
