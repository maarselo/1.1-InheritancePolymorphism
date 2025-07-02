package Level_One_Ex1.model;

public class StringInstrument extends Instrument{
    public StringInstrument (String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }
}
