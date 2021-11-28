package problems.algoexpert.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(this);
            while (!queue.isEmpty()) {
                Node node = queue.remove();
                array.add(node.name);
                queue.addAll(node.children);
            }
            return array;
        }
    }
}
