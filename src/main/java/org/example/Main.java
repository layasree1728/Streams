package org.example;

import org.example.SetA.Problem2.Student;
import org.example.SetA.Problem3.FrequencyOfCharacters;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*List<Student> students = Arrays.asList(
                new Student(1, "Alice", 90),
                new Student(2, "Bob", 85),
                new Student(3, "Charlie", 90),
                new Student(4, "David", 85),
                new Student(5, "Eve", 95)
        );

        // Sort students by grade (descending) and then by name (alphabetical)
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getGrade, Comparator.reverseOrder())
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());

        // Print sorted students
        sortedStudents.forEach(System.out::println);*/
        String input="find the top three frequently occurring characters";
        List<Map.Entry<Character, Long>> topThree = FrequencyOfCharacters.SortFrequency(input);
        System.out.println(topThree);
    }
}