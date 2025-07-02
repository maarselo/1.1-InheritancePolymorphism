package Level_One_Ex1.model;

public class WindInstrument extends Instrument{
    public WindInstrument (String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }

    static String type = "Wind Instrument";
    public static void showType() {
        System.out.println("Type: " + type );
    }
}
