package org.lessons.opp.snacks;

import java.util.ArrayList;

public class ArrayListUtils {
	
	// Dato un ArrayList che sia una lista di nomi di invitati, scrivere una funzione 
	// che cerchi un elemento nell'ArrayList 
	// e qualora lo trovi restituisca il suo indice, -1 se non dovesse trovarlo.
	public static int getIndexOf(ArrayList<String> nomi, String nome) {
		int index = -1;
		for (int i = 0; i < nomi.size(); i++) {
			if (nomi.get(i).equals(nome)) {
				index = i;
			}
		}
		return index;
	}
}
