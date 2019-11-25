import java.io.FileNotFoundException;
import java.io.FileReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class docente {

	private static void lerXml() {
		FileReader reader = null;
		try {
			//carrega o arquivo XML para um objeto reader
			reader = new FileReader("D:\\UFRPE\\Programacao\\eclipse\\projeto_p2\\curriculo.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Cria o objeto xstream
		
		XStream xStream = new XStream(new DomDriver());
		
					
		//informamos as tags que serao lidas
		//como foi feito no metodo gerarXml002
		xStream.alias("Contato", Contato.class);
		xStream.aliasField("Endereco", Contato.class, "endereco");
		xStream.aliasField("Telefones", Contato.class, "telefones");
		xStream.alias("Telefone", Telefone.class);
		//cria um objeto Contato,
		//contendo os dados do xml
		Contato contato = (Contato) xStream.fromXML(reader);
		//Exibimos no console o resultado
		System.out.println(contato.toString());
	}

	
}
