package DFSBFS기초;

public class 이진트리순회 {

    Node root;

    static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public void DFS(Node root) {
        if (root == null) {
            return;
        }
        DFS(root.lt);
        System.out.print(root.data + " ");
        DFS(root.rt);
    }

    public static void main(String[] args) {
        final 이진트리순회 tree = new 이진트리순회();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);
    }
}
