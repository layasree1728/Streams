package org.example.SetA.Problem1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {
    public static List<List<String>> searchWebsites(List<List<String>> websites, String searchTerm) {
        return websites.stream()
                .filter(website -> website.stream().anyMatch(word -> word.toLowerCase().contains(searchTerm)))
                .sorted(Comparator.comparingInt((List<String> website) ->
                                (int) website.stream().filter(word -> word.toLowerCase().contains(searchTerm)).count())
                        .reversed())
                .collect(Collectors.toList());
    }
}
