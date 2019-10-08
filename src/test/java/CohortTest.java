import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort ceres;
    Student student1;
    Student student2;
    Student student3;

    @Before
    public void setUp() {
        student1 = new Student(1,"Tom");
        student2 = new Student(2,"Jerry");
        student3 = new Student(3,"Spike");
        ceres = new Cohort();
        ceres.addStudent(student1);
        ceres.addStudent(student2);
        ceres.addStudent(student3);
    }

    @Test
    public void testIfStudentCanBeAdded() {
        ceres.addStudent(student1);
        assertSame(1,ceres.getStudents().size());
        ceres.addStudent(student2);
        assertSame(2,ceres.getStudents().size());
        ceres.addStudent(student3);
        assertSame(3,ceres.getStudents().size());
    }

    @Test
    public void testIfCohortHasCorrectAverage() {
        student1.addGrade(50);
        student2.addGrade(50);
        student3.addGrade(50);

        assertEquals(50,ceres.getCohortAverage(),0);
    }
}
