import java.util.Date;

public class CurriculoVitae {

	private String sistemaOrigemXml;
	private String numeroIdentificador;
	private Date dataAtualizacao;
	private String horaAtualizacao;
	private DadosGerais dadosGerais;
	
	
	
	public String getSistemaOrigemXml() {
		return sistemaOrigemXml;
	}
	public void setSistemaOrigemXml(String sistemaOrigemXml) {
		this.sistemaOrigemXml = sistemaOrigemXml;
	}
	public String getNumeroIdentificador() {
		return numeroIdentificador;
	}
	public void setNumeroIdentificador(String numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getHoraAtualizacao() {
		return horaAtualizacao;
	}
	public void setHoraAtualizacao(String horaAtualizacao) {
		this.horaAtualizacao = horaAtualizacao;
	}

	/*public CurriculoVitae(DadosGerais dadosGerais) {
		super();
		this.sistemaOrigemXml = sistemaOrigemXml;
		this.numeroIdentificador = numeroIdentificador;
		this.dataAtualizacao = dataAtualizacao;
		this.horaAtualizacao = horaAtualizacao;
		this.dadosGerais = dadosGerais;
	}*/

	public DadosGerais getDadosGerais() {
		return dadosGerais;
	}

	public void setDadosGerais(DadosGerais dadosGerais) {
		this.dadosGerais = dadosGerais;
	}
}
