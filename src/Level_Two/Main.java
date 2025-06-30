package Level_Two;
import Level_Two.model.*;

public class Main {
    public static void main(String []args) {
        Smartphone smartphone = new Smartphone("iPhone", "13");
        smartphone.photograph();
        smartphone.alarm();
        smartphone.call("943524323");
    }
}
