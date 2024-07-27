package org.lessons.opp.snacks;

import java.util.HashSet;

public class HashSetUtils {
	
	//  Dati due HashSet<String>, creare una funzione che verifichi se abbiano 
	//  o meno gli stessi elementi: se si ritornera' true, false altrimenti.
	public static boolean compareTo(HashSet<String> set1, HashSet<String> set2) {
		if (set1.size() != set2.size()) {
            return false;
        }
		for (String element : set1) {
			if (!set2.contains(element)) {
				return false;
			}
		}
		return true;
	}
}
