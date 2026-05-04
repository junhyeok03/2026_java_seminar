package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;


public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("신용권", 92));
        studentList.add(new Student("유미선", 87));

        // Student를 score(int)로 매핑
        studentList.stream()
                .mapToInt(s -> s.getScore())
                .forEach(score -> System.out.println(score));
    }
}