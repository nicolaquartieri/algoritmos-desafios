package ar.com.algoritmos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Numeros {

	public static interface Node {
	    int getValue();
	    List<Node> getChildren();
	}
	
	public static double getAverage(Node root) {
		return 0;		
	}
	
	public static int getClosestToZero(int[] a) {		
		Arrays.sort(a); 			
			
		return a[0];
	}

	public static int getSumOfNumbers(String s) {
		String[] lista = s.split(" ");		
		int suma = 0;
		StringBuffer contact = new StringBuffer();
		boolean ok = false;
		
		for(int i = 0 ; i < lista.length ; i++) {
			String numero = lista[i];
			
			for (int j = 0; j < numero.length() ; j++)
				if (Character.isDigit(numero.charAt(j))) {
					contact.append(numero.charAt(j));
					ok = true;
				} else { 
					break;
				}
						
			if (ok) 
				suma = suma + Integer.valueOf(contact.toString());
			
			contact = new StringBuffer();
			ok = false;
		}
		
		return suma;
	}

	public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
		Set<Object> intersection = new HashSet<Object>(a);
		
		intersection.retainAll(b);
		
		return intersection;
	}
	
	public static Change getCorrectChange(int cents) {
		int dollars = cents / 100;
		int quarters = (cents - (dollars * 100)) / 25;
		int dimes = ((cents - (dollars * 100)) - (quarters * 25)) / 10;
		int nickels = ((cents - (dollars * 100)) - (quarters * 25) - (dimes * 10)) / 5;
		int cent = ((cents - (dollars * 100)) - (quarters * 25) - (dimes * 10) - (nickels * 5))  / 1;
		
		Change change = new Change(dollars,
								   quarters,
								   dimes,
								   nickels,
								   cent);
		if (cent < 0)
			return null;
		return change;
    }
	
	public static class Change {
        private final int _dollars;
        private final int _quarters; //25 cents
        private final int _dimes; // 10 cents
        private final int _nickels; // 5 cents
        private final int _cents; // 1 cent


        public Change(int dollars, int quarters, int dimes, int nickels, int cents) {
            _dollars = dollars;
            _quarters = quarters;
            _dimes = dimes;
            _nickels = nickels;
            _cents = cents;
        }


        public int getDollars() {
            return _dollars;
        }


        public int getQuarters() {
            return _quarters;
        }


        public int getDimes() {
            return _dimes;
        }


        public int getNickels() {
            return _nickels;
        }


        public int getCents() {
            return _cents;
        }
    }
}
