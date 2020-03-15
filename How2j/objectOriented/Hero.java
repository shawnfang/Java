package objectOriented;

public class Hero {
    float hp;
    String name;
    int moveSpeed;
    float armor;

    public void legendary(){
        System.out.println("超神");
    }

    public float getHp(){
        return hp;
    }

    public float recovery(float blood){
        return hp = hp+blood;
    }
}
