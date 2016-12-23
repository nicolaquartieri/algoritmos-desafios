package ar.com.algoritmos.algoritmos_desafios;

import ar.com.algoritmos.search.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest {

    @Test
    public void binarySearchTest() {
        //Arraign.
        int[] list = {0, 1, 3, 5, 6, 7, 9, 11};

        //Act.
        int result = BinarySearch.binarySearch(list, 7);

        //Assert.
        Assert.assertEquals(7, result);
    }

    @Test
    public void binarySearchRecursiveTest() {
        //Arraign.
        int[] list = {0, 1, 3, 5, 6, 7, 9, 11};

        //Act.
        int result = BinarySearch.binarySearchRecursive(list, 7);

        //Assert.
        Assert.assertEquals(7, result);
    }
}
