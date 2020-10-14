package designDemo.D1_01;

import designDemo.D0_00.IqiyiCardService;

public class PrizeController {
    public Aware_resp awareToUser(Aware_req aware_req){
        Aware_resp aware_resp = null;
        if (aware_req.getType() == 1) {
            String phone = queryPhone();
            IqiyiCardService iqiyiCardService = new IqiyiCardService();
            iqiyiCardService.getToken(phone,aware_req.getAwareNumber());
            aware_resp = new Aware_resp("恭喜获得一张Iqiyi会员卡",0000);
        }
        return aware_resp;
    }

    public String queryPhone(){
        return "15986808594";
    }

}
