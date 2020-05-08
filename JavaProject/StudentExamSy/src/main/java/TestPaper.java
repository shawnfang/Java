import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestPaper {
    private String TestPaperName;
    private int score;
    private List<ExamQuestion> examQuestions = new ArrayList<ExamQuestion>();

    public TestPaper(){

    }

    public TestPaper(String testPaperName){
        super();
        this.TestPaperName = testPaperName;
    }

    public TestPaper(String TestPaperName,int score){
        this.TestPaperName = TestPaperName;
        this.score = score;
    }

    public TestPaper(String tName,List<ExamQuestion> examQuestion){
        this.TestPaperName = tName;
        this.examQuestions = examQuestion;
    }

    public int calTestPaper(int number){
        score = number*10;
        return score;
    }

    public static TestPaper getTestPaper(String pathName) throws IOException {
        System.out.println(pathName);
        String[] PaperName = pathName.split("\\.");
        List<ExamQuestion> examQuestions = new ArrayList<ExamQuestion>();
        URL url = TestPaper.class.getClassLoader().getResource(pathName);
        File f = new File(url.getFile());
        FileReader fs = new FileReader(f);
        char[] all = new char[(int)f.length()];
        fs.read(all);
        String TestPaper = new String(all);
        String[] s = TestPaper.split("@");
        for(String s1:s){
            ExamQuestion examQuestion = new ExamQuestion();
            String[] question = s1.split(":");
            String selectString = question[1];
            String[] selectList = selectString.split("answer=");
            examQuestion.setQuestion(question[0]);
            examQuestion.setSelect(selectList[0]);
            examQuestion.setAnswer(selectList[1].trim());
            examQuestions.add(examQuestion);
        }
        TestPaper testPaper = new TestPaper(PaperName[0],examQuestions);
        return testPaper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestPaper testPaper = (TestPaper) o;
        if(!TestPaperName.equals(testPaper.TestPaperName)) {
            return false;
        }
        return true;
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
