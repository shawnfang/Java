package CourseStatics;

import java.util.List;

public class SchoolClass {
    private List<Student> student;

    public boolean addStudent(Student s){
        return student.add(s);
    }

}
