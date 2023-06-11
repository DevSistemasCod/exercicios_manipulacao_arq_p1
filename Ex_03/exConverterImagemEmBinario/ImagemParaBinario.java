package exConverterImagemEmBinario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImagemParaBinario {
	 public static void main(String[] args) {
	        String imagemPNG = "logo.png";
	        String arquivoBinario = "imagem.bin";

	        try (FileInputStream fileInputStream = new FileInputStream(imagemPNG);
	             FileOutputStream fileOutputStream = new FileOutputStream(arquivoBinario)) {

	            int i;
	            while ((i = fileInputStream.read()) != -1) {
	                fileOutputStream.write(i);
	            }

	            System.out.println("Conversão concluída. A imagem PNG foi convertida para o arquivo binário.");
	        } catch(FileNotFoundException e){
	        	System.err.println("Excecao: Arquivo nao encontrado !"+e.getMessage());
	        } catch (IOException e) {
	        	System.err.println("Excecao: "+e.getMessage());
	        }
	    }
}
