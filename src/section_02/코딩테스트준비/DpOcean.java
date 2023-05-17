package section_02.코딩테스트준비;

public class DpOcean {
    public static void main(String[] args) {
        long output = ocean(50, new int[]{10, 20, 50});
        System.out.println(output); // 4

        long output2 = ocean(100, new int[]{10, 20, 50});
        System.out.println(output2); // 10

        long output3 = ocean(30, new int[]{5, 6, 7});
        System.out.println(output3); // 4
    }

    public static long ocean(int target, int[] type) {
        // TODO:
        long dp[] = new long[target + 1]; // 동전 조합의 수를 저장하기 위한 배열
        dp[0] = 1; // dp[] 초기값을 1로 셋팅

        for (int coin : type) {
            for (int i = coin; i <= target; i++) {
                dp[i] += dp[i - coin]; // i원을 만들기 위한 경우의 수
            }
        }
        return dp[target];
    }
}


/*
        // 경우의 수를 담을 배열 선언
        long[] take = new long[target + 1];

        // 인덱스는 도달하려는 금액이므로 0은 경우의 수를 1로 고정
        take[0] = 1;

        for (int i = 0; i < type.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (j >= type[i]) { // type[0] = 10 j = 1 .. 10
                    take[j] = take[j] + take[j - type[i]]; // j - type[i] == 나머지 금액
                }
            }
        }

        return take[target];
 */
