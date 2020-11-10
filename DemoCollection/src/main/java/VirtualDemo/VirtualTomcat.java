package VirtualDemo;

import java.util.Map;

public class VirtualTomcat extends VirtualHTTP implements HttpPro,Runnable {
    /*
    最大连接数
     */
    private int virtual_max_connections = 10;
    /*
    最大线程数
     */
    private int virtual_max_threads = 5;
    /*
    最大等待数
     */
    private int virtual_accept_count = 5;
    private VirtualUser virtualUser;
    private VirtualHTTP virtualHTTPTomcat;
    private VirtualEstoneServe virtualEstoneServe;

    public VirtualTomcat(){
        virtualHTTPTomcat = new VirtualHTTP();
        virtualHTTPTomcat.setMethod("post");
        virtualHTTPTomcat.setHost("127.0.0.1");
        virtualHTTPTomcat.setPort("8080");
    }

    public int getVirtual_accept_count() {
        return virtual_accept_count;
    }

    public void setVirtual_accept_count(int virtual_accept_count) {
        this.virtual_accept_count = virtual_accept_count;
    }

    public int getVirtual_max_connections() {
        return virtual_max_connections;
    }

    public void setVirtual_max_connections(int virtual_max_connections) {
        this.virtual_max_connections = virtual_max_connections;
    }

    public int getVirtual_max_threads() {
        return virtual_max_threads;
    }

    public void setVirtual_max_threads(int virtual_max_threads) {
        this.virtual_max_threads = virtual_max_threads;
    }

    public VirtualUser getVirtualUser() {
        return virtualUser;
    }

    public void setVirtualUser(VirtualUser virtualUser) {
        this.virtualUser = virtualUser;
    }

    public void receiveUser(){
        Req(virtualUser.Req(virtualUser.getReqInfo()));
    }

    @Override
    public Map<String,String> Req(Map<String,String> req) {
        System.out.println("收到用户的请求");
        if(!req.get("method").equals(virtualHTTPTomcat.getMethod())){
            System.out.println("您请求的方法错误");
            return null;
        }
        if(!req.get("host").equals(virtualHTTPTomcat.getHost())){
            System.out.println("您请求的域名错误");
            return null;
        }
        if (!req.get("port").equals(virtualHTTPTomcat.getPort())) {
            System.out.println("您请求的端口错误");
        }
        virtualEstoneServe = new VirtualEstoneServe();
        return  virtualEstoneServe.loginController(req.get("v_interface"),req.get("param"));
    }

    @Override
    public String Rep(VirtualHTTP rep) {
        return null;
    }

    @Override
    public void run() {
        boolean exit = false;
        System.out.println("当前的线程id:"+Thread.currentThread().getId()+" 开始运行");
        while (!exit) {
            try {
                Thread.sleep(100);
                System.out.println("当前的线程id " + Thread.currentThread().getId() + "的状态是：" + Thread.currentThread().getState());
                receiveUser();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            exit = true;
        }
        System.out.println("当前的线程id:"+Thread.currentThread().getId()+" 结束运行");
    }
}
