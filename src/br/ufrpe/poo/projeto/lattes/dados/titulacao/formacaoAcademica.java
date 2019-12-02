package br.ufrpe.poo.projeto.lattes.dados.titulacao;

public abstract class formacaoAcademica {
	protected String curso; 
	protected String local;
	protected String detalhes;
	protected String titulo;
	
	public String toString() {
		return "Curso: "+ this.curso
				+"CPF: " + this.local
				+"Detalhes: "+ this.detalhes
				+"Titulo: " + this.titulo;
	}
	
	public formacaoAcademica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String título) {
		titulo = this.titulo;
	}
	
	public formacaoAcademica(String curso, String local, String detalhes, String título) {
		super();
		this.curso = curso;
		this.local = local;
		this.detalhes = detalhes;
		titulo = título;
	}

}
