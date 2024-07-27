package org.lessons.opp.snacks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		//String txtPath = "C:\\Users\\fusar\\Documents\\Boolean\\esercizi-backend\\java-oop-snacks-1\\readme.txt";
		//System.out.println(TextReader.readFirstLine(txtPath));
		
		//ArrayList<String> nomi = new ArrayList<String>();
		//nomi.add("Riccardo");
		//nomi.add("Giuseppe");
		//nomi.add("Francesco");
		//nomi.add("Anna");
		//nomi.add("Flavia");
		
		//String nome = "Riccardo";
		//System.out.println(ArrayListUtils.getIndexOf(nomi, nome));
		
		HashSet<String> set1 = new HashSet<String>();
        set1.add("mela");
        set1.add("banana");
        set1.add("pesca");
        set1.add("melone");

        HashSet<String> set2 = new HashSet<String>();
        set2.add("melone");
        set2.add("mela");
        set2.add("pesca");
        set2.add("banana");
        
        System.out.println(HashSetUtils.compareTo(set1, set2));
	}

}
