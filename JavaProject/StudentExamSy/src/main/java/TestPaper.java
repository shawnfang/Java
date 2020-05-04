import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestPaper {
    private String TestPaperName;
    private int score;
    private List<ExamQuestion> examQuestions = new ArrayList<ExamQuestion>();

    public static TestPaper getTestPaper(String pathName) throws IOException {
        URL url = TestPaper.class.getClassLoader().getResource(pathName);
        File f = new File(url.getFile());
        FileReader fs = new FileReader(f);
        char[] all = new char[(int)f.length()];
        fs.read(all);
        for (char b:all){
            System.out.println(b);
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPaper testPaper = (TestPaper) o;
        return score == testPaper.score &&
                Objects.equals(TestPaperName, testPaper.TestPaperName) &&
                Objects.equals(examQuestions, testPaper.examQuestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TestPaperName, score, examQuestions);
    }

    @Override
    public String toString() {
        return "TestPaper{" +
                "TestPaperName='" + TestPaperName + '\'' +
                ", score=" + score +
                ", examQuestions=" + examQuestions +
                '}';
    }

    public int getScore() {
        return score;
    }

    public void setExamQuestions(List<ExamQuestion> examQuestions) {
        this.examQuestions = examQuestions;
    }

    public List<ExamQuestion> getExamQuestions() {
        return examQuestions;
    }

    public String getTestPaperName() {
        return TestPaperName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTestPaperName(String testPaperName) {
        TestPaperName = testPaperName;
    }

}
