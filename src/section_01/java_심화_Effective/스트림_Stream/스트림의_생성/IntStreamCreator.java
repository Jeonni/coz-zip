package section_01.java_심화_Effective.스트림_Stream.스트림의_생성;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamCreator {
    public static void main(String[] args) {
        // int형 배열로 스트림 생성
        int[] intArr = {1,2,3,4,5,6,7};
        IntStream intStream = Arrays.stream(intArr);

        // 숫자와 관련된 경우 intStream 사용을 권장
        System.out.println("sum = " + intStream.sum());
    }
}

/* output
    28
 */