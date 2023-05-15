package section_02.자료구조.큐;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 값 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // 큐의 값 반환하고, 순서대로 반환된 값을 출력
        for (int i = 0; i < 4; i++) {
            int num = queue.poll();
            System.out.printf(num + " ");
        }
    }
}
