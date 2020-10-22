package VirtualDemo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> reqInfo= new HashMap<>();
        reqInfo.put("host","127.0.0.1");
        reqInfo.put("v_interface","/usermgt/login");
        reqInfo.put("method","post");
        reqInfo.put("port","8080");
        reqInfo.put("param","{'account':'10013','password':''}");

        System.out.println("用户进行接口测试...");
        VirtualUser virtualUser = new VirtualUser();
        virtualUser.setReqInfo(reqInfo);

        System.out.println("用户发起请求....");
        VirtualTomcat virtualTomcat = new VirtualTomcat();
        System.out.println("当前服务器最大等待数是："+virtualTomcat.getVirtual_accept_count());
        System.out.println("当前服务器最大连接数是："+virtualTomcat.getVirtual_max_connections());
        System.out.println("当前服务器最大线程数是："+virtualTomcat.getVirtual_max_threads());
        virtualTomcat.receiveUser(virtualUser);

    }
}
