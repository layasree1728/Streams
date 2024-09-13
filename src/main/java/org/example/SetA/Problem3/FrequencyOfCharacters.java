package org.example.SetA.Problem3;
/*Implement a Java program that uses streams to find the top 3 frequently
occurring characters in a given string.

Input = "find the top three frequently occurring characters"

 */
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    //String input="find the top three frequently occurring characters";
    public static List<Map.Entry<Character,Long>> SortFrequency(String input){
        Map<Character,Long> map=input.chars()
                .filter(c->c!=' ')
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Map.Entry<Character,Long>> result=map.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toList());

        return result;
    }
}
