package dailyCoding;

import java.util.ArrayList;

public class _23_fibonacci {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }

    public static int fibonacci(int num) {
        // TODO: 아래와 같이 정의된 피보나치 수열 중 n번째 항의 수를 리턴해야 합니다.

// ----------------  naive solution(1): O(2^N)
//        int output = 0;
//        if (num == 1) output = 1;
//        else if (num == 2) output = 1;
//        else if (num >= 3) output = fibonacci(num - 2) + fibonacci(num - 1);
//
//        return output;


// ----------------  naive solution(2): O(2^N)
//        if(num <= 1) return num;
//        else return fibonacci(num-2) + fibonacci(num-1);


// ---------------- dynamic with meoization: O(N)
//         이미 해결한 문제의 정답을 따로 기록해두고,
//         다시 해결하지 않는 기법
//         fibo(10)
//         = fibo(9) + fibo(8)
//         = fibo(8) + fibo(7) + fibo(7) + fibo(6)
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);

        return aux(memo, num);
    }

    public static int aux(ArrayList<Integer> memo, int num) {
        if (memo.size() <= num) {
            memo.add(aux(memo, num - 1) + aux(memo, num - 2));
        }
        return memo.get(num);
    }
}
