import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Map<String, Student> students = new HashMap<>();
    Student a;
    Student b;
    Student c;

    @BeforeEach
    public void setUp() throws Exception {
        a = new Student("John",90);
        b = new Student("Jane",56);
        c = new Student("Richard",95);
        students.put(a.getName(),a);
        students.put(b.getName(),b);
        students.put(c.getName(),c);
    }

    @Test
    void increaseGrades_correctInput_works(){
        students = Student.increaseGrades(students);
        assertEquals(99,students.get(a.getName()).getGrade());
        assertEquals(61,students.get(b.getName()).getGrade());
        assertEquals(100,students.get(c.getName()).getGrade());
    }
}