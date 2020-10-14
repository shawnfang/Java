package designDemo.D1_01;

public class TestMain {
    public static void main(String[] args) {
        PrizeController prizeController = new PrizeController();
        Aware_req aware_req = new Aware_req();
        aware_req.setType(1);
        aware_req.setAwareNumber("SFDdfsdeEIO13");
        System.out.println(prizeController.awareToUser(aware_req));
    }
}
