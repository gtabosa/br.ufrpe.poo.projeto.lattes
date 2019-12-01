package CurriculoVitae;

public class DetalhamentoLivro extends LivrosPublicadosOUorganizados{
	
	private int numVolumes;
	private int numPaginas;
	private int ISBN;
	private int numEdicaoRevisao;
	private int numSerie;
	private String cidadeEditora;
	private String nomeEditora;
	
	
	/**
	 * @return the numVolumes
	 */
	public int getNumVolumes() {
		return numVolumes;
	}
	/**
	 * @param numVolumes the numVolumes to set
	 */
	public void setNumVolumes(int numVolumes) {
		this.numVolumes = numVolumes;
	}
	/**
	 * @return the numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}
	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
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
	 * @return the numEdicaoRevisao
	 */
	public int getNumEdicaoRevisao() {
		return numEdicaoRevisao;
	}
	/**
	 * @param numEdicaoRevisao the numEdicaoRevisao to set
	 */
	public void setNumEdicaoRevisao(int numEdicaoRevisao) {
		this.numEdicaoRevisao = numEdicaoRevisao;
	}
	/**
	 * @return the numSerie
	 */
	public int getNumSerie() {
		return numSerie;
	}
	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	/**
	 * @return the cidadeEditora
	 */
	public String getCidadeEditora() {
		return cidadeEditora;
	}
	/**
	 * @param cidadeEditora the cidadeEditora to set
	 */
	public void setCidadeEditora(String cidadeEditora) {
		this.cidadeEditora = cidadeEditora;
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
