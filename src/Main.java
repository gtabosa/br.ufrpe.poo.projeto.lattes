import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		String arq = "dados_lattes.txt";
		
/*
        // abertura do arquivo
        BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\temp\\poema.txt"), "UTF-8"));
         
        // loop que lê e imprime todas as linhas do arquivo
        String linha = myBuffer.readLine();
 
        while (linha != null) {
            System.out.println(linha);
            linha = myBuffer.readLine();
        }
 
        myBuffer.close();
 
    }
		
	*/	
		/*
		String texto ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
		
		if(Arquivo.Write(arq, texto)) 
			System.out.println("Arquivo salvo com sucesso");
		else
			System.out.println("Erro ao salvar arquivo");
			*/
		
	
		String texto = Arquivo.Read(arq);
	if(texto.isEmpty())
		System.out.println("Erro ao lerr arquivo");
	else
		System.out.println(texto);
	
	
	}
			
}					
			