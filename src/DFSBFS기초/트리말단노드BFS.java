package DFSBFS기초;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 트리말단노드BFS {

    Node root;

    static class Node {
        int data;
        Node lt,rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        int Level = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            final int len = queue.size();
            for (int i = 0; i < len; i++) {
                final Node node = queue.poll();
                if (node.lt == null && node.rt == null) {
                    return Level;
                }
                if (node.lt != null) {
                    queue.add(node.lt);
                }
                if (node.rt != null) {
                    queue.add(node.rt);
                }
            }
            Level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        final 트리말단노드BFS tree = new 트리말단노드BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.BFS(tree.root));
    }
}
