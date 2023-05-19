package section_02.코딩테스트준비.algorithmwithMath;

import java.util.ArrayList;

/*
    순열: 요소 n개 중에 m개를 선택하여 순서에 상관있게 뽑는 경우의 수
    case 1. 순서를 생각하여 3장을 선택할 때의 모든 경우의 수
 */
public class PermutationExample {
    public static void main(String[] args) {
        // 순열 요소가 인자로 우어진 경우, 인자 그대로 사용하면 되지만, 인자가 주어지지 않고
        // 문제 안에 포함되어 있는 경우, 아래와 같은 식으로 사용할 수 있다.

        String[] lookup = new String[]{"A", "B", "C", "D", "E"};
        ArrayList<String[]> result = new ArrayList<>();

        for (int i = 0; i < lookup.length; i++) {
            for (int j = 0; j < lookup.length; j++) {
                for (int k = 0; k < lookup.length; k++) {
                    if (i == j || j == k || k == i) continue;
                    String[] input = new String[]{lookup[i], lookup[j], lookup[k]};
                    result.add(input);
                }
            }
        }


        // result 배열 안에 순열의 경우의 수를 삽입한 뒤, 반환하는 함수
        for (int i = 0; i < lookup.length; i++) {
            String pick1 = lookup[i];
            for(int j=0; j<lookup.length;j++){
                String pick2 = lookup[j];
                for(int k=0; k<lookup.length; k++){
                    String pick3 = lookup[k];
                    // 중복된 요소 제거: 같은 인덱스를 선택한다는 것은 중복된 요소를 선택한다는 것과 같음
                    // 현재 케이스에서는 카드가 3장만 구비되어 있다고 가정했으므로 중복된 카드가 나오는 경우의 수는 체크하면 안됨
                    if (i == j || j == k || k == i) continue; // 중복된 요소가 나차나면 다음으로 반복문으로 넘어간다.
                    result.add(new String[]{pick1, pick2, pick3});
                }
            }
        }


        // 중복된 카드를 없애고, 순서를 지키며 나열
        StringBuilder sb = new StringBuilder();
        for (String[] arr : result) {
            sb.append("{ ");
            for(String str : arr){
                sb.append(str).append(" ");
            }
            sb.append("}\n");
        }

        System.out.println(sb);
    }



}
