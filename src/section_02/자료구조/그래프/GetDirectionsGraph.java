package section_02.자료구조.그래프;

import java.util.Arrays;

/*
    인접 행렬 길찾기
    - 주어진 인접행렬에서 한 정점으로부터 다른 정점으로 이어지는 길이 존재하는지 확인
 */
public class GetDirectionsGraph {
    public static void main(String[] args) {
        boolean result = getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1},
                                {0, 1, 0, 0}
                        },
                0,
                2
        );
        System.out.println(result); // true
        // 정점 0 -> 1 -> 2 로 가는 길 존재하므로 true 반환

        boolean result2 = getDirections(new int[][]
                        {
                                {0, 1, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0},
                                {0, 1, 1, 0, 0},
                                {1, 1, 1, 1, 0}
                        },
                1,
                4
        );
        System.out.println(result2); // false
        // 정점 1 -> 3 / 1 -> 3 -> 2 .. 4에 도달 불가능
    }

    public static boolean getDirections(int[][] matrix, int from, int to) {
        // TODO:
        int[][] newMatrix = new int[matrix.length][]; // 반환할 새로운 매트릭스 배열 추가, 이때 행의 크기는 가져올 배열의 크기만큼 담기
        for (int i = 0; i < matrix.length; i++) {
            newMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length); // matrix의 i번째 행의 요소를, matrix의 i번째의 크기만큼 불러오기
        }
        if (from == to) return true; // 출발점, 도착점이 같을 경우 true 반환

        for (int i = 0; i < newMatrix.length; i++) {
            if (newMatrix[from][i] == 1) { // newMatrix[from][i] 에 길이 존재한다면 (1이 있다면?)
                newMatrix[from][i] = 0; // 루트를 순회했음을 표시
                // 표시된 행렬과, 출발 지점을 현재 지점인 i로 변경하여 재귀함수를 실행
                // 재귀 함수가 끝까지 도달하였을 때(true를 반환한 경우), true를 반환
                if (getDirections(newMatrix, i, to)) return true;
            }
        }
        return false;

    }
}
