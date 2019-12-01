package CurriculoVitae;

import java.util.Date;

public class DadosBasicosParticipacaoBancaMestrado extends ParticipacaoEmBancaMestrado{
	
	private String natureza;
	private String tipo;
	private String titulo;
	private Date ano;
	private String pais;
	private String idioma;
	private String homePAge;
	private String DOI;
	private String titulo_EN;
	
	
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
	 * @return the homePAge
	 */
	public String getHomePAge() {
		return homePAge;
	}
	/**
	 * @param homePAge the homePAge to set
	 */
	public void setHomePAge(String homePAge) {
		this.homePAge = homePAge;
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
	
}