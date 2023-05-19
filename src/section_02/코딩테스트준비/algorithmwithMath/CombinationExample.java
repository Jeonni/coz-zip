package section_02.코딩테스트준비.algorithmwithMath;

import java.util.ArrayList;

/*
    조합: 순서에 상관 없이 n개의 요소 중에 m개를 뽑는 경우의 수
    case 2. 순서를 생각하지 않고 3장을 선택할 때의 모든 경우의 수
 */
public class CombinationExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] lookup = new String[]{"A", "B", "C", "D", "E"};
        ArrayList<String[]> output = new ArrayList<>(combinationLoop(lookup));

        for (String[] arr : output) {
            sb.append("{ ");
            for (String str : arr) {
                sb.append(str).append(" ");
            }
            sb.append("}\n");
        }

        System.out.println(sb);
    }

    public static ArrayList<String[]> combinationLoop(String[] arr) {
        ArrayList<String[]> result = new ArrayList<>();

        // 순서를 생각하지 않고, 3장 뽑기
        // 조합의 모든 수를 나열
        // 중복을 허용하지 않음 nCr
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    String[] input = new String[]{arr[i], arr[j], arr[k]};
                    result.add(input);
                }
            }
        }

        return result;
    }


    /*
    public static ArrayList<String[]> combinationLoop2(String[] arr) {

    }
    */
}
