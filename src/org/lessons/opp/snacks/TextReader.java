package org.lessons.opp.snacks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
	
	// metodo statico che legge la prima riga di un file di testo
	// ricevendo come parametro il suo percorso di rete sotto forma
	// di stringa
	public static String readFirstLine(String filePath) throws IOException{
		String firstLine = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			firstLine = br.readLine();
			br.close();
		} catch (IOException e) {
			System.out.println("Attenzione, si è verificata un'eccezione: " + e.getMessage());
		}
		return firstLine;
	}

}
