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
            if(i.getName().contains(Sname)){
                for(Course c:i.getCourse()){
                    if(c.getName().equals(Cname)) {
                        score = c.getScore();
                    }
                }
            }
        }
        return score;
    }

    // 课程平均分
    public  double avgCourseScore(String Cname){
        double avg = 0;
        double sum = 0;
        HashSet<Student> st = new HashSet<>();
        for (Student s: student){
            for (Course c : s.getCourse()){
                    if(c.getName().contains(Cname)){
                        st.add(s);
                        sum += c.getScore();
                    }

            }
        }
        if (st.size() !=0) {
            avg = sum / st.size();
        }
        return avg;
    }
}
