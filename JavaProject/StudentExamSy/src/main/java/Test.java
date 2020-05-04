import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private static Teacher teacher = new Teacher();
    public static void main(String[] args) throws IOException {
        String Corejava = "Corejava.txt";
        String Driving1 = "Driving1.txt";
        String Driving2 = "Driving2.txt";
        teacher.addTestPaper(TestPaper.getTestPaper(Corejava));
        teacher.addTestPaper(TestPaper.getTestPaper(Driving1));
        teacher.addTestPaper(TestPaper.getTestPaper(Driving2));
        List<Student> students = Student.getStudents("student.txt");
        teacher.setStudents(students);
        Student user = login();
        String userPathName = user.getAccount()+".txt";
        List<TestPaper> userTestPapers = readUserTestPapers(userPathName);
    }

    public static Student login(){
        Student user = new Student();
        return user;
    }
    public static List<TestPaper> readUserTestPapers(String userPathName){
        List<TestPaper> userTestPaper = new ArrayList<>();
        return userTestPaper;
    }
}
