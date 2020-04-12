package CourseStatics;

public class HomeWork {
    public static void main(String[] args) {
        Course c1 = new Course("english",100);
        Course c2 = new Course("math",90);
        Course c3 = new Course("history",60 );

        Student s1 = new Student("xiaohong");
        Student s2 = new Student("xiaoming");
        Student s3 = new Student("xiaodong");

        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);
        s2.addCourse(c3);
        s3.addCourse(c1);
        s3.addCourse(c2);
        s3.addCourse(c3);

        SchoolClass sc1 = new SchoolClass();
        sc1.addStudent(s1);
        sc1.addStudent(s2);
        sc1.addStudent(s3);

        //System.out.println(s2.totalScore());
        //System.out.println(s2.avgScore());
        //System.out.println(sc1.avgCourseScore("math"));
        System.out.println(sc1.searchCourseScore("xiaohong","english"));

    }
}
