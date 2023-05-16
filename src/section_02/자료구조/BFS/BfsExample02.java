package section_02.자료구조.BFS;

import java.util.*;

public class BfsExample02 {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 0}
        };
        int start = 0;
        int end = 5;

        ArrayList<Integer> result = new ArrayList<>();
        result = shortestPath(graph, start, end); // [0, 2, 5]
        System.out.println(result);
    }

    public static ArrayList<Integer> shortestPath(int[][] graph, int start, int end) {
        boolean[] visited = new boolean[graph.length];
        return bfs(graph, start, end, visited);
    }

    public static ArrayList<Integer> bfs(int[][] graph, int start, int end, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        int[] parent = new int[graph.length]; // 기준점 확인하기 위한 parent 배열

        queue.offer(start);
        visited[start] = true;

        parent[start] = -1; // 기준점 확인

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == end) { // 노드가 end와 일치할 경우 (도착점까지 도달할 경우)
                ArrayList<Integer> path = new ArrayList<>();
                while (node != -1) { // node가 -1이 아닌 동안에~
                    path.add(node);
                    node = parent[node];
                }
                Collections.reverse(path); // 데이터 뒤집기
                return path;
            }

            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    parent[i] = node;
                }
            }
        }
        return null;
    }
}