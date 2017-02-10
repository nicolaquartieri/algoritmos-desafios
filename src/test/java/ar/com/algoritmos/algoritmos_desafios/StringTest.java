package ar.com.algoritmos.algoritmos_desafios;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class StringTest {

    @Test
    public void palindromeTrueExpectedTest() {
        // Arrange
        StringBuffer actual = new StringBuffer("rotor");

        // Act
        StringBuffer palindrome = actual.reverse();

        // Assert
        Assert.assertTrue(("rotor".equalsIgnoreCase(palindrome.toString())));
    }

    @Test
    public void palindromeFalseExpectedTest() {
        // Arrange
        StringBuffer actual = new StringBuffer("rotores");

        // Act
        StringBuffer palindrome = actual.reverse();

        // Assert
        Assert.assertTrue(("rotores".equalsIgnoreCase(palindrome.toString())));
    }

    @Test
    @Ignore
    public void test() {
        // Arrange

        // Act

        // Assert
    }
}
