package org.example.SetA.Problem2;

/*Use Java streams to implement a program that sorts a list of students
based on first their grades in descending order, and if grades are equal,
then based on their names in alphabetical order.
 */
public class Student {
    int id;
    String name;
    int grade;

    public Student(int id,String name,int grade) {
        this.id=id;
        this.name=name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + '}';
    }
}
