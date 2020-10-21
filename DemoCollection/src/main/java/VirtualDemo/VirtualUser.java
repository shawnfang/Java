package VirtualDemo;

public class VirtualUser implements HttpPro{
    private VirtualHTTP virtualHTTP;
    private String user_host;
    private String user_interface;
    private String user_authorization;
    private String user_method;
    private String user_param;

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
        this.virtualHTTP = virtualHTTP;
    }

    @Override
    public void Req(VirtualUser req) {
        virtualHTTP = new VirtualHTTP();
        virtualHTTP.setHost(req.getUser_host());
        virtualHTTP.setAuthorization(req.getUser_authorization());
        virtualHTTP.setV_interface(req.getUser_interface());
    }

    @Override
    public String Rep(VirtualUser rep) {
        return null;
    }

    @Override
    public void Body(VirtualUser body) {

    }
}
