import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private List<Student> students = new ArrayList<Student>();
    private List<TestPaper> testPapers = new ArrayList<TestPaper>();

    public boolean addTestPaper(TestPaper testPaper){
        if(testPapers.contains(testPaper)){
            return false;
        }
        testPapers.add(testPaper);
        return true;
    }
}
