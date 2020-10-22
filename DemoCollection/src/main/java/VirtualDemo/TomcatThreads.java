package VirtualDemo;

import java.util.Map;

public class TomcatThreads implements Runnable {
    private Map<String,String> req;
    @Override
    public void run() {
        //userReq();
    }

    public void userReq(Map<String,String> req) {
        this.req = req;
    }

    public void startThread(int count) {
        TomcatThreads threadTrain = new TomcatThreads();
        for (int i = 0; i <= count ; i++) {
            String s = String.format("%s号线程",i);
            new Thread(threadTrain, s).start();
        }
    }

}