package ar.com.algoritmos;

import java.util.Stack;

public class Capicua {

	public static boolean isCapicua(String palabra) {
		StringBuffer original = new StringBuffer(palabra);
		StringBuffer palabraAux = new StringBuffer(palabra);
		boolean seguirProbando = true;
		
		int desde = 0;
		int hasta = palabraAux.length() - 1 - desde;
		while (seguirProbando && desde < hasta) {
			palabraAux.setCharAt(desde, palabraAux.charAt(hasta));
			if (!palabraAux.toString().equalsIgnoreCase(original.toString()))
				seguirProbando = false;
			
			desde++;
			hasta = palabraAux.length() - 1 - desde;
		}

		return seguirProbando;
	}

	public static String reverse(String palabra) {
		String[] lista = palabra.split(" ");
		StringBuffer resultado = new StringBuffer();
		
		for (int i = 0; i < lista.length ; i++) {
			StringBuffer aux = new StringBuffer(lista[i]);
			int desde = 0;
			int hasta = aux.length() - 1 - desde;
			while (desde < hasta) {
				char first = aux.charAt(desde);
				aux.setCharAt(desde, aux.charAt(hasta));
				aux.setCharAt(hasta, first);
				
				desde++;
				hasta = aux.length() - 1 - desde;
			}
			
			resultado.append(aux + " ");			
		}
		
		return resultado.substring(0, resultado.length() - 1);
	}

	public static String reverseStack(String p) {
		StringBuffer palabra = new StringBuffer(p);
		Stack<Character> pila = new Stack<Character>();
		int total = palabra.length();

		for (int i = 0; i < total; i++) {
			pila.push(palabra.charAt(i));
		}

		palabra = new StringBuffer();
		for (int i = 0; i < total; i++) {
			palabra.append(pila.pop());
		}
		return palabra.toString();
	}

}
