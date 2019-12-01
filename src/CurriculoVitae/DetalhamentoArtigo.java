package CurriculoVitae;

public class DetalhamentoArtigo extends ArtigosPublicados{
	
	private String tituloPeriodicoOUrevista;
	private int ISSN;
	private int volume;
	private String fasciculo;
	private int serie;
	private int pagInicial;
	private int pagFinal;
	private String localPublicacao;
	
	
	/**
	 * @return the tituloPeriodicoOUrevista
	 */
	public String getTituloPeriodicoOUrevista() {
		return tituloPeriodicoOUrevista;
	}
	/**
	 * @param tituloPeriodicoOUrevista the tituloPeriodicoOUrevista to set
	 */
	public void setTituloPeriodicoOUrevista(String tituloPeriodicoOUrevista) {
		this.tituloPeriodicoOUrevista = tituloPeriodicoOUrevista;
	}
	/**
	 * @return the iSSN
	 */
	public int getISSN() {
		return ISSN;
	}
	/**
	 * @param iSSN the iSSN to set
	 */
	public void setISSN(int iSSN) {
		ISSN = iSSN;
	}
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	/**
	 * @return the fasciculo
	 */
	public String getFasciculo() {
		return fasciculo;
	}
	/**
	 * @param fasciculo the fasciculo to set
	 */
	public void setFasciculo(String fasciculo) {
		this.fasciculo = fasciculo;
	}
	/**
	 * @return the serie
	 */
	public int getSerie() {
		return serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(int serie) {
		this.serie = serie;
	}
	/**
	 * @return the pagInicial
	 */
	public int getPagInicial() {
		return pagInicial;
	}
	/**
	 * @param pagInicial the pagInicial to set
	 */
	public void setPagInicial(int pagInicial) {
		this.pagInicial = pagInicial;
	}
	/**
	 * @return the pagFinal
	 */
	public int getPagFinal() {
		return pagFinal;
	}
	/**
	 * @param pagFinal the pagFinal to set
	 */
	public void setPagFinal(int pagFinal) {
		this.pagFinal = pagFinal;
	}
	/**
	 * @return the localPublicacao
	 */
	public String getLocalPublicacao() {
		return localPublicacao;
	}
	/**
	 * @param localPublicacao the localPublicacao to set
	 */
	public void setLocalPublicacao(String localPublicacao) {
		this.localPublicacao = localPublicacao;
	}

}
