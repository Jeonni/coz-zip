package section_02.코딩테스트준비.코플릿.greedy;

/*
    자신이 감옥에 간 사이 연인이었던 줄리아를 앤디에게 빼앗겨 화가 난 조지는 브레드, 맷과 함께 앤디 소유의 카지노 지하에 있는 금고를 털기로 합니다. 온갖 트랩을 뚫고 드디어 금고에 진입한 조지와 일행들. 조지는 이와중에 감옥에서 틈틈이 공부한 알고리즘을 이용해 target 금액을 훔칠 수 있는 방법의 경우의 수를 계산하기 시작합니다.

    예를 들어 $50 을 훔칠 때 $10, $20, $50 이 있다면 다음과 같이 4 가지 방법으로 $50을 훔칠 수 있습니다.

    $50 한 장을 훔친다
    $20 두 장, $10 한 장을 훔친다
    $20 한 장, $10 세 장을 훔친다
    $10 다섯 장을 훔친다
    훔치고 싶은 target 금액과 금고에 있는 돈의 종류 type 을 입력받아, 조지가 target 을 훔칠 수 있는 방법의 수를 리턴하세요.
 */
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
