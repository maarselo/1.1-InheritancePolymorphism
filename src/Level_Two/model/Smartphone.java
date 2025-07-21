package Level_Two.model;

import Level_Two.interfaces.Camara;
import Level_Two.interfaces.Clock;

public class Smartphone extends Phone implements Camara, Clock {
    public Smartphone (String brand, String model) {
        super(brand, model);
    }
    @Override
    public void photograph() {
        System.out.println("Taking a photo.");
    }
    @Override
    public void alarm(){
        System.out.println("Its ringing the alarm.");
    }
}
