package ar.com.algoritmos.kotlin

import org.junit.Assert
import org.junit.Test

class AppTest {

    @Test
    fun structural_equality() {
        val value = "String"
        val value_2 = "String"

        Assert.assertTrue(value == value_2)
    }

    @Test
    fun companion_object() {
        Assert.assertTrue(CompanionExample.showMsj().equals("showMsj"))
    }
}

class CompanionExample {
    companion object {
        fun showMsj(): String {
            val msj = "showMsj"
            println("showMsj")
            return msj
        }
    }
}