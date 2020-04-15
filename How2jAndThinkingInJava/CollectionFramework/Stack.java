package CollectionFramework;

import interfaceAndExtends.HeroBoss;
import objectOriented.Hero;

public interface Stack {
    public void push(HeroBoss h);
    public HeroBoss pull();
    public HeroBoss peek();
}
