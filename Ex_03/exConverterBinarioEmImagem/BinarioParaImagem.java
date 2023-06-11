package exConverterBinarioEmImagem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinarioParaImagem {
	 public static void main(String[] args) {
	        String arquivoBinario = "imagem.bin";
	        String imagemPNG = "imagem.png";

	        try (FileInputStream fileInputStream = new FileInputStream(arquivoBinario);
	             FileOutputStream fileOutputStream = new FileOutputStream(imagemPNG)) {

	            int i;
	            while ((i = fileInputStream.read()) != -1) {
	                fileOutputStream.write(i);
	            }

	            System.out.println("Conversão concluída. O arquivo binário foi convertido para a imagem PNG.");
	        } catch(FileNotFoundException e){
	        	System.err.println("Excecao: Arquivo nao encontrado !"+e.getMessage());
	        } catch (IOException e) {
	        	System.err.println("Excecao: "+e.getMessage());
	        }
	    }
}
