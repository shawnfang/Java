import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String account;
    private String password;
    private List<TestPaper> testPaper = new ArrayList<TestPaper>();

    public Student(){

    }
    public Student(String account,String password){
        super();
        this.account = account;
        this.password = password;
    }
    public Student(String account,String name,String password){
        super();
        this.account = account;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
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
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        if(account == null){
            if(student.account !=null){
                return false;
            }
        }else if(!account.equals(student.account)){
            return false;
        }
        return true;
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
