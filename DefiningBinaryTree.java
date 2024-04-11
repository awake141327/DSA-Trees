class DefiningBinaryTree {

    // Defining a Binary Tree
    static class Node {
        int val;
        Node left;
        Node right;

        Node (int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        Node (int val) {
            this.val = val;
        }
        Node () {}
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.right.left.val);
    }
}