package Level_Three.model;

import java.util.List;

public class TennisNews extends News{
    private String competition;
    private String player;
    private static final List<String> STAR_PLAYERS = List.of("Federer", "Nadal", "Djokovic");


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
        if (STAR_PLAYERS.contains(player))
            total += 50;
        return (total);
    }

    @Override
    public float calculateNewsPunctuation(){

        float total = 4.0f;
        if (STAR_PLAYERS.contains(player))
            total += 3.0f;
        return (total);
    }

    public String getCompetition() {return competition;}
    public String getPlayer() {return player;}
    public void setCompetition(String competition) {this.competition = competition;}
    public void setPlayers(String player) {this.player = player;}
}
