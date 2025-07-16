package Level_One_Ex2;
import Level_One_Ex2.model.*;

public class Main {
    public static void main(String []args) {
        System.out.println(Car.brand);
        System.out.println(Car.getModel());

        Car.setModel("Corolla");
        System.out.println(Car.getModel());
        Car.brake();
        Car car = new Car(150.0);
        System.out.println(car.getPower());
        car.accelerate();
    }
}
