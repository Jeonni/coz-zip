package section_02.코딩테스트준비.코플릿.greedy;

/*
편의점에서 아르바이트를 하고 있는 중에, 하필이면 피크 시간대에 손님에게 거스름돈으로 줄 동전이 부족하다는 것을 알게 되었습니다.
현재 가지고 있는 동전은 1원, 5원, 10원, 50원, 100원, 500원으로 오름차순으로 정렬되어 있고, 각 동전들은 서로 배수 관계에 있습니다.
동전 개수를 최소화하여 거스름돈 K를 만들어야 합니다. 이때, 필요한 동전 개수의 최솟값을 구하는 함수를 작성해 주세요.
*/

public class GreedyStore {
    public static void main(String[] args) {
        // 4000원을 받았을 때 500원짜리 동전 8개를 반환합니다.
        int output1 = partTimeJob(4000);
        System.out.println(output1); // --> 8

        // 4972원을 받았을 때 500원짜리 동전 9개, 100원짜리 동전 4개, 50원짜리 동전 1개, 10원짜리 동전 2개, 1원짜리 동전 2개, 총 18개를 반환합니다.
        int output2 = partTimeJob(4972);
        System.out.println(output2); // --> 18
    }

    public static int partTimeJob(int k) {
        // TODO:
        int coin[] = new int[]{500, 100, 50, 10, 5, 1};

        int result = 0;
        int i = 0;
        while (k != 0) {
            if (coin[i] / k >= 0) {
                int sum = k / coin[i];
                k -= coin[i] * sum;
                result += sum;
                i++;
            }
        }
        return result;
    }
}

/*
        int[] coin = new int[]{500, 100, 50, 10, 5, 1}; // 4000
        int result = 0; // 필요한 동전의 최솟값

        for (int i = 0; i < coin.length; i++) {
            if (k > 0) {
                int sum = k / coin[i];  // 4000 / 500 sum =8
                result += sum; // 몫을 result에 담기 result = 8
                k -= coin[i] * sum; // 받은 돈에서 거스름돈 빼기 .. 4000 -(500*8) = 0
            }
        }
        return result;
 */