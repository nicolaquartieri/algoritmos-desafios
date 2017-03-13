package ar.com.algoritmos.BFSDFS;

import java.util.*;

// BFS & DFS algorithms are represented as Matrix in Iterative way.
//TODO Recursive ways.
public class GraphMatrix {
    public Node rootNode;
    public ArrayList<Node> nodes = new ArrayList<>();
    public int[][] adjMatrix; //Edges will be represented as adjacency Matrix
    int size;

    public void setRootNode(Node node) {
        this.rootNode = node;
    }

    public Node getRootNode() {
        return this.rootNode;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    //This method will be called to make connect two nodes
    public void connectNode(Node start, Node end) {
        if(adjMatrix == null) {
            size = nodes.size();
            adjMatrix = new int[size][size];
        }

        int startIndex = nodes.indexOf(start);
        int endIndex = nodes.indexOf(end);
        adjMatrix[startIndex][endIndex] = 1;
        adjMatrix[endIndex][startIndex] = 1;
    }

    private Node getUnvisitedChildNode(Node n) {
        int index = nodes.indexOf(n);
        int j = 0;

        while(j < size) {
            if(adjMatrix[index][j] == 1 && !nodes.get(j).visited) {
                return nodes.get(j);
            }
            j++;
        }
        return null;
    }

    //BFS traversal of a tree is performed by the bfs() function
    public String[] bfs() {
        List<String> result = new ArrayList<>();
        //BFS uses Queue data structure
        Queue queue = new LinkedList();
        queue.add(this.rootNode);
        printNode(this.rootNode);
        rootNode.visited=true;

        result.add(this.rootNode.label);

        while(!queue.isEmpty()) {
            Node n = (Node)queue.remove();
            Node child;
            while((child = getUnvisitedChildNode(n)) != null) {
                child.visited = true;
                printNode(child);
                result.add(child.label);
                queue.add(child);
            }
        }
        //Clear visited property of nodes
        clearNodes();

        return result.toArray(new String[0]);
    }

    //DFS traversal of a tree is performed by the dfs() function
    public String[] dfs() {
        List<String> result = new ArrayList<>();
        //DFS uses Stack data structure
        Stack stack = new Stack<Node>();
        stack.push(this.rootNode);
        rootNode.visited=true;
        printNode(rootNode);

        result.add(this.rootNode.label);

        while(!stack.isEmpty()) {
            Node n = (Node)stack.peek();
            Node child = getUnvisitedChildNode(n);
            if(child != null) {
                child.visited=true;
                printNode(child);
                result.add(child.label);
                stack.push(child);
            } else {
                stack.pop();
            }
        }
        //Clear visited property of nodes
        clearNodes();

        return result.toArray(new String[0]);
    }

    //Utility methods for clearing visited property of node
    private void clearNodes() {
        int i = 0;

        while(i < size) {
            Node n = nodes.get(i);
            n.visited = false;
            i++;
        }
    }

    //Utility methods for printing the node's label
    private void printNode(Node n) {
        System.out.print(n.label+" ");
    }
}
