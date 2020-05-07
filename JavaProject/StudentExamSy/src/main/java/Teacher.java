import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Teacher {
    private List<Student> students = new ArrayList<Student>();
    private List<TestPaper> testPapers = new ArrayList<TestPaper>();

    public boolean addTestPaper(TestPaper testPaper){
        if(testPapers.contains(testPaper)){
            return false;
        }
        testPapers.add(testPaper);
        return true;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<TestPaper> getTestPapers() {
        return testPapers;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTestPapers(List<TestPaper> testPapers) {
        this.testPapers = testPapers;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "students=" + students +
                ", testPapers=" + testPapers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) o;
        return Objects.equals(testPapers, teacher.testPapers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, testPapers);
    }
}
