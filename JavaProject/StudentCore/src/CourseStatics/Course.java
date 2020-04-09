package CourseStatics;

public class Course {
    private String name;
    private double score;

    public Course(String name,int score){
        this.name = name;
        this.score = score;
    }

    public double getScore(){
        return score;
    }

    public String getName(){
        return name;
    }


}
