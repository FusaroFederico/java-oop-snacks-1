package org.lessons.opp.snacks;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		//String txtPath = "C:\\Users\\fusar\\Documents\\Boolean\\esercizi-backend\\java-oop-snacks-1\\readme.txt";
		//System.out.println(TextReader.readFirstLine(txtPath));
		
		ArrayList<String> nomi = new ArrayList<String>();
		nomi.add("Riccardo");
		nomi.add("Giuseppe");
		nomi.add("Francesco");
		nomi.add("Anna");
		nomi.add("Flavia");
		
		String nome = "Riccardo";
		System.out.println(ArrayListUtils.getIndexOf(nomi, nome));
	}

}
