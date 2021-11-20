package problems.dfs;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    class Program {
        // Do not edit the class below except
        // for the depthFirstSearch method.
        // Feel free to add new properties
        // and methods to the class.
        static class Node {
            String name;
            List<Node> children = new ArrayList<Node>();

            public Node(String name) {
                this.name = name;
            }

            public List<String> depthFirstSearch(List<String> array) {
                Node root = new Node(name);
                root.children = children;
                return dfs(array, root);
            }

            private List<String> dfs(List<String> array, Node node) {
                if (node.name != null)
                    array.add(node.name);
                for (Node n : node.children) {
                    dfs(array, n);
                }
                return array;
            }

            public Node addChild(String name) {
                Node child = new Node(name);
                children.add(child);
                return this;
            }
        }
    }

}
