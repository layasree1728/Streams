package TestSetA.TestProblem2;

import org.example.SetA.Problem2.ExecutingStreams;
import org.example.SetA.Problem2.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.*;
public class StudentTest {


    private List<Student> students;

    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;

    @Before
    public void setUp()
    {
        student1 = new Student(1, "sam", 90);
        student2 = new Student(2, "Bob", 85);
        student3 = new Student(3, "karan", 90);
        student4 = new Student(4, "David", 85);
        student5 = new Student(5, "Eagle", 95);

        students = List.of(student1, student2, student3, student4, student5);
    }

    @Test
    public void testSorting(){
        ExecutingStreams object=new ExecutingStreams();

        List<Student> result=object.sorting(students);

        assertThat(result).containsExactly(
                student5,
                student3,
                student1,
                student2,
                student4
        );
    }
}
