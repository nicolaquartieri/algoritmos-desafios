package ar.com.algoritmos.tree;

/**
 * This is the representation of a Binary Tree in witch values lower goes to the left and bigger to the right.
 */
public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    /**
     * Insert a new value. O(log n)
     * @param value The value to insert.
     */
    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    /**
     * Check if a value exist. 0(log n)
     * @param value The value to check.
     * @return
     */
    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void print() {
        if (left != null) {
            left.print();
        }

        System.out.println(data);

        if (right != null) {
            right.print();
        }
    }
}
