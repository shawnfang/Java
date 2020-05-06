import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static Teacher teacher = new Teacher();
    private static String stuList = "student.txt";
    public static void main(String[] args) throws IOException {
        /*
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
        */

        for(Student s:studentsList()){
            System.out.println(s.getAccount());
            System.out.println(s.getPassword());
        }
        login();
    }

    public static List<Student> studentsList() throws IOException {
        List<Student> students = new ArrayList<>();
        URL stuUrl = TestPaper.class.getClassLoader().getResource(stuList);
        File f = new File(stuUrl.getFile());
        FileReader fs = new FileReader(f);
        char[] all = new char[(int)f.length()];
        fs.read(all);
        String stu = new String(all);
        String[] s = stu.split(";");
        for(String s1:s){
            String[] s2 = s1.split(" ");
            Student student = new Student();
            student.setAccount(s2[0].trim());
            student.setPassword(s2[2].trim());
            students.add(student);
        }
        return students;
    }

    public static Student login() throws IOException {
        Student user = new Student();
        while (true) {
            System.out.println("请输入你的学号");
            Scanner scan = new Scanner(System.in);
            String sNumber = scan.next();
            System.out.println("请输入你的密码");
            String sPassword = scan.next();
            user.setAccount(sNumber);
            user.setPassword(sPassword);
            for (Student s : Test.studentsList()) {
                if (!s.getAccount().contains(user.getAccount())){
                    continue;
                }else {
                    System.out.println("这是正确的用户名");
                    System.out.println(s.getAccount());
                    if (!s.getPassword().equals(user.getPassword())){
                        System.out.println("错误的密码");
                        break;
                    }else {
                        System.out.println("登录成功 ");
                    }
                }

            }
            return user;
        }

    }

    public static List<TestPaper> readUserTestPapers(String userPathName){
        List<TestPaper> userTestPaper = new ArrayList<>();
        return userTestPaper;
    }
}
