package DFSBFS기초;

public class 트리말단노드DFS {

    Node root;

    static class Node {
        int data;
        Node lt,rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public int DFS(int Level, Node root) {
        if (root.lt == null && root.rt == null) {
            return Level;
        }
        return Math.min(DFS(Level + 1, root.lt), DFS(Level + 1, root.rt));
    }

    public static void main(String[] args) {
        final 트리말단노드DFS tree = new 트리말단노드DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0, tree.root));
    }
}
