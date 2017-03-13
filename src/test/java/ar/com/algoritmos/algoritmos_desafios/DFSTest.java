package ar.com.algoritmos.algoritmos_desafios;

import ar.com.algoritmos.BFSDFS.GraphMatrix;
import ar.com.algoritmos.BFSDFS.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSTest {

    //Create the graph.
    GraphMatrix g = new GraphMatrix();

    @Before
    public void setup() {
        //Lets create nodes as given as an example in the article
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");

        //Add nodes, create edges between nodes
        g.addNode(A);
        g.addNode(B);
        g.addNode(C);
        g.addNode(D);
        g.addNode(E);
        g.addNode(F);
        g.setRootNode(A);

        g.connectNode(A, B);
        g.connectNode(A, C);
        g.connectNode(A, D);

        g.connectNode(B, E);
        g.connectNode(B, F);
        g.connectNode(C, F);
    }

    @Test
    public void dfsBasicTraverseTest() {
        //Arrange
        String[] expected = {"A", "B", "E", "F", "C", "D"};
        // In setup() method.

        //Act
        String[] result = g.dfs();

        //Assert
        Assert.assertArrayEquals(expected, result);
    }
}
