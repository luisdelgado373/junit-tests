import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    ArrayList<Integer> grades = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
