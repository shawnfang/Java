package VirtualDemo;

import java.util.Map;

public class TomcatThreads extends VirtualTomcat {
    public void startThread(VirtualUser virtualUser) throws InterruptedException {
        VirtualTomcat virtualTomcat = new VirtualTomcat();
        virtualTomcat.setVirtualUser(virtualUser);
        System.out.println("当前服务器最大等待数是："+virtualTomcat.getVirtual_accept_count());
        System.out.println("当前服务器最大连接数是："+virtualTomcat.getVirtual_max_connections());
        System.out.println("当前服务器最大线程数是："+virtualTomcat.getVirtual_max_threads());
        Thread[] threads = new Thread[virtualTomcat.getVirtualUser().getThreadCount()];
        for (int i = 0; i < threads.length; i++) {
            String s = String.format("启动第%s个线程线程，当前的线程状态是：",i+1);
            threads[i] = new Thread(virtualTomcat);
            System.out.println(s + threads[i].getState());
            threads[i].start();
        }
    }
}