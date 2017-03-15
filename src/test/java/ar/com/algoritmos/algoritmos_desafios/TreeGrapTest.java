package ar.com.algoritmos.algoritmos_desafios;

import ar.com.algoritmos.tree.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeGrapTest {

    Node rootNode;

    @Before
    public void setUp() {
        rootNode = new Node(7);

        rootNode.insert(12);
        rootNode.insert(3);
        rootNode.insert(99);
        rootNode.insert(8);
        rootNode.insert(5);
        rootNode.insert(2);

        //          7
        //         / \
        //        3   12
        //       /\   /\
        //      2  5 8  99
    }

    @Test
    public void containsNodeAllElements() {
        //Arraign
        // Done in setUp() method.

        //Act
        // Done in setUp() method.

        rootNode.print();
        //Assert
        Assert.assertTrue(rootNode.contains(3));
        Assert.assertTrue(rootNode.contains(5));
        Assert.assertTrue(rootNode.contains(2));
        Assert.assertTrue(rootNode.contains(8));
        Assert.assertTrue(rootNode.contains(8));
        Assert.assertTrue(rootNode.contains(7));
        Assert.assertTrue(rootNode.contains(99));
    }


}
