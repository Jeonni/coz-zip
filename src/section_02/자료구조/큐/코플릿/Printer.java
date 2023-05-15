package section_02.자료구조.큐.코플릿;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};

        int output = queuePrinter(bufferSize, capacities, documents);
        System.out.println(output); // 8
    }

    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO:
        // 결과를 담을 변수 선언
        int count = 0;

        // 인쇄 환경을 담을 큐를 선언
        Queue<Integer> queue = new LinkedList<>();

        // 선언한 큐를 0으로 채워주기
        for (int i = 0; i < bufferSize; i++) {
            queue.add(0);
        }

        // 첫 시작은 초기값 넣어주고, 0번 문서를 넣어준다. 이후 1 증가
        queue.poll();
        queue.add(documents[0]);
        // document 배열의 0번째 인덱스 삭제
        documents = getDocuments(documents);
        count++;

        // 반복 시작하기 (더 이상 문서가 없을 경우 && 대기열이 존재하지 않을 경우) => 멈추기
        while (documents.length != 0 || queue.stream().reduce(0, Integer::sum) != 0) {
            if (documents.length != 0) { // 대기 중 문서가 남은 경우
                int sum = getSum(documents, queue);
                if (sum > capacities) { // 작업 중인 문서와, 남은 문서 중 가장 처음 문서의 크기가 capacities보다 큰 경우
                    queue.poll();
                    sum = getSum(documents, queue);

                    if (sum <= capacities) {  // 문서가 제거되고, 남은 대기열의 첫 번째 문서를 포함했을 때 수용이 가능하다면,
                        queue.add(documents[0]);
                        documents = getDocuments(documents); // 문서를 하나 지워줌
                        count++;
                    } else { // 문서가 제거되고, 남은 대기열의 첫 번째 문서를 포함했을 때 수용이 불가능하다면,
                        queue.add(0);
                        count++;
                    }
                } else { // 작업 중인 문서와, 남은 문서 중 가장 처음 문서의 크기가 capacities보다 작은 경우
                    queue.poll();
                    queue.add(documents[0]);
                    documents = getDocuments(documents); // 문서를 하나 지워줌
                    count++;
                }

            } else { // 대기 중인 문서가 없는 경우
                queue.poll();
                queue.add(0);
                count++;
            }
        }
        return count;
    }

    private static int[] getDocuments(int[] documents) {
        return Arrays.copyOfRange(documents, 1, documents.length);
    }

    private static int getSum(int[] documents, Queue<Integer> queue) {
        return queue.stream().reduce(0, Integer::sum) + documents[0];
    }
}
