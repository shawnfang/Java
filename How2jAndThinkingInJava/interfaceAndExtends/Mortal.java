package interfaceAndExtends;

public interface Mortal {

    // 接口默认的方法，并且可以提供具体的方法
    // 假设没有默认方法这种机制，那么如果要为Mortal增加一个新的方法revive,那么所有实现了Mortal接口的类，都需要做改动。
    //
    //但是引入了默认方法后，原来的类，不需要做任何改动，并且还能得到这个默认方法
    //
    //通过这种手段，就能够很好的扩展新的类，并且做到不影响原来的类
    default public void revive(){
        System.out.println("英雄复活的方法");
    }

    public void die();
}
