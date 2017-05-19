package ar.com.algoritmos.algoritmos_desafios;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import ar.com.algoritmos.*;
import ar.com.algoritmos.compare.StudentComparison;
import ar.com.algoritmos.consumer_producer.Consumer;
import ar.com.algoritmos.consumer_producer.Producer;

import org.junit.Ignore;
import org.junit.Test;

import ar.com.algoritmos.Numeros.Change;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

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
	public void getSumOfNumbers() {
		String s = "12 some text 3  8";
		int resultado = 0;
		
		resultado = Numeros.getSumOfNumbers(s);
		
		assertEquals(23, resultado);
	}
	
	@Test 
	public void getIntersection() {
		Set<Object> a = new HashSet<>();
		a.add(1);a.add(2);a.add(3);
		Set<Object> b = new HashSet<>();
		b.add(4);b.add(2);b.add(5);
		Set<Object> intersection;
		
		intersection = Numeros.getIntersection(a, b);
		
		assertTrue(intersection.contains(2));
	}

	@Test
	public void duplicatesRemove() {
		// Arrange.
		Integer[] list =     {5, 3, 8, 5, 0, 1, 6};
		Integer[] expected = {0, 1, 3, 5, 6, 8}; // The result returned is in the natural order.
		Integer[] result;

		// Act.
		result = Colleciones.duplicatesRemove(list);

		// Assert.
		assertArrayEquals(expected, result);
	}

	@Test
	public void duplicatesDetectFalse() {
		// Arrange.
		boolean result = false;
		Integer[] list = {5, 3, 8, 2, 0, 1, 6};

		// Act.
		result = Colleciones.duplicatesDetect(list);

		// Assert.
		assertFalse(result);
	}

	@Test
	public void duplicatesDetectTrue() {
		// Arrange.
		boolean result = false;
		Integer[] list = {5, 3, 8, 5, 0, 1, 6};

		// Act.
		result = Colleciones.duplicatesDetect(list);

		// Assert.
		assertTrue(result);
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

	@Test
	public void testReverseSort() {
		// Arrange
		Comparator<Integer> reverseComparator = Collections.reverseOrder();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(3);list.add(2);list.add(10);

		// Act
		Collections.sort(list, reverseComparator);

		// Assert
		assertTrue(list.get(0) == 10);
		assertTrue(list.get(1) == 3);
		assertTrue(list.get(2) == 2);
		assertTrue(list.get(3) == 1);
	}

	@Test
	public void testAscSort() {
		// Arrange
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(3);list.add(2);list.add(10);

		// Act
		Collections.sort(list);

		// Assert
		assertTrue(list.get(0) == 1);
		assertTrue(list.get(1) == 2);
		assertTrue(list.get(2) == 3);
		assertTrue(list.get(3) == 10);
	}

	@Test
	public void testComparator() {
		// Arrange
		Student clare = new Student("clare", 16);
		Student john = new Student("john", 15);

		// Act
		int resultAge = StudentComparison.StudentComparator.AGE.compare(clare, john);
		int resultName = StudentComparison.StudentComparator.NAME.compare(clare, john);

		// Assert
		assertTrue(resultAge > 0);
		assertTrue(resultName != 0);
	}

	@Test
	public void testCreateTwoCriteriaComparators() {
		// Arrange
		Student clare = new Student("john", 15);
		Student john = new Student("john", 15);

		// Act
		Comparator<Student> comparator = StudentComparison.createComparator(Arrays.asList(StudentComparison.StudentComparator.AGE,
				StudentComparison.StudentComparator.NAME));
		int result = comparator.compare(clare, john);

		// Assert
		assertTrue(result == 0);
	}

	@Test
	public void testCreateTwoCriteriaWithSortOrderComparators() {
		// Arrange
		Student clare = new Student("clare", 15);
		Student john = new Student("john", 16);
		List<Student> list = new ArrayList<Student>();list.add(john);list.add(clare);
		Comparator<Student> comparator = StudentComparison.createComparatorWithSortOrder(StudentComparison.SortOrder.ASC,
				Arrays.asList(StudentComparison.StudentComparator.AGE,
				StudentComparison.StudentComparator.NAME));

		// Act
		Collections.sort(list, comparator);

		// Assert
		assertTrue(list.get(0).equals(clare));
		assertTrue(list.get(1).equals(john));
	}

	@Test
	public void testConsumerProducer() {
		// Arrange
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		Producer producer = new Producer(queue);
		Consumer consumer1 = new Consumer("consumer1", queue);
		Consumer consumer2 = new Consumer("consumer2", queue);

		// Act
		new Thread(consumer1).start();
		new Thread(consumer2).start();
		new Thread(producer).start();

		// Assert
		assertTrue(true);
	}

	@Test
	public void algo() {
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> mapExpected = new HashMap<>();
		mapExpected.put("1", 1);
		mapExpected.put("2", 2);
		mapExpected.put("3", 3);
		mapExpected.put("3", 3);

		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
//		map.put("4", 4);

		assertTrue(map.equals(mapExpected));
	}

	@Test
	public void algoas() {
		
	}
}
