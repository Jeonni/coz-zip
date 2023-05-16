package section_02.자료구조.그래프;

import java.util.Arrays;

public class ImplementationGraph {
    public static void main(String[] args) {
        Solution adjMatrix = new Solution();
        System.out.println(Arrays.deepToString(adjMatrix.getGraph()));
/*
							TO
		 	  	 0  1  2
		  	0	[0, 0, 0],
	FROM 	1	[0, 0, 0],
		  	2	[0, 0, 0]
*/

        adjMatrix.addEdge(0, 1);
        adjMatrix.addEdge(0, 2);
        adjMatrix.addEdge(1, 2);

        boolean zeroToOneEdgeExists = adjMatrix.hasEdge(0, 1);
        System.out.println(zeroToOneEdgeExists); // true

        boolean zeroToOneEdgeExists2 = adjMatrix.hasEdge(0, 2);
        System.out.println(zeroToOneEdgeExists2); // true

        boolean oneToZeroEdgeExists = adjMatrix.hasEdge(1, 0);
        System.out.println(oneToZeroEdgeExists); // false

        System.out.println(Arrays.deepToString(adjMatrix.getGraph()));
/*
							TO
		 	  	 0  1  2
		  	0	[0, 1, 1],
	FROM 	1	[0, 0, 1],
		  	2	[0, 0, 0]
*/

        adjMatrix.removeEdge(1, 2);
        adjMatrix.removeEdge(0, 2);
        boolean oneToTwoEdgeExists = adjMatrix.hasEdge(1, 2);
        System.out.println(oneToTwoEdgeExists);
        boolean zeroToTwoEdgeExists = adjMatrix.hasEdge(0, 2);
        System.out.println(zeroToTwoEdgeExists);

        System.out.println(Arrays.deepToString(adjMatrix.getGraph()));
/*
							TO
		 	  	 0  1  2
		  	0	[0, 1, 0],
	FROM 	1	[0, 0, 0],
		  	2	[0, 0, 0]
*/
    }
}


class Solution {
    private int[][] graph;

    public void setGraph(int size) {
        graph = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                graph[i][j] = 0;
            }
        }
    }
    public int[][] getGraph() {
        return graph;
    }
    public void addEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 1;
    }

    public boolean hasEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return false;
        else if(graph[from][to] == 1) return true;
        else return false;
    }

    public void removeEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 0;
    }
}