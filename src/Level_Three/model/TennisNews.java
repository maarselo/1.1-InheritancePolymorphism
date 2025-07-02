package Level_Three.model;

public class TennisNews extends News{
    private String competition;
    private String player;

    public TennisNews(String tittle, String competition, String player) {
        super(tittle);
        this.competition = competition;
        this.player = player;
        super.price = calculateNewsPrice();
        super.punctuation = calculateNewsPunctuation();
    }

    @Override
    public int calculateNewsPrice(){
        int total = 150;
        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") || player.equalsIgnoreCase("Djokovic"))
            total += 50;
        return (total);
    }

    @Override
    public float calculateNewsPunctuation(){
        float total = 4.0f;
        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") || player.equalsIgnoreCase("Djokovic"))
            total += 3.0f;
        return (total);
    }

    public String getCompetition() {return competition;}
    public String getPlayer() {return player;}
    public void setCompetition(String competition) {this.competition = competition;}
    public void setPlayers(String player) {this.player = player;}
}
