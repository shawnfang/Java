package VirtualDemo;

public class VirtualUser implements HttpPro{
    private VirtualHTTP virtualHTTP_user ;
    private String user_host;
    private String user_interface;
    private String user_authorization;
    private String user_method;
    private String user_param;
    private String user_port;
    private int threadCount;

    public int getThreadCount() {
        return threadCount;
    }

    public VirtualHTTP getVirtualHTTP_user() {
        return virtualHTTP_user;
    }

    public void setVirtualHTTP_user(VirtualHTTP virtualHTTP_user) {
        this.virtualHTTP_user = virtualHTTP_user;
    }

    public void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }

    public String getUser_port() {
        return user_port;
    }

    public void setUser_port(String user_port) {
        this.user_port = user_port;
    }

    public String getUser_authorization() {
        return user_authorization;
    }

    public String getUser_host() {
        return user_host;
    }

    public String getUser_interface() {
        return user_interface;
    }

    public String getUser_method() {
        return user_method;
    }

    public String getUser_param() {
        return user_param;
    }

    public void setUser_authorization(String user_authorization) {
        this.user_authorization = user_authorization;
    }

    public void setUser_host(String user_host) {
        this.user_host = user_host;
    }

    public void setUser_interface(String user_interface) {
        this.user_interface = user_interface;
    }

    public void setUser_method(String user_method) {
        this.user_method = user_method;
    }

    public void setUser_param(String user_param) {
        this.user_param = user_param;
    }

    public void setVirtualHTTP(VirtualHTTP virtualHTTP) {
        this.virtualHTTP_user = virtualHTTP;
    }


    public VirtualHTTP userHttp(){
        VirtualHTTP virtualHTTP = new VirtualHTTP();
        virtualHTTP.setHost(getUser_host());
        virtualHTTP.setAuthorization(getUser_authorization());
        virtualHTTP.setV_interface(getUser_interface());
        virtualHTTP.setMethod(getUser_method());
        virtualHTTP.setParam(getUser_param());
        virtualHTTP.setPort(getUser_port());
        setVirtualHTTP_user(virtualHTTP);
        return getVirtualHTTP_user();
    }



    @Override
    public void Req(VirtualHTTP req) {
        req.setHost(getUser_host());
        req.setAuthorization(getUser_authorization());
        req.setV_interface(getUser_interface());
        req.setMethod(getUser_method());
        req.setParam(getUser_param());
        req.setPort(getUser_port());
        setVirtualHTTP_user(req);

    }

    @Override
    public String Rep(VirtualHTTP rep) {
        return null;
    }

}
