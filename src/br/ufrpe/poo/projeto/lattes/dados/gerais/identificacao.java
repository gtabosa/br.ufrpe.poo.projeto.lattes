package br.ufrpe.poo.projeto.lattes.dados.gerais;
import java.util.ArrayList;

public class identificacao {
	private String nome;
	private ArrayList<String> citacoesBibliograficas;
	private String lattesId;
	private ArrayList<idiomas> idioma;
	private endereco endereco;
	
	public identificacao(String nome, ArrayList<String> citacoesBibliograficas, String lattesId) {
		super();
		this.nome = nome;
		this.citacoesBibliograficas = citacoesBibliograficas;
		this.lattesId = lattesId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getCitacoesBibliograficas() {
		return citacoesBibliograficas;
	}

	public void setCitacoesBibliograficas(ArrayList<String> citacoesBibliograficas) {
		this.citacoesBibliograficas = citacoesBibliograficas;
	}

	public String getLattesId() {
		return lattesId;
	}

	public void setLattesId(String lattesId) {
		this.lattesId = lattesId;
	}
	
		}
