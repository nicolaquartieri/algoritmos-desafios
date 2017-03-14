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

    /** DFS traversal of a tree is performed by the dfs() function
     * 1. Push the root {@link Node} into the {@link Stack}
     * 2. Loop until the {@link Stack} is empty.
     * 3. Peek the {@link Node} of the {@link Stack}.
     * 4. If the peeked {@link Node} has unvisited child nodes, mark the child node as visited and push it on the {@link Stack}.
     * 5. If the {@link Node} doesn't have any unvisited child nodes pop the {@link Node} from the {@link Stack}.
     *
     * @return The list of visited {@link Node}.
     */
    public String[] dfs() {
        List<String> result = new ArrayList<>();
        //DFS uses Stack data structure
        Stack stack = new Stack<Node>();
        stack.push(this.rootNode);
        rootNode.visited = true;
        printNode(rootNode);

        result.add(this.rootNode.label);

        while (!stack.isEmpty()) {
            Node nodePeek = (Node)stack.peek();
            Node child = getUnvisitedChildNode(nodePeek);
            if (child != null) {
                child.visited = true;
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

    /**
     * BFS traversal of a tree is performed by the bfs() function
     * 1. Push the root {@link Node} into the Queue.
     * 2. Loop until the Queue is empty.
     * 3. Remove the {@link Node} from the Queue.
     * 4. If the removed {@link Node} has unvisited child's mark as visited and insert the unvisited {@link Node} in the Queue.
     *
     * @return The list of visited {@link Node}.
     */
    public String[] bfs() {
        List<String> result = new ArrayList<>();
        //BFS uses Queue data structure
        Queue queue = new LinkedList();
        queue.add(this.rootNode);
        printNode(this.rootNode);
        rootNode.visited = true;

        result.add(this.rootNode.label);

        while (!queue.isEmpty()) {
            Node removedNode = (Node)queue.remove();
            Node child;
            while ((child = getUnvisitedChildNode(removedNode)) != null) {
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

    //Utility methods for clearing visited property of node
    private void clearNodes() {
        int i = 0;

        while (i < size) {
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
