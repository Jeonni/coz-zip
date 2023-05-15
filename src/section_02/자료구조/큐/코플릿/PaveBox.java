package section_02.자료구조.큐.코플릿;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PaveBox {
    public static void main(String[] args) {
        Integer[] boxes = new Integer[]{5, 1, 4, 6};
        int output = paveBox(boxes);
        System.out.println(output); // 3

        Integer[] boxes2 = new Integer[]{1, 5, 7, 9};
        int output2 = paveBox(boxes2);
        System.out.println(output2); // 1

        Integer[] boxes3 = new Integer[]{1, 5, 5, 4};
        int output3 = paveBox(boxes3);
        System.out.println(output3); // 3

        Integer[] boxes4 = new Integer[]{5, 5, 5, 5};
        int output4 = paveBox(boxes4);
        System.out.println(output4); // 4

        Integer[] boxes5 = new Integer[]{6, 5, 6, 4, 3, 2, 1};
        int output5 = paveBox(boxes5);
        System.out.println(output5); // 5
    }

    public static int paveBox(Integer[] boxes) {
        // TODO:
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(boxes));

        int count = 1;
        int result = 1;
        int num = queue.poll();
        while(queue.peek() != null){
            int compareNum = queue.poll();
            if(num < compareNum){
                result = Math.max(result, count);
                count = 1;
                num = compareNum;
            }
            else{
                count++;
                if(queue.isEmpty()){
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
}
