package CurriculoVitae;

public class Doutorado implements FormacaoAcademica{
	
	private String Curso;
	private String local;
	private String detalhes;
	private String titulo;
	private String orientador;
	private String bolsista;
	
	/*Metodos Get e Set abaixo*/
	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
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

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public String getBolsista() {
		return bolsista;
	}

	public void setBolsista(String bolsista) {
		this.bolsista = bolsista;
	}
	

	/* Metodos implementados da interface abaixo*/
	@Override
	public void sequenciaFormacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nivel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void codInstituicao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nomeInstituicao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void statusCurso() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anoInicio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anoConclusao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flagBolsa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void codAgenciaFinanciadora() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nomeAgencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void numIdOrientador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void codCursoCapes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nomeCurso_EN() {
		// TODO Auto-generated method stub
		
	}
	

}
