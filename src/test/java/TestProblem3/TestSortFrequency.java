package TestProblem3;

import org.example.SetA.Problem3.FrequencyOfCharacters;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestSortFrequency {
    String input="find the top three frequently occurring characters";
    @Test
    public void testSortFrequency() {
        List<Map.Entry<Character, Long>> topThree = FrequencyOfCharacters.SortFrequency(input);

        assertEquals(3, topThree.size());
        // Explicitly use Long for both expected and actual values to avoid ambiguity
        assertEquals(Long.valueOf(6), topThree.get(0).getValue());
        assertEquals(Long.valueOf(6), topThree.get(1).getValue());
        assertEquals(Long.valueOf(5), topThree.get(2).getValue());



    }
}
