public class DijkstraMatrix {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // Матрица весов графа.
        // 0 означает отсутствие ребра, кроме диагонали.
        int[][] weights = {
                {0,  7,  9,  0,  0, 14},
                {0,  0, 10, 15,  0,  0},
                {0, 0,  0, 11,  0,  2},
                {0, o, 0,  0,  6,  0},
                {0,  0,  0,  0,  0,  9},
                {0, 0,  0,  0,  0,  0}
        };

        int startVertex = 0;
        int[] distances = dijkstra(weights, startVertex);

        System.out.println("Кратчайшие расстояния от вершины " + startVertex + ":");

        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == INF) {
                System.out.println("До вершины " + i + ": недостижима");
            } else {
                System.out.println("До вершины " + i + ": " + distances[i]);
            }
        }
    }

    private static int[] dijkstra(int[][] weights, int startVertex) {
        int count = weights.length;

        int[] distances = new int[count];
        boolean[] visited = new boolean[count];

        for (int i = 0; i < count; i++) {
            distances[i] = INF;
        }

        distances[startVertex] = 0;

        for (int step = 0; step < count; step++) {
            int currentVertex = -1;
            int shortestDistance = INF;

            for (int vertex = 0; vertex < count; vertex++) {
                if (!visited[vertex] && distances[vertex] < shortestDistance) {
                    shortestDistance = distances[vertex];
                    currentVertex = vertex;
                }
            }

            if (currentVertex == -1) {
                break;
            }

            visited[currentVertex] = true;

            for (int neighbor = 0; neighbor < count; neighbor++) {
                int edgeWeight = weights[currentVertex][neighbor];

                if (edgeWeight > 0 && !visited[neighbor]) {
                    int newDistance = distances[currentVertex] + edgeWeight;

                    if (newDistance < distances[neighbor]) {
                        distances[neighbor] = newDistance;
                    }
                }
            }
        }

        return distances;
    }
}
