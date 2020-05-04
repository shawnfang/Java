import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private int account;
    private int password;
    private List<TestPaper> testPaper = new ArrayList<TestPaper>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public int getPassword() {
        return password;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public List<TestPaper> getTestPaper() {
        return testPaper;
    }

    public static List<Student> getStudents(String path){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return account == student.account &&
                password == student.password &&
                Objects.equals(name, student.name) &&
                Objects.equals(testPaper, student.testPaper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, account, password, testPaper);
    }

    public void setTestPaper(List<TestPaper> testPaper) {
        this.testPaper = testPaper;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", password=" + password +
                ", testPaper=" + testPaper +
                '}';
    }
}
