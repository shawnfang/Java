import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
}
