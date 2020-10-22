package VirtualDemo;

import java.util.HashMap;
import java.util.Map;
import com.alibaba.fastjson.JSON;

public class VirtualEstoneServe {
    private String account;
    private String password;
    private String uri;
    private Map<String,String> result = new HashMap<>();

    public Map<String, String> getResult() {
        return result;
    }

    public void setResult(Map<String, String> result) {
        this.result = result;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Map<String,String> loginController(String uri, String param){
        HashMap<String,String> hashMapParam = JSON.parseObject(param, HashMap.class);
        if(!uri.equals("/usermgt/login")){
            System.out.println("接口错误");
            result.put("code","1000");
            result.put("msg","接口错误，登录失败");
            return result;
        }
        if(hashMapParam.get("account").isEmpty()||hashMapParam.get("password").isEmpty()){
            System.out.println("账号密码为空");
            result.put("code","1001");
            result.put("msg","账号密码为空");
            return result;
        }
        if (queryAcount(hashMapParam.get("account"),hashMapParam.get("password")).equals("登录成功")) {
            result.put("code","100000");
            result.put("msg","登录成功");
        }else {
            result.put("code","10001");
            result.put("msg","登录失败");
        }
        return result;
    }

    public String queryAcount(String account,String password){
        setAccount("10013");
        setPassword("123456");
        if (this.account.equals(account) && this.password.equals(password)) {
            System.out.println("登录成功");
            return "登录成功";
        }else {
            System.out.println("登录失败");
            return "登录失败";
        }
    }

}
