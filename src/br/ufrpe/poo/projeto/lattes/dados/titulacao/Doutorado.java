package br.ufrpe.poo.projeto.lattes.dados.titulacao;

public class Doutorado extends formacaoAcademica {
	
	protected String orientador;
	protected String bolsista;
	
public Doutorado(String curso, String local, String detalhes, String titulo, String orientador, String bolsista) {
	super(curso,local,detalhes,titulo);
	this.orientador=orientador;
	this.bolsista=bolsista;
}
	

	public String getCurso() {
		return super.curso;
	}
	public void setCurso(String curso) {
		super.curso = curso;

	}
	public String getLocal() {
		return super.local;
	}
	public void setLocal(String local) {
		super.local = local;
	}
	public String getDetalhes() {
		return super.detalhes;
	}
	public void setDetalhes(String detalhes) {
		super.detalhes = detalhes;
	}
	public String getTitulo() {
		return super.titulo;
	}
	public void setTitulo(String titulo) {
		super.titulo = titulo;
	}
	public String getOrientador() {
		return orientador;
	}
	public void setOrientador(String orientador) {
		orientador = orientador;
	}
	public String getBolsista() {
		return bolsista;
	}
	public void setBolsista(String bolsista) {
		bolsista = bolsista;
	}
	


}
