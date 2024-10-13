package DemoTest.Testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {
    private University university;
    private Student student3;
    private Student student1;
    private Student student2;


    @BeforeEach
    public void setUp() {
        Student student1 = new Student("Dima", 23, true);
        Student student2 = new Student("Elza", 22, false);
        Student student3 = new Student("Masha", 18, false);
        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
    }
    @Test
    public void getAllStudents() {

         University university = new University();
        List<Student> expected = university.getAllStudents();

        List<Student> actual = new ArrayList<Student>();

        assertEquals(expected, actual   );
    }

    @Test
    public void getAllStudentsMale() {
        List<Student> expected = university.getAllStudents(true);

        List<Student> actual = new ArrayList<Student>();

        actual.add(student1);


        assertEquals(expected, actual);
    }
}
