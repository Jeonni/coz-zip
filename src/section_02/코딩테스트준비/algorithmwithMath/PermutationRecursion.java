package section_02.코딩테스트준비.algorithmwithMath;

import java.util.ArrayList;


public class PermutationRecursion {
    public static void main(String[] args) {
        ArrayList<String>lookup = new ArrayList<String>();
        lookup.add("A");
        lookup.add("B");
        lookup.add("C");

        ArrayList<String> result = new ArrayList<>();
        permutationRecursion(lookup, result, lookup.size(), 2);
    }

    /*
        @param arr      : 기준 리스트
        @param result   : 결과를 담을 리스트
        @param n        : 전체 갯수
        @param r        : 뽑을 갯수
     */
    public static void permutationRecursion(ArrayList<String> arr, ArrayList<String> result, int n, int r) {
        if (r == 0) {
            System.out.println(result.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            // a b c 중 a가 result에 담김
            result.add(arr.remove(i));
            // a에 관계 없이 b, c 둘 중에 하나를 뽑아야 하는 상태이므로 다시 재귀호출
            // 재귀호출에서는 다시 첫 원소 b를 result에 담는다.
            // 다음 재귀호출은 1개 중에 0개를 뽑는 상태가 되기 때문에.. 위에 탈출문에 들어간다.
            permutationRecursion(arr, result, n-1, r-1);

            // 재귀함수에서 빠져나오면 결과 리스트에 있던 것을 다시 원본 리스트로 옮겨 준다.
            // 이 때, 제일 최근에 빠진 원소는 result 리스트의 맨 마지막에 있기 때문에, 찾아서 있던 자리에 복구시켜주면 된다.
            arr.add(i, result.remove(result.size()-1));
        }
    }
}
