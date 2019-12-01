package CurriculoVitae;

public class DetalhamentoCapitulo extends CapitulosDeLivrosPublicados{
	
	private String tituloLivro;
	private String numVolumes;
	private int pagInicial;
	private int pagFinal;
	private int ISBN;
	private String numEdicaoRevista;
	private String numSerie;
	private String cidadeEditor;
	private String nomeEditora;
	
	
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
	 * @return the numVolumes
	 */
	public String getNumVolumes() {
		return numVolumes;
	}
	/**
	 * @param numVolumes the numVolumes to set
	 */
	public void setNumVolumes(String numVolumes) {
		this.numVolumes = numVolumes;
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
	 * @return the iSBN
	 */
	public int getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the numEdicaoRevista
	 */
	public String getNumEdicaoRevista() {
		return numEdicaoRevista;
	}
	/**
	 * @param numEdicaoRevista the numEdicaoRevista to set
	 */
	public void setNumEdicaoRevista(String numEdicaoRevista) {
		this.numEdicaoRevista = numEdicaoRevista;
	}
	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}
	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	/**
	 * @return the cidadeEditor
	 */
	public String getCidadeEditor() {
		return cidadeEditor;
	}
	/**
	 * @param cidadeEditor the cidadeEditor to set
	 */
	public void setCidadeEditor(String cidadeEditor) {
		this.cidadeEditor = cidadeEditor;
	}
	/**
	 * @return the nomeEditora
	 */
	public String getNomeEditora() {
		return nomeEditora;
	}
	/**
	 * @param nomeEditora the nomeEditora to set
	 */
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
}
