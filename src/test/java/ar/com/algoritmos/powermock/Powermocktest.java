package ar.com.algoritmos.powermock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "ar.com.algoritmos.powermock.*")
public class Powermocktest {

    @Test
    public void simpleContructorMockTest() throws Exception {
        // Mock the class so the code inside the real constructor it's not going to be call.
        SimpleClass simpleClassMock = mock(SimpleClass.class);
        // Set the expectations.
        whenNew(SimpleClass.class).withNoArguments().thenReturn(simpleClassMock);
        // Act. (This is done to show interaction.
        SimpleClass simpleClass = new SimpleClass();
        // Verify.
        verifyNew(SimpleClass.class).withNoArguments();
    }

    @Test
    public void simpleFinalMockTest() {
        // Mock the class.
        // If we want to mock a specific final method rather than all the final ones inside an object, the Mockito.spy(T object) method may come in handy.
        SimpleClass simpleClassMock = mock(SimpleClass.class);
        // Set the expectations.
        when(simpleClassMock.helloWorld()).thenReturn("Hola Mundo!");
        // Act.
        String response = simpleClassMock.helloWorld();
        // Verify.
        verify(simpleClassMock).helloWorld();
        Assert.assertEquals("Hola Mundo!", response);
    }

    @Test
    public void simpleStaticMockTest() {
        // Mock the class.
        // Alternatively, we may use the Mockito.spy(Class<T> class) method to mock a specific one as demonstrated in the following section.
        mockStatic(SimpleClass.class);
        // Set the expectations.
        when(SimpleClass.helloName(Mockito.anyString())).thenReturn("Hello Dude");
        when(SimpleClass.firstMethod()).thenReturn("other method");
        // Act.
        String responseHelloName = SimpleClass.helloName("Something");
        // Assert
        Assert.assertEquals("Hello Dude", responseHelloName);
        // Verify that at least "helloName" called 1.
        // he verifyStatic method must be called right before any static method verification for PowerMockito
        // to know that the successive method invocation is what needs to be verified.
        verifyStatic(Mockito.times(1));
        SimpleClass.helloName(Mockito.anyString());
        verifyStatic(Mockito.never());
        SimpleClass.secondMethod();
    }

    @Test(expected = RuntimeException.class)
    public void simpleExceptionMockTest() throws Exception {
        doThrow(new RuntimeException()).when(SimpleClass.class);
        SimpleClass.secondMethod();
    }

    @Test
    public void simplePartialStaticMockTest() {
        // Partial mock the class.
        PowerMockito.spy(SimpleClass.class);
        // Set the expectations.
        when(SimpleClass.firstMethod()).thenReturn("other method");
        // Act.
        String result = SimpleClass.firstMethod();
        // Verify.
        verifyStatic();
        SimpleClass.firstMethod();
        // Assert.
        Assert.assertEquals("other method", result);
    }

    @Test
    public void simplePrivateMockTest() throws Exception {
        when()
    }
}
