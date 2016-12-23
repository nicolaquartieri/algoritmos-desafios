package ar.com.algoritmos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Colleciones {	
	
    public static ListNode reverse(ListNode node) {		
        /*
          Please implement this method to
          reverse a given linked list.
         */
    	    	
    	ListNode reverseList = new Node();
    	while (node.getNext() != null) {
    		
    	}
    	
    	return reverseList;
    }
    
    public static Object[] reverseArray(Object[] a) {
		List<Object> lista = Arrays.asList(a);
		
		// Act
		Collections.reverse(lista);
		
		return lista.toArray();
    }


	public static Integer[] duplicatesRemove(Integer[] list) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0 ; i < list.length ; i++) {
				hashSet.add(list[i]);
		}

		return hashSet.toArray(new Integer[0]);
	}
}
