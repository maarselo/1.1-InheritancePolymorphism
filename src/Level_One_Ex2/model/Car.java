package Level_One_Ex2.model;

public class Car {
    public static final String brand = "Lamborghini";
    private static String model = "Aventador";
    private final double power;

    public Car(double power) {
        this.power = power;
    }
    public static void brake() {
        System.out.println("The vehicle is braking.");
    }
    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public static String getModel() { return model; }
    public double getPower() { return power; }
    public static void setModel(String model) {Car.model = model;}
}

