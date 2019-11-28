// Site de referencia para importacao de xml
// http://www.caelum.com.br/apostila-java-testes-xml-design-patterns/trabalhando-com-xml/#4-4-xstream

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

//Imports para manipular XML
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import bean.Endereco;
import bean.Fornecedor;
import bean.Produto;

public class Main {

	public static void main(String[] args) /*throws Exception*/{
		//Fornecedor forn = setFornecedor();
		CurriculoVitae curriculo =setCurriculoVitae() ;
		//DadosGerais dadosGerais = setDadosGerais();
		
				
		//XStream xstream = new XStream(new DomDriver());
		//xstream.alias("CURRICULO-VITAE", CurriculoVitae.class);
		//xstream.alias("DADOS-GERAIS", DadosGerais.class);
		//xstream.alias("Fornecedor", Fornecedor.class);
		//xstream.alias("produto", Produto.class);
		//xstream.registerConverter(new ConverteData());
		//String xml = xstream.toXML(forn);
		//String xml = xstream.toXML(curriculo);
		
		//System.out.println(xml);
		//gerarArquivo(xml);
		buscaArquivo();
		// TODO Auto-generated method stub
		}

	public static void gerarArquivo(String xml) {
		PrintWriter print = null;
		try {
			File file = new File("C:\\Users\\Gustavo\\Desktop\\arquivoGerado.xml");
			print = new PrintWriter(file);
			print.write(xml);
			print.flush();
			print.close();
		}catch(FileNotFoundException ex){
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
			} finally {
				print.close();
			}
	}
	
	public static void buscaArquivo() {
		try {
			FileReader ler = new FileReader("C:\\Users\\Gustavo\\Desktop\\curriculo.xml");
			XStream xstream = new XStream(new DomDriver());
			xstream.alias("CURRICULO-VITAE", CurriculoVitae.class);
			//xstream.alias("DADOS-GERAIS", DadosGerais.class);
			//xstream.alias("Fornecedor", Fornecedor.class);
			//xstream.alias("produto", Produto.class);
			
			xstream.registerConverter(new ConverteData());
			
			//Fornecedor forn =(Fornecedor) xstream.fromXML(ler);
			//DadosGerais dados = (DadosGerais) xstream.fromXML(ler);
			CurriculoVitae curriculo = (CurriculoVitae) xstream.fromXML(ler);
			//DadosGerais dadosgerais = (DadosGerais) xstream.fromXML(ler);
			
			System.out.println("Sistema de Origem : " + curriculo.getSistemaOrigemXml());
			System.out.println("Data de Atualizacao : " + curriculo.getDataAtualizacao());
			System.out.println("Numero identificador : " + curriculo.getNumeroIdentificador());
			
			//System.out.println("Nome : " + dados.getNome());
			//System.out.println("Nome : " + dados.getPaisNacionalidade());
			
			//System.out.println("Nome : " + forn.getNome());
			//System.out.println("Nome : " + forn.getCnpj());
			
		}catch(FileNotFoundException ex){
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
		}finally {
		}
	}
	
	private static CurriculoVitae setCurriculoVitae() {
		CurriculoVitae curriculo = new 	CurriculoVitae();
		curriculo.setDadosGerais(setDadosGerais());
		//DadosGerais dadosGerais = new DadosGerais();
		//curriculo.setDadosGerais(dadosGerais);
		
		return curriculo;
	}
	
	private static DadosGerais setDadosGerais() {
		DadosGerais dadosGerais = new DadosGerais();
		
		//DadosGerais dadosGerais = new DadosGerais();
		//curriculo.setDadosGerais(dadosGerais);
		
		return dadosGerais;
	}
	
/*	
	private static Fornecedor setFornecedor() {
		Fornecedor forn = new Fornecedor();
		Endereco end = new Endereco();
		Produto prod = new Produto();
		Produto prod2 = new Produto();
		List<Produto> listProd = new ArrayList<Produto>();
		
		forn.setNome("Informatica e CIA");
		forn.setCelular("81 88558855");
		forn.setTelefone("81 22552255");
		forn.setCnpj("123456789");
		forn.setEmail("teste@teste.com.br");
		forn.setNomeFantasia("Informatica Fantasia");
		forn.setInsest("123456");
		forn.setDataCadastro(new Date());
		
		end.setBairro("Centro");
		end.setRua("Rua Afonso");
		end.setCidade("Recife");
		end.setEstado("PE");
		end.setCep("51150-150");
		
		prod.setCodigo(1);
		prod.setNome("Mouse");
		
		prod2.setCodigo(2);
		prod2.setNome("Notebook");
		
		listProd.add(prod);
		listProd.add(prod2);
		
		forn.setEndereco(end);
		forn.setProdutos(listProd);
		
		return forn;
	}*/
	
}



