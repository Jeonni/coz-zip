package dailyCoding;

public class _29_tiling {
    public static void main(String[] args) {
        int output = tiling(2);
        System.out.println(output); // --> 2

        output = tiling(4);
        System.out.println(output); // --> 5
/*
2 x 4 보드에 타일을 놓는 방법은 5가지
각 타일을 a, b, c, d로 구분

2 | a b c d
1 | a b c d
------------

2 | a a c c
1 | b b d d
------------

2 | a b c c
1 | a b d d
------------

2 | a a c d
1 | b b c d
------------

2 | a b b d
1 | a c c d
------------
*/
    }

    public static int tiling(int num) {
        // TODO: 세로 길이 2, 가로 길이 n인 2 x n 보드가 있습니다. 2 x 1 크기의 타일을 가지고 이 보드를 채우는 모든 경우의 수를 리턴해야 합니다.
        // 보드가 2 x n이므로 n이 0 또는 음수일 때는 타일을 채울 수 없습니다.
        if (num <= 0) {
            return 0;
        }

        // n이 1일 때는 2 x 1 보드를 가득 채우는 방법은 1가지입니다.
        if (num == 1) {
            return 1;
        }

        // 이전 상태의 경우의 수를 저장하는 변수들
        int previous = 1;  // n = 1일 때의 경우의 수
        int current = 2;   // n = 2일 때의 경우의 수

        for (int i = 3; i <= num; i++) {
            // i - 1까지의 경우의 수와 i - 2까지의 경우의 수를 합하여 i까지의 경우의 수를 구합니다.
            int temp = current;
            current += previous;
            previous = temp;
        }

        return current;
    }
}
