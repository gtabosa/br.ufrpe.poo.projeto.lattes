import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Arquivo {

	public static String Read(String Caminho) {
		String conteudo="";
		try {
			FileReader arq = new FileReader(Caminho);
			
			FileInputStream arq1 = new FileInputStream(arq);
			InputStreamReader arq2 = new InputStreamReader(arq1);
			
			BufferedReader lerArq = new BufferedReader(arq2);
			String linha="";
			try {
				linha=lerArq.readLine();
				while(linha!=null) {
					conteudo+=linha+"\n";
					linha=lerArq.readLine();
					}
				arq.close();
				return conteudo;
			
		} catch (IOException ex) {
					conteudo = "Erro: Não foi possivel ler arquivo";
					return "";
					}
			
				}catch (FileNotFoundException ex) {
					conteudo = "Erro: Arquivo nao encontrado";
					return "";
					}finally {
						if(conteudo.contains("Erro")) {
							return "";
						}else {
							return conteudo;
							}
						}
							}
	
	public static boolean Write(String Caminho, String Texto) {
		try {
			FileWriter arq = new FileWriter(Caminho);
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(Texto);
			gravarArq.close();
			return true;
		}catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
	}
	}


	
	
