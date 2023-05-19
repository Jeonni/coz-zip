package section_02.코딩테스트준비;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output); // 3

        int output2 = movingStuff(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output2); // 4
    }

    public static int movingStuff(int[] stuff, int limit) {
        Arrays.sort(stuff);

        int left = 0;
        int right = stuff.length - 1;
        int count = 0;

        while (left <= right) {
            if (stuff[left] + stuff[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            count++;
        }

        return count;
    }
}
