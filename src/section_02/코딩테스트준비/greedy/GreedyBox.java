package section_02.코딩테스트준비.greedy;

import java.util.Arrays;

/*
짐의 무게를 담은 배열 stuff와 박스의 무게 제한 limit가 매개변수로 주어질 때,
모든 짐을 옮기기 위해 필요한 박스 개수의 최소값을 return 하도록 movingStuff 함수를 작성하세요.
 */
public class GreedyBox {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output); // 3

        int output2 = movingStuff(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output2); // 4
    }

    public static int movingStuff(int[] stuff, int limit) {
        // TODO:
        Arrays.sort(stuff);

        int count = 0;
        boolean flag = false;

        for (int i = 0; i < stuff.length; i++) { // 0번쨰 인덱스 -->
            if (stuff[i] == 0) {
                continue;
            }

            for (int j = stuff.length - 1; j > i; j--) {
                if (stuff[j] == 0) {
                    continue;
                }

                if (stuff[i] + stuff[j] <= limit) {
                    stuff[i] = 0;
                    stuff[j] = 0;
                    count++;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                stuff[i] = 0;
                count++;
            }

            flag = false;
        }

        return count;
    }
}


/*
public class Solution {
    public int movingStuff(int[] stuff, int limit) {
    Arrays.sort(stuff);
    int i=0,j=stuff.length-1;
    int count=0;
    while(i<j){
      if(stuff[i]+stuff[j]>limit){
        j--;
      }
      else{
        i++;
        j--;
      }
      count++;
    }
    if(i==j)
      count++;
    return count;
    }
}
 */