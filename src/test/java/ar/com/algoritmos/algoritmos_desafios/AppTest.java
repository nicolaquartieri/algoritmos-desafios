package ar.com.algoritmos.algoritmos_desafios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import ar.com.algoritmos.Capicua;
import ar.com.algoritmos.Colleciones;
import ar.com.algoritmos.ListNode;
import ar.com.algoritmos.Node;
import ar.com.algoritmos.Numeros;
import ar.com.algoritmos.Numeros.Change;
import ar.com.algoritmos.algoritmos.Nodo;
import ar.com.algoritmos.Primos;
import ar.com.algoritmos.Stuff;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void esPrimoTest() {		
		boolean resultado = false;
		
		resultado = Primos.isPrimo(3);
		
		assertTrue(resultado);
    }
	
	@Test
    public void sonPrimosTest() {
		List<Integer> lista22;
		List<Integer> primos = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
		List<Integer> lista;
		boolean resultado = false;
		
		lista = Primos.obtenerListaDePrimos(2, 100);
		resultado = lista.size() == primos.size();
		
		assertTrue(resultado);
    }
	
	@Test
	public void esCapicua() {
		String palabra = "abba";
		boolean resultado = false;
		
		resultado = Capicua.isCapicua(palabra);
		
		assertTrue(resultado);
	}
	
	@Test
	public void reverseWord() {
		String palabra = "hola mundo";		
		
		palabra = Capicua.reverse(palabra);
		
		assertTrue(palabra.equalsIgnoreCase("aloh odnum"));
	}
	
	@Test
	public void reverseStringStack() {
		String palabra = "hola mundo";		
		
		palabra = Capicua.reverseStack(palabra);
		
		assertTrue(palabra.equalsIgnoreCase("odnum aloh"));
	}
	
	@Test
	public void getClosestToZero() {
		int[] a = {4, 2, 7};
		int resultado;
		
		resultado = Numeros.getClosestToZero(a);
		
		assertTrue(resultado == 2);
	}
	
	@Test
	@Ignore
	public void getAverageNode() {
		// Terminar !!
		assertEquals(2, 2);
	}
	
	@Test
	public void getSumOfNumbers() {
		String s = "12 some text 3  8";
		int resultado = 0;
		
		resultado = Numeros.getSumOfNumbers(s);
		
		assertEquals(23, resultado);
	}
	
	@Test 
	public void getIntersection() {
		Set<Object> a = new HashSet<Object>();
		a.add(1);a.add(2);a.add(3);
		Set<Object> b = new HashSet<Object>();
		b.add(4);b.add(2);b.add(5);
		Set<Object> intersection = new HashSet<Object>();
		
		intersection = Numeros.getIntersection(a, b);
		
		assertTrue(intersection.contains(2));		
	}
	
	@Test
	@Ignore
	public void reverseList() {
		// Terminar !!
		ListNode root = new Node(1);
		ListNode node2 = new Node(2);		
		ListNode node3 = new Node(3);
		node2.setNext(node3);
		root.setNext(node2);
		String ordenOriginal = "123";
		String ordenFinal = new String();
		
		ListNode lista = Colleciones.reverse(root);
		//ordenFinal =  
		
		//assertTrue(ordenOriginal.equalsIgnoreCase(ordenFinal));
		fail();
	}
	
	@Test
	public void correctChange() {
		int cents = 164;
		Change changeAssert = new Change(1, 2, 1, 0, 4);
		
		Change change = Numeros.getCorrectChange(cents);
		
		assertTrue(changeAssert.getDollars() == change.getDollars());
		assertTrue(changeAssert.getCents() == change.getCents());
		assertTrue(changeAssert.getNickels() == change.getNickels());
		assertTrue(changeAssert.getDimes() == change.getDimes());
		assertTrue(changeAssert.getQuarters() == change.getQuarters());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void reverseArray() {
		// Arrange
		Object[] a = new Object[]{'a', 'b' ,'c'};
		List<Object> lista = Arrays.asList(a);
		
		// Act
		Collections.reverse(lista);
		
		// Assert
		assertEquals(new Object[]{'c', 'b' ,'a'}, lista.toArray());
		
	}
	
	@Test
	public void testCountOfOnes() {
		// Arrange
		int value = 6;
		
		// Act
		int resultado = Stuff.getCountOfOnes(value);
		
		// Assert
		assertTrue(2 == resultado);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void arbolBinarioCrearNodo() {
		// Arrange
		Nodo nodo = null;
		
		// Act
		nodo = Nodo.crear(null, 1, "valor");
		
		// Assert
		Assert.assertTrue( nodo != null ); 
		Assert.assertTrue( nodo.getRaiz() == 1 ); 
		Assert.assertTrue( nodo.getContenido().equalsIgnoreCase("valor") );
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void arbolBinarioInsertarNodo() {
		// Arrange
		Nodo nodoRaiz = Nodo.crear(null, 1, "valor1");;
		Nodo nodoHijo = null;
		
		// Act
		nodoRaiz = Nodo.crear(nodoHijo, 2, "valor2");
		
		// Assert
		Assert.assertTrue( nodoRaiz.getNodoDer() != null );
		Assert.assertTrue( nodoRaiz.getNodoDer().getRaiz() == 2 ); 
		Assert.assertTrue( nodoRaiz.getNodoDer().getContenido().equalsIgnoreCase("valor") );
	}
	
	@Test
	@Ignore
	public void arbolBinarioBuscar() {
		// Arrange
		
		// Act
		
		// Assert
	}
	
	@Test
	@Ignore
	public void test() {
		// Arrange
		
		// Act
		
		// Assert		
	}
}
