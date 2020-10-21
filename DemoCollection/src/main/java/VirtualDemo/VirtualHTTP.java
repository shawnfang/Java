package VirtualDemo;


public class VirtualHTTP{
    public String host;
    public String v_interface;
    public String method;
    public String accept;
    public String authorization;
    public String vir_useragent;
    public String contentType;
    public String vCookie;
    public String param;

    public String getAccept() {
        return accept;
    }

    public String getAuthorization() {
        return authorization;
    }

    public String getContentType() {
        return contentType;
    }

    public String getHost() {
        return host;
    }

    public String getMethod() {
        return method;
    }

    public String getParam() {
        return param;
    }

    public String getV_interface() {
        return v_interface;
    }

    public String getvCookie() {
        return vCookie;
    }

    public String getVir_useragent() {
        return vir_useragent;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void setV_interface(String v_interface) {
        this.v_interface = v_interface;
    }

    public void setvCookie(String vCookie) {
        this.vCookie = vCookie;
    }

    public void setVir_useragent(String vir_useragent) {
        this.vir_useragent = vir_useragent;
    }

    @Override
    public String toString() {
        return "VirtualHTTP{" +
                "host='" + host + '\'' +
                ", v_interface='" + v_interface + '\'' +
                ", method='" + method + '\'' +
                ", accept='" + accept + '\'' +
                ", authorization='" + authorization + '\'' +
                ", vir_useragent='" + vir_useragent + '\'' +
                ", contentType='" + contentType + '\'' +
                ", vCookie='" + vCookie + '\'' +
                ", param='" + param + '\'' +
                '}';
    }
}
