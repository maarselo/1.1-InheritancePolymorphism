package Level_One;

public abstract class Instrument {
    private String name;
    private int price;

    public Instrument (String name, int price) {
        this.name = name;
        this.price = price;
    }
    public abstract void play();

    public String getName() {return name;}
    public int getPrice() {return price;}
}

abstract class WindInstrument extends Instrument{
    public WindInstrument (String name, int price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }
}
abstract class StringInstrument extends Instrument{
    public StringInstrument (String name, int price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }
}

abstract class PercussionInstrument extends Instrument{
    public PercussionInstrument (String name, int price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }
}
