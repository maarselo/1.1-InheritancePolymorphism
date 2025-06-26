package Level_One_Ex1.model;

abstract class Instrument {
    private String name;
    private double price;

    static {
        System.out.println("Class charged into memory");
    }
    {
        System.out.println("Building the object...");
    }
    public Instrument (String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void play();

    public String getName() { return name; }
    public double getPrice() { return price; }
}