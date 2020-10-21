package VirtualDemo;

public class main {
    public static void main(String[] args) {
        VirtualUser virtualUser = new VirtualUser();
        virtualUser.setUser_host("127.0.0.1");
        virtualUser.setUser_authorization("e10adc3949ba59abbe56e057f20f883e");
        virtualUser.setUser_interface("/usermgt/login");
        virtualUser.setUser_method("post");
        virtualUser.setUser_port("8080");
        virtualUser.setUser_param("{'account:10013','password':'123456'}");

        virtualUser.setThreadCount(1);
        VirtualTomcat virtualTomcat = new VirtualTomcat();
        /*
        这里还有问题
         */
        virtualTomcat.Req(virtualUser.Req(virtualUser.getVirtualHTTP_user()));

    }
}
