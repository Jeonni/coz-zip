package section_01.java_심화_Effective.스트림_Stream.스트림의_최종연산;

import java.util.Arrays;
import java.util.List;

/*
    collect()
    - 요소들을 수집하는 최종 처리 메서드
 */
public class TerminalOperationExample4 {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("김코딩", 100, Student.Gender.Male),
                new Student("박해커", 80, Student.Gender.Male),
                new Student("이자바", 90, Student.Gender.Female),
                new Student("나미녀", 60, Student.Gender.Female)
        );
    }
}

class Student {
    public enum Gender {Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Gender getGender() {
        return gender;
    }
}