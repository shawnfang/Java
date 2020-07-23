package CollectionFramework;

import InterfaceAndExtends.HeroBoss;

public interface Stack {
    public void push(HeroBoss h);

    public HeroBoss pull();

    public HeroBoss peek();
}
