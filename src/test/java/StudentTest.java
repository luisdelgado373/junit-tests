import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student(1,"Luis");
    }

    @Test
    public void testIfStudentCanBeCreated() {
        assertNotNull(student);
    }

    @Test
    public void testIfFieldsCanBeSet() {
        assertEquals(1, student.getId());
        assertEquals("Luis", student.getName());
        assertNotNull(student.getGrades());
    }

    @Test
    public void testIfArrayUpdates() {
        student.addGrade(77);
        assertSame(77,student.getGrades().get(0));
        assertSame(1,student.getGrades().size());
        student.addGrade(80);
        assertSame(2,student.getGrades().size());
        student.addGrade(90);
        assertSame(3,student.getGrades().size());
    }

    @Test
    public void testIfGradeAvgIsCorrect() {
        student.addGrade(80);
        student.addGrade(90);

        assertEquals(85,student.getGradeAverage(),0);
    }

}
