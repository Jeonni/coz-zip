package section_02.자료구조.그래프;

import java.util.Arrays;

/*
    인접 행렬 생성하기
    - 방향이 있는 간선과 방향이 없는 간선들의 목록들을 받아 2차원 배열의 인접행렬을 반환하는 함수를 작성하세요.
 */
public class Graph {
    public static void main(String[] args) {

        int[][] output1 = createMatrix(new int[][]{
                {0, 3, 0}, // 0번째 행, 3번째 열에 1을 추가
                {0, 2, 0}, // 0번째 행, 2번째 열에 1을 추가
                {1, 3, 0}, // 1번째 행, 3번째 열에 1을 추가
                {2, 1, 0}, // 2번째 행, 1번째 열에 1을 추가
        });

        System.out.println(Arrays.toString(output1));

        /**
         * [
         *  [0, 0, 1, 1],
         *  [0, 0, 0, 1],
         *  [0, 1, 0, 0],
         *  [0, 0, 0, 0]
         * ]
         */

        int[][] output2 = createMatrix(new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        });

        System.out.println(Arrays.toString(output2));

        /**
         * [
         *  [0, 0, 1, 0, 0],
         *  [0, 0, 0, 1, 0],
         *  [0, 1, 0, 0, 1],
         *  [0, 1, 0, 0, 0],
         *  [0, 0, 1, 0, 0],
         * ]
         */
    }

    public static int[][] createMatrix(int[][] edges) {
        // TODO:
        int[][] graph; // 리턴할 배열 선언
        int maxSize = 0;

        // 배열의 크기 찾기 (최대값)
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) { // 다시 보기 !! 중요
                if (maxSize < edges[i][j]) maxSize = edges[i][j] + 1;
            }
        }

        // 위에서 찾은 최대값으로 배열의 크기 할당
        graph = new int[maxSize][maxSize];

        for (int i = 0; i < edges.length; i++) { // 다시 보기 !! 중요
            int from = edges[i][0]; // 시작 위치
            int to = edges[i][1]; // 도착 위치
            int way = edges[i][2]; // 방향

            if (way == 0) graph[from][to] = 1; // 단방향일 경우
            else if (way == 1) { // 양방향일 경우
                graph[from][to] = 1;
                graph[to][from] = 1;
            }
        }

        return graph;
    }
}