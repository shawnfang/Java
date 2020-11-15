package designDemo.D0_00;

public abstract class AbstractorAnimal {
    public int weight;
    public int height;

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void eat();
}
