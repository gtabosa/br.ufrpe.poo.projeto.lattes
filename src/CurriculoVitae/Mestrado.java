package CurriculoVitae;

import java.util.ArrayList;

public class Mestrado implements FormacaoAcademica {
	
	private String local;//G, M, D
	private int detalhes;//G, M, D
	private String curso;//G, M, D
	private int titulo;//G, M, D
	ArrayList<String> palavraChaves = new ArrayList();
	ArrayList<String> grandeArea = new ArrayList();
	ArrayList<String> area = new ArrayList();
	ArrayList<String> subArea = new ArrayList();	

	
	/*Metodos Get e Set abaixo*/
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(int detalhes) {
		this.detalhes = detalhes;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public ArrayList<String> getPalavraChaves() {
		return palavraChaves;
	}

	public void setPalavraChaves(ArrayList<String> palavraChaves) {
		this.palavraChaves = palavraChaves;
	}

	public ArrayList<String> getGrandeArea() {
		return grandeArea;
	}

	public void setGrandeArea(ArrayList<String> grandeArea) {
		this.grandeArea = grandeArea;
	}

	public ArrayList<String> getArea() {
		return area;
	}

	public void setArea(ArrayList<String> area) {
		this.area = area;
	}

	public ArrayList<String> getSubArea() {
		return subArea;
	}

	public void setSubArea(ArrayList<String> subArea) {
		this.subArea = subArea;
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
