package section_02.코딩테스트준비;

import java.util.HashMap;

public class BoardGame {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int output1 = boardGame(board1, "RRDLLD");
        System.out.println(output1); // 4


        int[][] board2 = new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        int output2 = boardGame(board2, "UUUDD");
        System.out.println(output2); // null

        int[][] board3 = new int[][]{
                {0, 0, 0, 0, 0}, // 0번째 행 int[0] === > board3[0] = {0, 0, 0, 0, 0} ===> board3[0][0] = {0}
                {0, 0, 1, 0, 0}, // 1번째 행
                {0, 0, 0, 0, 0}, // 2번째 행
                {0, 0, 0, 1, 0}, // 3번째 행
                {0, 0, 0, 0, 0} // 4번째 행
        };
        int output3 = boardGame(board3, "DDRRRUDUDUD");
        System.out.println(output3); // 0
    }

    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        HashMap<String, int[]> hashMap = new HashMap<String, int[]>() {
            {
                // y
                // 0번째
                put("U", new int[]{-1, 0}); // 상
                put("D", new int[]{1, 0}); // 하

                // x
                // 1번째
                put("L", new int[]{0, -1}); // 좌
                put("R", new int[]{0, 1}); // 우
            }
        };

        int boardLength = board.length;

        int x = 0; // 좌우
        int y = 0; // 상하
        int score = 0;

        char[] operations = operation.toCharArray(); // char형 배열에 하나씩 담기

        for (int i = 0; i < operations.length; i++) {
            int dy = hashMap.get(String.valueOf(operations[i]))[0]; // 상하 (행을 기준으로) 0번째 인덱스 값 ; - 1
            int dx = hashMap.get(String.valueOf(operations[i]))[1]; // 좌우 (열을 기준으로) 1번째
            y += dy;
            x += dx;

            if (!isValid(y, x, boardLength)) return null;
            score += board[y][x];
        }

        return score;
    }

    public static boolean isValid(int y, int x, int LEN) {
        //최소값과, 최대값을 벗어나면 false, 가능하다면 true를 반환합니다.
        return 0 <= y && y < LEN && 0 <= x && x < LEN;
    }
}
