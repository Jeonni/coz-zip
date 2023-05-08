package section_01.java_심화_Effective.스트림_Stream;

import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        List<String> output = findPeople(male, female, "김");
        System.out.println(output); // ["김유클", "김코딩", "김코츠"]
    }

    private static List<String> findPeople(List<String> male, List<String> female, String lastName) {

        return Stream.concat(male.stream(), female.stream())
                .distinct()
                .filter(element -> element.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());
    }


}