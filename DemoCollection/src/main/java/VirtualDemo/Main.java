package VirtualDemo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String,String> reqInfo= new HashMap<>();
        reqInfo.put("host","127.0.0.1");
        reqInfo.put("v_interface","/usermgt/login");
        reqInfo.put("method","post");
        reqInfo.put("port","8080");
        reqInfo.put("param","{'account':'10013','password':'123456'}");

        System.out.println("用户进行接口测试...");
        VirtualUser virtualUser = new VirtualUser();
        virtualUser.setReqInfo(reqInfo);
        virtualUser.setThreadCount(5);
        System.out.println("用户发起请求....");

        TomcatThreads tomcatThreads = new TomcatThreads();
        tomcatThreads.startThread(virtualUser);
    }
}
