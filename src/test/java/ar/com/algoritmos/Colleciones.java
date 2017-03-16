package ar.com.algoritmos;

import java.util.*;

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

	/**
	 * Reverse the input array.
	 * @param list The Array.
	 * @return
	 */
	public static Object[] reverseArray(Object[] list) {
		List<Object> lista = Arrays.asList(list);

		Collections.reverse(lista);
		
		return lista.toArray();
    }

	/**
	 * Remove duplicated elements from the array.
	 * @param list The array.
	 * @return A new array with no duplications and ir asc order.
	 */
	public static Integer[] duplicatesRemove(Integer[] list) {
		HashSet<Integer> hashSet = new HashSet<>();

		for (int i = 0 ; i < list.length ; i++) {
			hashSet.add(list[i]);
		}

		return hashSet.toArray(new Integer[0]);
	}

	/**
	 * Detect duplicated numbers in the list.
	 * @param list The array.
	 * @return True is there is a duplicated number false otherwise.
	 */
	public static boolean duplicatesDetect(Integer[] list) {
		int size = list.length;
		Set set = new HashSet();

		for (int i = 0 ; i < size ; i++) {
			if (!set.add(list[i])) {
				return true;
			}
		}

		return false;
	}
}
