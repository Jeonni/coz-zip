package section_02.코딩테스트준비.코플릿.greedy;

import java.util.HashMap;

/*
    N * N의 크기를 가진 보드판 위에서 게임을 하려고 합니다. 게임의 룰은 다음과 같습니다.

    좌표 왼쪽 상단(0, 0)에 말을 놓는다.
    말은 상, 하, 좌, 우로 이동할 수 있고, 플레이어가 조작할 수 있다.
    조작의 기회는 딱 한 번 주어진다.
    조작할 때 U, D, L, R은 각각 상, 하, 좌, 우를 의미하며 한 줄에 띄어쓰기 없이 써야 한다.
    예시: UDDLLRRDRR, RRRRR
    한 번 움직일 때마다 한 칸씩 움직이게 되며, 그 칸 안의 요소인 숫자를 획득할 수 있다.
    방문한 곳을 또 방문해도 숫자를 획득할 수 있다.
    보드 밖을 나간 말은 OUT 처리가 된다.
    칸 안의 숫자는 0 또는 1이다.
    단, 좌표 왼쪽 상단(0, 0)은 항상 0이다.
    획득한 숫자를 합산하여 숫자가 제일 큰 사람이 이기게 된다.
    보드판이 담긴 board와 조작하려고 하는 문자열 operation이 주어질 때, 말이 해당 칸을 지나가면서 획득한 숫자의 합을 구하는 함수를 작성하세요.
 */
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
