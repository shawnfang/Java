package CourseStatics;

import java.util.HashSet;

import CourseStatics.Course;

public class Student {
    private String name;
    private HashSet<Course> course = new HashSet<Course>();

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public HashSet<Course> getCourse(){
        return course;
    }

    public boolean addCourse(Course c){
        return course.add(c);
    }



    // 计算学生课程总成绩
    public double totalScore(){
        double sum = 0;
        for(Course i:course){
            sum += i.getScore();
        }
        return sum;
    }

    // 计算学生平均成绩
    public double avgScore(){
        double avg = 0;
        avg = totalScore()/course.size();
        return avg;
    }




}
