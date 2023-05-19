package section_02.코딩테스트준비.코플릿.순열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NewRecipe {
    public static void main(String[] args) {
        ArrayList<Integer[]> outcomes = new ArrayList<>();
        ArrayList<Integer[]> output1 = newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
        System.out.println(output1);
/*
  [
    [1, 10], [1, 1100], [1, 1111],
    [10, 1], [10, 1100], [10, 1111],
    [1100, 1], [1100, 10], [1100, 1111],
    [1111, 1], [1111, 10], [1111, 1100]
  ];
*/

    }

    public static ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        ArrayList<Integer> freshStuff = new ArrayList<>();

        // 신선한 재료만 뽑기 위해 아래 동작을 수행
        for (int num : stuffArr) {
            int count = countZeros(num);
            // 0이 3개 이상인 숫자는 제외
            if (count < 3) {
                freshStuff.add(num);
            }
        }

        // 재료가 들어간 리스트를 오름차순 정렬
        // 순서에 맞게 해주기 위해서
        Collections.sort(freshStuff);


        // 사용할 수 없는 재료이거나 재료의 양보다 사용해야 할 개수가 많을 경우 null 반환
        if (freshStuff.size() == 0 || freshStuff.size() < choiceNum) return null;

        // 결과를 담을 리스트 선언
        ArrayList<Integer[]> result = new ArrayList<>();

        // 재료의 사용 여부를 판단한 배열 선언
        boolean[] visited = new boolean[freshStuff.size()];

        // 순열 메서드를 사용하여 모든 경우의 수를 구하고, 결과를 반환
        return permutation(choiceNum, new Integer[]{}, result, freshStuff, visited, 0);
    }


    // 0의 갯수를 카운트 해줄 메서드
    private static int countZeros(int number) {
        int count = 0;
        while (number != 0) {
            if (number % 10 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static ArrayList<Integer[]> permutation(int choiceNum, Integer[] bucket, ArrayList<Integer[]> result, ArrayList<Integer> freshStuff, boolean[] visited, int depth) {
        // TODO:
        if (choiceNum == depth) {
            result.add(bucket);
            return result;
        }


        for (int i = 0; i < freshStuff.size(); i++) {
            // 아직 재료를 사용하지 않았다면 . .
            if (!visited[i]) {
                // 재료를 사용했다고 true로 바꿔주고
                visited[i] = true;

                Integer[] copyArr = Arrays.copyOf(bucket, bucket.length + 1);
                copyArr[copyArr.length-1] = freshStuff.get(i);


                //다시 재귀를 사용합니다.
                result = permutation(choiceNum, copyArr, result, freshStuff, visited, depth + 1);
                //한번 재귀를 순회한 이후, 반복문을 다시 시작하기 위해 첫 시작재료의 사용여부를 false로 변경합니다.
                visited[i] = false;
            }
        }
//
//        for(Integer[] arr : result){
//            for(Integer integer : arr){
//                System.out.println(integer);
//            }
//        }

        return result;
    }
}
