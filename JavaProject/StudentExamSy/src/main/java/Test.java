import java.io.*;
import java.net.URL;
import java.util.*;

public class Test {
    private static Teacher teacher = new Teacher();
    private static String stuList = "student.txt";
    public static void main(String[] args) throws IOException {
        /*
        List<Student> students = Student.getStudents("student.txt");
        teacher.setStudents(students);
        Student user = login();
        String userPathName = user.getAccount()+".txt";
        List<TestPaper> userTestPapers = readUserTestPapers(userPathName);
        */
        String Driving1 = "Driving1.txt";
        String Driving2 = "Driving2.txt";
        String Corejava = "Corejava.txt";
        teacher.addTestPaper(TestPaper.getTestPaper(Corejava));
        teacher.addTestPaper(TestPaper.getTestPaper(Driving1));
        teacher.addTestPaper(TestPaper.getTestPaper(Driving2));
        Student student = login();
        String stuInfoFilePath = student.getAccount()+".txt";
        System.out.println(Test.readStuInfoFile(stuInfoFilePath));
        while (true){
            boolean isExit = false;
            System.out.println("请输入你要操作的选项，1：查询；2：考试；3：退出");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice){
                case "1":

                    break;
                case "2":
                    break;
                case "3":
                    isExit = true;
                    System.out.println("退出");
                    break;
            }
            if(isExit){
                break;
            }

        }
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
            Student student = new Student(s2[0].trim(),s2[2].trim());
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
            Student s = new Student(sNumber,sPassword);
            if(!Test.studentsList().contains(s)){
                System.out.println("用户名不存在");
                continue;
            }
            for (Student s0 : Test.studentsList()){
                if(s0.equals(s)){
                    user = s0;
                }
            }
            if(!user.getPassword().equals(s.getPassword())){
                System.out.println("密码错误");
                continue;
            }
            System.out.println("登录成功");
            break;
        }
        return user;
    }

    public static ArrayList readStuInfoFile(String stuInfoFielPath) throws IOException {
        ArrayList c = new ArrayList();
        ArrayList<String> Temp = new ArrayList();
        Set<String> etemp = new HashSet<>();
        URL url = TestPaper.class.getClassLoader().getResource(stuInfoFielPath);
        File f = new File(url.getFile());
        FileReader fs = new FileReader(f);
        BufferedReader in = new BufferedReader(fs);
        String line;
        int number = 0;
        while ((line = in.readLine())!= null){
            System.out.println(line);
            String title = line.split("#")[0];
            System.out.println(title);
            String answer = line.split("#")[1];
            char[] a = answer.toCharArray();
            TestPaper stuTestPaper = new TestPaper(title,0);
            if(!teacher.getTestPapers().contains(stuTestPaper)){
                System.out.println("没有这门课程");
                continue;
            }
            for (TestPaper t:teacher.getTestPapers()) {
                if (t.getTestPaperName().equals(title)) {
                    stuTestPaper = t;
                }
            }
            for(int i=0;i<stuTestPaper.getExamQuestions().size();i++) {
                if (i >= a.length) {
                    break;
                } else {
                    ExamQuestion e = stuTestPaper.getExamQuestions().get(i);
                    e.setStuAnswer(String.valueOf(answer.charAt(i)));
                    if (e.getAnswer().equals(e.getStuAnswer())) {
                        number += 1;
                    }
                    continue;
                }
            }
            stuTestPaper.calTestPaper(number);
            System.out.println(stuTestPaper.getScore());
        }
        return c;
    }
}
