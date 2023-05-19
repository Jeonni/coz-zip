package section_02.코딩테스트준비.코플릿.순열;

import java.util.ArrayList;
import java.util.Arrays;

public class RockPaperScissors {
    public static void main(String[] args) {
        ArrayList<String[]> output = rockPaperScissors(2);
        System.out.println(output);
    }

    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        ArrayList<String[]> outcomes = new ArrayList<>();
        return permutation(0, rounds, new String[rounds], outcomes);
    }

    /*
        @param curRound:    현재 라운드
        @param roundsToGo:  도달해야 하는 라운드
        @param playedSoFar: 지금까지 선택한 요소를 다는 배열
        @param outcomes:    결과를 담을 리스트
     */
    public static ArrayList<String[]> permutation(int curRounds, int roundsToGo, String[] playedSoFar, ArrayList<String[]> outcomes) {

        if (roundsToGo == curRounds) { // 재귀 탈출 조건, base case
            // 깊은 복사
            // arr 배열에 playedSoFar에 담긴 요소를 복사
            String[] arr = Arrays.copyOf(playedSoFar, playedSoFar.length);
            outcomes.add(arr);
            return outcomes;
        }

        String rps[] = new String[]{"rock", "paper", "scissors"};


        // i = 0, curRounds = 0, currentPlay = rock, playedSoFar = [rock, null, null]
        // i = 0, curRounds = 1, currentPlay = rock, playedSoFar = [rock, rock, null]
        // i = 0, curRounds = 2, currentPlay = rock, playedSoFar = [rock, rock, rock]
        // i = 1, curRounds = 3 일 경우, 재귀 탈출 조건에 걸려 list = [{rock, rock, rock}] 반환

        // i = 1, curRounds = 0, currentPlay = paper, playedSoFar = [rock, rock, paper], list = [{rock, rock, paper}]


        // rps 배열을 한 번씩 순회
        for (int i = 0; i < rps.length; i++) {
            // rps의 i번째 요소를 변수에 담기
            String currentPlay = rps[i];
            playedSoFar[curRounds] = currentPlay;
            outcomes = permutation(curRounds + 1, roundsToGo, playedSoFar, outcomes);
        }

        //curRounds = 0 -> 재귀 호출
        //curRounds = 1 -> 재귀 호출
        //curRounds = 2 -> return -> curRounds = 1일때 의 outcomes -> 반복문 실행 -> 재귀.. -> curRounds = 0일때의 outcomes -> 쭉하면

        System.out.println(123);
        return outcomes;
    }
}