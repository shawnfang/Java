package VirtualDemo;

public class TomcatThreads implements Runnable {
    private int virtual_max_threads = 100;

    @Override
    public void run() {
        while (virtual_max_threads > 0) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
            sale();
        }
    }

    public void sale() {
        if (virtual_max_threads > 0) {
            System.out.println(Thread.currentThread().getName() + ",出售第" + (100 - virtual_max_threads + 1) + "张票");
            virtual_max_threads--;
        }
    }

    public void threadMain(int threadCount) {
        TomcatThreads threadTrain = new TomcatThreads();

        Thread t1 = new Thread(threadTrain, "①号");
        Thread t2 = new Thread(threadTrain, "②号");
        t1.start();
        t2.start();
    }

}