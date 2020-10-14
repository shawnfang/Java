package designDemo.D1_01;

public class Aware_resp {
    private String msg;
    private int code;

    public Aware_resp(String msg,int code){
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Aware_resp{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }
}
