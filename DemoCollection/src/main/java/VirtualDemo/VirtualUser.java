package VirtualDemo;

import java.util.HashMap;
import java.util.Map;

public class VirtualUser implements HttpPro{
    private VirtualHTTP virtualHTTP_user ;
    private int threadCount = 1;
    private Map<String,String> reqInfo;

    public VirtualUser(){
    }

    public Map<String, String> getReqInfo() {
        return reqInfo;
    }

    public void setReqInfo(Map<String, String> reqInfo) {
        this.reqInfo = reqInfo;
    }

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

    public void setVirtualHTTP(VirtualHTTP virtualHTTP) {
        this.virtualHTTP_user = virtualHTTP;
    }

    @Override
    public Map<String,String> Req(Map<String,String> req) {
        virtualHTTP_user = new VirtualHTTP();
        virtualHTTP_user.setHost(req.get("host"));
        virtualHTTP_user.setPort(req.get("port"));
        virtualHTTP_user.setParam(req.get("param"));
        virtualHTTP_user.setV_interface(req.get("v_interface"));
        virtualHTTP_user.setMethod(req.get("method"));
        return virtualHTTP_user.getHttpMap();
    }

    @Override
    public String Rep(VirtualHTTP rep) {
        return null;
    }

}
