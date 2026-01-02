
class Node {
    public int data;
    public Node left;
    public Node right;
    public int height;

    Node(int data) {
        this.data = data;
        left = right = null;
        height = 1;
    }
}

public class AVLTree {

    public static int bf(Node left, Node right) {
        return getHeight(left) - getHeight(right);
    }

    public static int getHeight(Node n) {
        return n != null ? n.height : 0;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    // for LL imbalance
    public static Node rightRotate(Node y) {
        if (y == null) {
            return y;
        }
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;

    }

    // for RR imbalance
    public static Node leftRotate(Node x) {
        if (x == null) {
            return x;
        }
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(getHeight(x.left), getHeight(x.right)) + 1;
        y.height = max(getHeight(y.left), getHeight(y.right)) + 1;

        return y;
    }

    public static Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }

        root.height = max(getHeight(root.left), getHeight(root.right)) + 1;
        int balFac = bf(root.left, root.right);

        // for LL
        if (balFac > 1 && data < root.left.data) {
            return rightRotate(root);
        }

        // for LR
        else if (balFac > 1 && data >= root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);

        }

        // for RR
        else if (balFac < -1 && data >= root.right.data) {
            return leftRotate(root);

        }

        // RL
        else if (balFac < -1 && data < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;

    }


    public static void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] nodes = { 10, 20, 30, 40, 50, 25 };

        for (int val : nodes) {
            root = insertNode(root, val);
            System.out.print("Inserted " + val + ". Current Preorder: ");
            preOrder(root);
            System.out.println();
        }

        /*
         * Final Tree Structure expected:
         *  30
         *  / \
         * 20  40
         * / \   \
         *10  25  50
         */
        System.out.println("\nFinal Tree (Preorder traversal):");
        preOrder(root);
    }
}
