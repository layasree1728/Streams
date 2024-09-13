package TestSetA.TestProblem1;

import org.example.SetA.Problem1.SearchEngine;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchEngineTest {

    List<List<String>> websites = Arrays.asList(
                Arrays.asList("java", "Spring", "SpringBoot", "SQL", "Database"),
                Arrays.asList("HTML", "CSS", "JavaScript", "Frontend"),
                Arrays.asList("Python", "Flask", "Django", "Database", "SQL"),
                Arrays.asList("java", "java", "SpringBoot", "JavaScript"),
                Arrays.asList("SQL", "Database", "MySQL", "java")
        );
        // Search term

        String searchTerm = "java";

    @Test
    public void testSearchWebsites(){
        SearchEngine engine = new SearchEngine();
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("java", "java", "SpringBoot", "JavaScript"),
                Arrays.asList("java", "Spring", "SpringBoot", "SQL", "Database"),
                Arrays.asList("HTML","CSS", "JavaScript", "Frontend"),
                Arrays.asList("SQL", "Database", "MySQL", "java")
        );
        List<List<String>> result=engine.searchWebsites(websites,searchTerm);
        assertEquals(expected,result);
    }

}
