package DFSBFS기초;

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리레벨탐색 {

    Node root;

    static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        int Level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                final Node node = queue.poll();
                System.out.print(node.data + " ");
                if (node.lt != null) {
                    queue.add(node.lt);
                }
                if (node.rt != null) {
                    queue.add(node.rt);
                }
            }
            Level++;
        }

    }

    public static void main(String[] args) {
        final 이진트리레벨탐색 tree = new 이진트리레벨탐색();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);
    }

}
