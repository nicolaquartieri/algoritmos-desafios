package ar.com.algoritmos.algoritmos_desafios;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    @Mock
    List otherList;

    @Test
    public void testListOneWay() {
        //Arrange
        List listMock = mock(List.class);

        //Act
        listMock.add("One");

        //Assert
        verify(listMock).add("One");
    }

    @Test
    public void testListOtherWay() {
        //Arrange
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("One");

        //Act
        listMock.add("One");

        //Assert
        verify(listMock);
    }

    @Test
    public void testListSetupRunner() {
        //Arrange

        //Act
        otherList.add("One");

        //Assert
        verify(otherList).add("One");
    }


}
