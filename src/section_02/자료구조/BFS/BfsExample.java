package section_02.자료구조.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
    BFS(Breathed First Search)
    - 너비 우선 탐색
    - 한 정점을 기준으로 변경하고, 변경된 기준에서 인접한 정점을 차례대로 방문

    1. 하나의 정점을 기준으로 해당 정점과 인접한 정점을 모두 방문
    2. 기준점을 방문했던 정점으로 변경하여, 해당 정점에서 인접한 정점을 방문
    3. 이러한 과정을 통해 최상위 정점을 기준으로 이어진 정점을 차레대로 방문

    - 최단 경로 탐색에 유리
    - 방문한 정점들을 모두 방문해야 하는 경우 메모리 사용이 큼
    - 그래프 크기와 밀도에 다라 성능이 달라짐
    - 시작 정점에서 도달할 수 없는 정점에 대해서는 탐색하지 않음
    - visited 와 같은 방문 여부를 체크하는 자료구조 사용해야 함

 */
public class BfsExample {

    /*
        1. BFS는 큐(Queue) 자료구조 활용하여 구현된다.
        2. 시작 노드를 큐에 삽입 후, 큐가 빌 때까지 반복 시작
        3. 큐에서 현재 정점을 가져옴 (queue.poll() 활용)
        4. 현재 정점은 이미 이동했다고 방문 여부를 체크 (ex: visited[index] = true;)
        5. poll() 사용해서 가져온 정점을 기준으로, 인접한 정점을 모두 큐에 삽입 (queue.offer() 활용)
        6. 다시 반복으로 돌아와, 큐가 빌 때까지 인접한 정점을 모두 큐에 삽입하여 그래프를 끝까지 순회


     */
    public ArrayList<Integer> bfs_array(int[][] array, boolean[] visited, int src, ArrayList<Integer> result) {
        Queue<Integer> queue = new LinkedList<>();

        // 시작 정점 큐에 넣어줌
        queue.offer(src);
        // 해당 버택스 방문 여부를 변경
        visited[src] = true;

        // 큐에 더이상 방문할 요소가 업을 때까지 반복
        while (!queue.isEmpty()) {
            // 현재 위치를 큐에서 꺼냄
            int cur = queue.poll();
            // 현재 방문한 정점을 result에 삽입
            result.add(cur);

            // 전체 배열에서 현재 버택스의 행만 확인
            for (int i = 0; i < array[cur].length; i++) {
                // 길이 존재하고, 아직 방문하지 않았을 경우
                if (array[cur][i] == 1 && !visited[i]) {
                    // 큐에 해당 버택스의 위치 넣어주고
                    queue.offer(i);
                    // 방문 여부 체크
                    visited[i] = true;
                }
            }
        }


        // 이어진 모든 길을 순회한 후, 방문 여부가 담긴 ArrayList를 반환
        return result;
    }
}
