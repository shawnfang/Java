package CourseStatics;

import java.util.HashSet;

import CourseStatics.Course;

public class Student {
    private String name;
    private HashSet<Course> course = new HashSet<Course>();
    public Student(String name){
        this.name = name;
    }

    public boolean addCourse(Course c){
        return course.add(c);
    }

    public int totalScore(){
        for(Course i:course){
                return  course.
        }
    }


}
