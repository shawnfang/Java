package VirtualDemo;

public class VirtualTomcat extends VirtualHTTP implements HttpPro {
    private int virtual_max_connections;
    private int virtual_max_threads;
    private int virtual_accept_count;
    private VirtualUser virtualUser;
    private VirtualHTTP virtualHTTPTomcat;

    public VirtualTomcat(){
        virtualHTTPTomcat = new VirtualHTTP();
        virtualHTTPTomcat.setMethod("post");
        virtualHTTPTomcat.setHost("127.0.0.1");
        virtualHTTPTomcat.setV_interface("/usermgt/login");
        virtualHTTPTomcat.setParam("{'account:10013','password':'123456'}");
        virtualHTTPTomcat.setAuthorization("e10adc3949ba59abbe56e057f20f883e");
        virtualHTTPTomcat.setPort("8080");
    }

    @Override
    public VirtualHTTP Req(VirtualHTTP req) {
        if(!req.getMethod().equals(virtualHTTPTomcat.getMethod())){
            System.out.println("您请求的方法错误");
            return null;
        }
        if(!req.getHost().equals(virtualHTTPTomcat.getHost())){
            System.out.println("您请求的域名错误");
            return null;
        }
        if (!req.getPort().equals(virtualHTTPTomcat.getPort())) {
            System.out.println("您请求的端口错误");
        }
        return null;
    }

    @Override
    public String Rep(VirtualHTTP rep) {
        return null;
    }
}
