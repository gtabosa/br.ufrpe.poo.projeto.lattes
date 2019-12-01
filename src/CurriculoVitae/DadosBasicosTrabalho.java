package CurriculoVitae;

import java.util.Date;

public class DadosBasicosTrabalho extends TrabalhosEmEventos {
	
	private String natureza;
	private String tituloTrabalho;
	private Date anoTrabalho;
	private String paisEvento;
	private String idioma;
	private String meioDivulgacao;
	private String homePageTrabalho;
	private boolean flagRelevancia;
	private String DOI;
	private String tituloTrabalho_EN;
	private boolean flagDivulgacaoCientifica;
	
	
	
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public String getTituloTrabalho() {
		return tituloTrabalho;
	}
	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
	}
	public Date getAnoTrabalho() {
		return anoTrabalho;
	}
	public void setAnoTrabalho(Date anoTrabalho) {
		this.anoTrabalho = anoTrabalho;
	}
	public String getPaisEvento() {
		return paisEvento;
	}
	public void setPaisEvento(String paisEvento) {
		this.paisEvento = paisEvento;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getMeioDivulgacao() {
		return meioDivulgacao;
	}
	public void setMeioDivulgacao(String meioDivulgacao) {
		this.meioDivulgacao = meioDivulgacao;
	}
	public String getHomePageTrabalho() {
		return homePageTrabalho;
	}
	public void setHomePageTrabalho(String homePageTrabalho) {
		this.homePageTrabalho = homePageTrabalho;
	}
	public boolean isFlagRelevancia() {
		return flagRelevancia;
	}
	public void setFlagRelevancia(boolean flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}
	public String getDOI() {
		return DOI;
	}
	public void setDOI(String dOI) {
		DOI = dOI;
	}
	public String getTituloTrabalho_EN() {
		return tituloTrabalho_EN;
	}
	public void setTituloTrabalho_EN(String tituloTrabalho_EN) {
		this.tituloTrabalho_EN = tituloTrabalho_EN;
	}
	public boolean isFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}
	public void setFlagDivulgacaoCientifica(boolean flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

}
