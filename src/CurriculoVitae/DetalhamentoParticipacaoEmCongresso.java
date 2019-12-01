package CurriculoVitae;

public abstract class DetalhamentoParticipacaoEmCongresso extends ParticipacaoEmCongresso{
	
	private String nomeEvento;
	private int codInstituicao;
	private String nomeInstituicao;
	private String localEvento;
	private String cidadeEvento;
	private String nomeEvento_EN;
	
	
	/**
	 * @return the nomeEvento
	 */
	public String getNomeEvento() {
		return nomeEvento;
	}
	/**
	 * @param nomeEvento the nomeEvento to set
	 */
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	/**
	 * @return the codInstituicao
	 */
	public int getCodInstituicao() {
		return codInstituicao;
	}
	/**
	 * @param codInstituicao the codInstituicao to set
	 */
	public void setCodInstituicao(int codInstituicao) {
		this.codInstituicao = codInstituicao;
	}
	/**
	 * @return the nomeInstituicao
	 */
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	/**
	 * @param nomeInstituicao the nomeInstituicao to set
	 */
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	/**
	 * @return the localEvento
	 */
	public String getLocalEvento() {
		return localEvento;
	}
	/**
	 * @param localEvento the localEvento to set
	 */
	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}
	/**
	 * @return the cidadeEvento
	 */
	public String getCidadeEvento() {
		return cidadeEvento;
	}
	/**
	 * @param cidadeEvento the cidadeEvento to set
	 */
	public void setCidadeEvento(String cidadeEvento) {
		this.cidadeEvento = cidadeEvento;
	}
	/**
	 * @return the nomeEvento_EN
	 */
	public String getNomeEvento_EN() {
		return nomeEvento_EN;
	}
	/**
	 * @param nomeEvento_EN the nomeEvento_EN to set
	 */
	public void setNomeEvento_EN(String nomeEvento_EN) {
		this.nomeEvento_EN = nomeEvento_EN;
	}
	
}
