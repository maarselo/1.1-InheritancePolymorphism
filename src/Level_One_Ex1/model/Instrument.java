package Level_One_Ex1;

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

abstract class WindInstrument extends Instrument{
    public WindInstrument (String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }

    static String type = "Wind Instrument";
    static void showType() {
        System.out.println("Type: " + type );
    }
}
abstract class StringInstrument extends Instrument{
    public StringInstrument (String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }
}

abstract class PercussionInstrument extends Instrument{
    public PercussionInstrument (String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }
}
