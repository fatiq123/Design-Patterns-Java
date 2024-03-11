package SOLID.SingleResponsibility;

import java.util.*;

public class BFS {
    public static List<Node> bfs(Node start) {
        Queue<Node> queue = new LinkedList<>();
        List<Node> visited = new ArrayList<>();
        Map<Node, Node> parentMap = new HashMap<>();

        queue.add(start);
        parentMap.put(start, null);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            visited.add(current);

            if (current.getValue().equals("END")) {
                return reconstructPath(start, current, parentMap);
            }

            for (Edge edge : current.getEdges()) {
                Node neighbour = edge.getNeighbour();

                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                    parentMap.put(neighbour, current);
                }
            }
        }

        return null;
    }

    private static List<Node> reconstructPath(Node start, Node end, Map<Node, Node> parentMap) {
        List<Node> path = new ArrayList<>();
        Node current = end;

        while (current != null) {
            path.add(current);
            current = parentMap.get(current);
        }

        return path;
    }

    static class Node {

        private String value;
        private List<Edge> edges = new ArrayList<>();
        private Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<Edge> getEdges() {
            return edges;
        }

        public void setEdges(List<Edge> edges) {
            this.edges = edges;
        }


    }

    static class Edge {
        private Edge(Node neighbour) {
            this.neighbour = neighbour;
        }

        public Node getNeighbour() {
            return neighbour;
        }

        private Node neighbour;
    }
}