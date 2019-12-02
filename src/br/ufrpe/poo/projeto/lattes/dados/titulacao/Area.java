package br.ufrpe.poo.projeto.lattes.dados.titulacao;

public class Area {
		protected String areaPesquisa;

		public String getAreaPesquisa() {
			return areaPesquisa;
		}

		public void setAreaPesquisa(String areaPesquisa) {
			this.areaPesquisa = areaPesquisa;
		}

		public Area(String areaPesquisa) {
			super();
			this.areaPesquisa = areaPesquisa;
		}
	
}
