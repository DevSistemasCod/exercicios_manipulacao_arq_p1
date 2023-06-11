package exArqParaGZIPConversor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

public class ArqParaGZIPConversor {
	public static void main(String[] args) {
		String texto = "Olá Java";

		try (FileOutputStream fileOutputStream = new FileOutputStream("arquivo.txt")) {
			fileOutputStream.write(texto.getBytes(StandardCharsets.UTF_8));
			System.out.println("Arquivo criado .txt com sucesso!");
		} catch (IOException e) {
			System.out.println("Erro ao criar o arquivo. " + e.getMessage());
		}

		try (FileOutputStream fileOutputStream = new FileOutputStream("arquivo.gz");
				GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream)){

			gzipOutputStream.write(texto.getBytes(StandardCharsets.UTF_8));

			System.out.println("Arquivo criado .gz com sucesso!");
		} catch (IOException e) {
			System.out.println("Erro ao criar o arquivo. " + e.getMessage());
		}
	}
}
