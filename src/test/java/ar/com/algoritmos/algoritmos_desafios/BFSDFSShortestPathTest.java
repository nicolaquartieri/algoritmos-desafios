package ar.com.algoritmos.algoritmos_desafios;

import ar.com.algoritmos.BFSDFS.GraphMatrix;
import ar.com.algoritmos.BFSDFS.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BFSDFSShortestPathTest {

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
        Node G = new Node("G");
        Node H = new Node("H");

        //Add nodes, create edges between nodes
        g.addNode(A);
        g.addNode(B);
        g.addNode(C);
        g.addNode(D);
        g.addNode(E);
        g.addNode(F);
        g.addNode(G);
        g.addNode(H);
        g.setRootNode(B);

        g.connectNodeWithEdge(A, B, 6);
//        g.connectNodeWithEdge(A, G, 1);
        g.connectNodeWithEdge(A, D, 8);

        g.connectNodeWithEdge(B, E, 1);
        g.connectNodeWithEdge(B, F, 4);

        g.connectNodeWithEdge(C, F, 10);
        g.connectNodeWithEdge(C, H, 7);

//        g.connectNodeWithEdge(D, F, 3);

        g.connectNodeWithEdge(G, E, 9);
    }

    @Test
    public void bfsBasicTraverseTest() {
        //Arrange
        String[] expected = {"A", "B", "D", "G", "E", "F", "C", "H"};
        // In setup() method.

        //Act
        String[] result = g.bfs();

        //Assert
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void dfsBasicTraverseTest() {
        //Arrange
        String[] expected = {"A", "B", "E", "G", "F", "C", "H", "D"};
        // In setup() method.

        //Act
        String[] result = g.dfs();

        //Assert
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void dfsShortestPath() {
        //Arrange
        Integer[] expected = {10, 14, 21};

        //Act
        Integer[] result = g.dfsShortestPath();

        //Assert
//        B-E-G   : 10
//        B-A-D   : 14
//        B-F-C-H : 21
        Assert.assertArrayEquals(expected, result);
    }
}
