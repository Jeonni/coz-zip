package section_02.코딩테스트준비.코플릿.순열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    오늘은 빼빼로 데이입니다. 한 회사의 팀장은 출근길에 아몬드 빼빼로 M개와 누드 빼빼로 N개를 구매하여 아침 일찍 출근길에 나섰습니다.

    팀장은 자신보다 먼저 출근해 있는 직원들에게 구매한 빼빼로를 전부 나누어 주려고 합니다.
    단, 서로 질투하는 경우를 만들지 않기 위해 모든 직원들에게 공평하게 빼빼로를 나누어 주려고 합니다.
    직원들은 각각의 빼빼로를 똑같은 개수만큼 받아야 합니다. 빼빼로를 쪼개서 줄 수는 없습니다.

    하지만 회사에 도착하기 전이라 몇 명의 직원들이 있는지 모르는 상황입니다.
    팀장이 아몬드 빼빼로를 4개, 누드 빼빼로를 8개를 구매 했다면, 다음과 같이 세 가지 방법으로 나누어 줄 수 있습니다.

    출근한 직원이 1명이라면 아몬드 빼빼로 4개와 누드 빼빼로 8개를 줄 수 있습니다.
    출근한 직원이 2명이라면 아몬드 빼빼로 2개와 누드 빼빼로 4개를 각각 줄 수 있습니다.
    출근한 직원이 3명이라면 빼빼로를 남기지 않고 공평하게 주는 방법은 없습니다.
    출근한 직원이 4명이라면 아몬드 빼빼로 1개와 누드 빼빼로 2개를 각각 줄 수 있습니다.
 */
public class PeperoDividing {
    public static void main(String[] args) {
        int M = 4; // 아몬드
        int N = 8; // 누드
        ArrayList<Integer[]> output = divideChocolateStick(M, N);
        System.out.println(output);

        StringBuilder sb = new StringBuilder();

        for (Integer[] arr : output) {
            sb.append("[ ");
            for (Integer element : arr) {
                sb.append(element).append(" ");
            }
            sb.append("]\n");
        }

        System.out.println(sb);
// [[1, 4, 8], [2, 2, 4], [4, 1, 2]]
    }

    public static ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        ArrayList<Integer[]> result = new ArrayList<>();
        int gcd = calculateGCD(M, N);

        // 최대공약수의 제곱근을 내림한 값
        int sqrt = (int) Math.floor(Math.sqrt(gcd));

        for (int left = 1; left <= sqrt; left++) {
            if (gcd % left == 0) {
                // 최대공약수의 약수인 경우 중, 제곱근 보다 작은 약수의 경우
                result.add(new Integer[]{left, M / left, N / left}); // {1, 4, 8}

                if (left * left < gcd) { // 1*1 < 4
                    int right = gcd / left; // 4 / 1 = 4
                    result.add(new Integer[]{right, M / right, N / right}); // {4, 1, 2}
                }
            }
        }

        // 직원의 수 오름차순 정렬
        Collections.sort(result, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });

        return result;
    }

    public static int calculateGCD(int M, int N) {
        // m >= n
        // m이 n의 배수인 경우에 최대공약수가 n
        // 그렇지 않은 경우 --> n와 m%n의 최대공약수이다.

        // m 4 n 8
        while (N != 0) {
            int temp = N; // 8 --> 4
            N = M % N; // 4 % 8 = 4 --> 8 %4 = 0
            M = temp; // 8 --> 4
        }
        return M; // 4
    }
}