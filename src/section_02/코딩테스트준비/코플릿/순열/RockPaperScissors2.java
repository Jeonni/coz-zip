package section_02.코딩테스트준비.코플릿.순열;

import java.util.ArrayList;
import java.util.Arrays;

public class RockPaperScissors2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> output = rockPaperScissors(1);

        System.out.println(output);

/*
    [
      ["rock", "rock", "rock", "rock", "rock"],
      ["rock", "rock", , "rock", "rock", "paper"],
      ["rock", "rock", , "rock", "rock", "scissors"],
      ["rock", "rock", "rock", "paper", "rock"],
      ["rock", "rock", "rock", "paper", "paper"],
      ["rock", "rock", "rock", "paper", "scissors"],
      ["rock", "rock", "rock", "scissors", "rock"],
      // ...etc ...
    ]
  */
    }

    public static ArrayList<ArrayList<String>> rockPaperScissors(int rounds) {
        ArrayList<ArrayList<String>> outcomes = new ArrayList<>();
        return permutation(rounds, new String[]{}, outcomes);
    }

    /*
        @param roundToGo:   도달해야 할 인덱스
        @param playedSoFar: 지금까지 선택한 요소를 담을 배열
        @param outcomes:    결과를 담을 배열
     */
    public static ArrayList<ArrayList<String>> permutation(int roundsToGo, String[] playedSoFar, ArrayList<ArrayList<String>> outcomes) {
        // 도달해야 할 값이 0일 경우 outcomes 배열에 삽입하고, 재귀에서 빠져나오기
        // int rounds = 0
        if (roundsToGo == 0) {
            ArrayList<String> outcome = new ArrayList<>(Arrays.asList(playedSoFar));
            outcomes.add(outcome);
            return outcomes;
        }

        // 필드 변수로 선언 가능하지만, 변하지 않을 경우에만 사용하기
        String[] rps = new String[]{"rock", "paper", "scissors"};

        // rps 배열을 한 번씩 순회합니다.
        for (int i = 0; i < rps.length; i++) {
            // rps의 i번째 요소를 변수에 담아서
            String currentPlay = rps[i];

            // permutate(본인)에 기존 rounds에서 하나 뺀 숫자와, 일회용 배열 playedSoFar에 currentPlay를 삽입하여 재귀를 실행합니다.
            // rounds에서 하나를 빼는 이유는, 일회용 배열의 크기를 rounds만큼 맞춰주기 위함입니다. [rock, rock, rock]
            String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length + 1);  //배열의 크기를 하나 늘리고, currentPlay를 요소로 넣어줍니다.
            concatArray[concatArray.length - 1] = currentPlay;

            outcomes = permutation(roundsToGo - 1, concatArray, outcomes);
        }

        // outcomes를 반환합니다.
        return outcomes;
    }
}