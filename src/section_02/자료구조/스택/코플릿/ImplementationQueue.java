package section_02.자료구조.스택.코플릿;

import java.util.ArrayList;

/*
Queue 구현을 위한 기본적인 코드가 작성되어 있습니다. Queue 자료구조의 특성을 이해하고 FILL_ME_IN 을 채워 테스트를 통과해주세요.
 */
public class ImplementationQueue {
    public static void main(String[] args) {
        Solution queue = new Solution(); //수정 필요

        queue.size(); // 0
        for (int i = 1; i < 10; i++) {
            queue.add(i);
        }

        queue.poll(); // 1
        queue.poll(); // 2
        queue.size(); // 7
        queue.add(10);
        queue.size(); // 8
        queue.poll(); // 3
        queue.poll(); // 4
        queue.size(); // 6
    }

    public static class Solution {
        private ArrayList<Integer> listQueue = new ArrayList<Integer>();

        //큐에 데이터를 추가할 수 있어야 합니다.
        public void add(Integer data) {
            listQueue.add(data);
        }

        //가장 먼저 추가된 데이터를 큐에서 삭제하고 삭제한 데이터를 리턴해야 합니다.
        public Integer poll() {
            if (listQueue.size() == 0) {
                return null;
            } else {
                return listQueue.remove(0);
            }
        }

        public int size() {
            return listQueue.size();
        }

        //큐에 가장 먼저 추가된 데이터를 리턴해야 합니다
        public Integer peek() {
            if (listQueue.size() == 0) {
                return null;
            } else {
                return listQueue.get(0);
            }
        }

        public String show() {
            return listQueue.toString();
        }

        public void clear() {
            listQueue.clear();
        }
    }
}
