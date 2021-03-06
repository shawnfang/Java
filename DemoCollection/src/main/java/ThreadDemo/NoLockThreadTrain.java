package ThreadDemo;

public class NoLockThreadTrain implements Runnable {
    private int trainCount = 100;
    @Override
    public void run() {
        while (trainCount > 0) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
            sale();
        }
    }
    public void sale() {
        if (trainCount > 0) {
            System.out.println(Thread.currentThread().getName() + ",出售第" + (100 - trainCount + 1) + "张票");
            trainCount--;
            System.out.println("当前剩余的票："+trainCount);
        }
    }

    public static void main(String[] args) {
        NoLockThreadTrain threadTrain = new NoLockThreadTrain();
        Thread t1 = new Thread(threadTrain, "1号线程");
        Thread t2 = new Thread(threadTrain, "2号线程");
        t1.start();
        t2.start();
    }
}
