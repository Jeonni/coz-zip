package section_02.코딩테스트준비.코플릿.순열;


/*

    조합: 순서에 상관 없이 n개의 요소 중에 m개를 뽑는 경우의 수

1. 숫자로 이루어진 카드를 여러 장 받습니다.
2. 3장씩 카드를 고르고, 3장에 적힌 숫자들의 합이 소수인지 확인합니다.
3. 받아든 카드로 만들 수 있는 소수의 개수가 많은 사람이 이기게 됩니다.

 */
public class Blackjack {
    public static void main(String[] args) {
        int output = boringBlackjack(new int[]{1, 2, 3, 4});
        System.out.println(output); // 1

        int output2 = boringBlackjack(new int[]{2, 3, 4, 8, 13});
        System.out.println(output2); // 3
    }

    // 조합 생성을 위한 재귀 함수
    public static int boringBlackjack(int[] cards) {
        // TODO:

        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int number = cards[i] + cards[j] + cards[k];
                    // 소수인지 판별
                    if (isPrime(number)) count++;
                }
            }
        }
        return count;
    }

    // 소수인지 구하는 메서드
    // 소수가 맞으면 true를 반환
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        //  2부터 number의 제곱근까지의 수로 나누어 떨어지는지를 확인
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
