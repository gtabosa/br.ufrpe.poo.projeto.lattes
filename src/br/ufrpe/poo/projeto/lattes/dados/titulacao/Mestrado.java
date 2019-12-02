package br.ufrpe.poo.projeto.lattes.dados.titulacao;

import java.util.ArrayList;

public class Mestrado extends formacaoAcademica {
	protected String orientador;
	
	protected ArrayList<Area> area = new ArrayList();
	protected ArrayList<SubArea> subArea = new ArrayList();
	protected ArrayList<GrandeArea> GrandeArea = new ArrayList();
	protected ArrayList<PalavrasChave> palavraChave = new ArrayList();
	
	public Mestrado(String curso, String local, String detalhes, String titulo, String orientador) {
		super(curso,local,detalhes,titulo);
		this.orientador=orientador;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public Mestrado(String orientador, ArrayList<Area> area, ArrayList<SubArea> subArea,
			ArrayList<br.ufrpe.poo.projeto.lattes.dados.titulacao.GrandeArea> grandeArea,
			ArrayList<PalavrasChave> palavraChave) {
		super();
		this.orientador = orientador;
		this.area = area;
		this.subArea = subArea;
		GrandeArea = grandeArea;
		this.palavraChave = palavraChave;
	}
	
	
}
