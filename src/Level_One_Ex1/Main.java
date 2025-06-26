package Level_One_Ex1;

import Level_One_Ex1.model.*;

public class Main {
    public static void main(String []args) {
        WindInstrument.showType();
        WindInstrument flute = new WindInstrument("Flute", 10.0); flute.play();
        StringInstrument violin = new StringInstrument("Violin", 13.5); violin.play();
        PercussionInstrument drum = new PercussionInstrument("Drum", 20.0); drum.play();
    }
}
