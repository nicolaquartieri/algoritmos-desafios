package ar.com.algoritmos;

import java.util.ArrayList;
import java.util.List;

public class Primos {

	public static boolean isPrimo(int valor) {
		boolean esPrimo = true;
		int contador = 2;
		
		while ( esPrimo && contador != valor) {
			if (valor % contador == 0)
				esPrimo = false;
			contador++;
		}
		
		return esPrimo;
	}

	public static List<Integer> obtenerListaDePrimos(int desde, int hasta) {
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i = desde; i < hasta ; i++)
			if (isPrimo(i))
				lista.add(i);
		
		return lista;
	}
	
}
