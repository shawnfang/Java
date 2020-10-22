package VirtualDemo;

import java.util.Map;

public interface HttpPro {
    Map<String,String> Req(Map<String,String> req);
    String Rep(VirtualHTTP rep);
}
