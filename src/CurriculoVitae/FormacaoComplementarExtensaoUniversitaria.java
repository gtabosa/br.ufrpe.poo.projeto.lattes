package CurriculoVitae;

import java.util.Date;

public class FormacaoComplementarExtensaoUniversitaria {

	private String anoInicio;
	private Date anoFim;
	private Date descricao;
	private String universidade;
	private String titulo;
	private String local;

	public String getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public Date getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(Date anoFim) {
		this.anoFim = anoFim;
	}

	public Date getDescricao() {
		return descricao;
	}

	public void setDescricao(Date descricao) {
		this.descricao = descricao;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
}
