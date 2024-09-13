package org.example.SetA.Problem2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
Use Java streams to implement a program that sorts a list of students based
on first their grades in descending order, and if grades are equal, then
based on their names in alphabetical order.

 */
public class ExecutingStreams {

    public List<Student> sorting(List<Student> output) {
        List<Student> result = output.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed()
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());

        return result;
    }

}
