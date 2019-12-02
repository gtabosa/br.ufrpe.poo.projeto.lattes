package br.ufrpe.poo.projeto.lattes.dados.titulacao;

import java.util.ArrayList;
import java.util.Date;

public class PosDoutorado extends formacaoAcademica{

	protected Date dataInicio;
	protected Date dataFinal;
	
	protected ArrayList<Area> area = new ArrayList();
	protected ArrayList<SubArea> subArea = new ArrayList();
	protected ArrayList<GrandeArea> GrandeArea = new ArrayList();
	protected ArrayList<PalavrasChave> palavraChave = new ArrayList();
	
public PosDoutorado(String curso, String local, String detalhes, String titulo, Date dataInicio,Date dataFinal) {
	super(curso,local,detalhes,titulo);
	this.dataFinal=dataInicio;
	this.dataFinal=dataFinal;
	
}

public Date getDataInicio() {
	return dataInicio;
}

public void setDataInicio(Date dataInicio) {
	this.dataInicio = dataInicio;
}

public Date getDataFinal() {
	return dataFinal;
}

public void setDataFinal(Date dataFinal) {
	this.dataFinal = dataFinal;
}

public ArrayList<Area> getArea() {
	return area;
}

public void setArea(ArrayList<Area> area) {
	this.area = area;
}

public ArrayList<SubArea> getSubArea() {
	return subArea;
}

public void setSubArea(ArrayList<SubArea> subArea) {
	this.subArea = subArea;
}

public ArrayList<GrandeArea> getGrandeArea() {
	return GrandeArea;
}

public void setGrandeArea(ArrayList<GrandeArea> grandeArea) {
	GrandeArea = grandeArea;
}

public ArrayList<PalavrasChave> getPalavraChave() {
	return palavraChave;
}

public void setPalavraChave(ArrayList<PalavrasChave> palavraChave) {
	this.palavraChave = palavraChave;
}


	
}
