package section_02.코딩테스트준비.algorithmwithMath;

import java.util.ArrayList;

public class CombinationRecursion {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");

        ArrayList<String> result = new ArrayList<>();
        combinationRecursion(arr, result, 0, arr.size(), 2);
    }


    /*
        @Param arr      : 기준 리스트
        @Param result   : 결과를 담을 리스트
        @Param index    : 반복문 시작 인덱스
        @Param n        : 전체 갯수
        @Param r        : 뽑을 갯수
     */
    public static void combinationRecursion(ArrayList<String> arr, ArrayList<String> result, int index, int n, int r) {
        if(r == 0){
            System.out.println(result.toString());
            return;
        }

        for (int i = index; i < n; i++) {
            result.add(arr.get(i));
            combinationRecursion(arr, result, i + 1, n, r - 1);
            result.remove(result.size() - 1);
        }
    }
}
