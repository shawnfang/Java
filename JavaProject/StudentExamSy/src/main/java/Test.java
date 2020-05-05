import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static Teacher teacher = new Teacher();
    public static void main(String[] args) throws IOException {
        /*
        String Corejava = "Corejava.txt";
        String Driving1 = "Driving1.txt";
        String Driving2 = "Driving2.txt";
        teacher.addTestPaper(TestPaper.getTestPaper(Corejava));
        teacher.addTestPaper(TestPaper.getTestPaper(Driving1));
        teacher.addTestPaper(TestPaper.getTestPaper(Driving2));

        teacher.setStudents(students);
        Student user = login();
        String userPathName = user.getAccount()+".txt";
        List<TestPaper> userTestPapers = readUserTestPapers(userPathName);
        */
        List<Student> students = Student.getStudents("student.txt");

    }

    public static Student login() {
        Student user = new Student();
        while (true) {
            System.out.println("请输入你的学号");
            Scanner scan = new Scanner(System.in);
            String sNumber = scan.next();
            System.out.println("请输入你的密码");
            String sPassword = scan.next();

        }
    }
    public static List<TestPaper> readUserTestPapers(String userPathName){
        List<TestPaper> userTestPaper = new ArrayList<>();
        return userTestPaper;
    }
}
