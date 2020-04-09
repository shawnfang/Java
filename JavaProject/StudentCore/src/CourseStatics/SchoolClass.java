package CourseStatics;

import java.util.HashSet;
import java.util.List;

public class SchoolClass {
    private HashSet<Student> student = new HashSet<Student>();
    private HashSet<Course> courses = new HashSet<Course>();

    public boolean addStudent(Student s){
        return student.add(s);
    }

    // 搜索某个学生的某个课程成绩
    public double searchCourseScore(String Sname,String Cname){
        double score =0;
        for (Student i: student){
            if(i.getName().equals(Sname) && i.getCourse().equals(Cname)){
                for (Course c: i.getCourse()){
                   score = c.getScore();
                }
            }else {
                score = 1;
            }
        }
        return score;
    }

    // 课程平均分
    public  double avgCourseScore(String Cname){
        double avg = 0;
        double sum = 0;
        for (Student s: student){
            for (Course c : s.getCourse()){
                if(c.getName().equals(Cname)){
                    courses.add(c);
                    sum += c.getScore();
                }
            }
        }
        if (courses.size() !=0) {
            avg = sum / courses.size();
        }
        return avg;
    }
}
