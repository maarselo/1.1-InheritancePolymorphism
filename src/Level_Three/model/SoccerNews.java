package Level_Three.model;

public class SoccerNews extends News{
    private String competition;
    private String club;
    private String player;

    public SoccerNews(String tittle, String competition, String club, String player) {
        super(tittle);
        this.competition = competition;
        this.club = club;
        this.player = player;
        super.price = calculateNewsPrice();
        super.punctuation = calculateNewsPunctuation();
    }

    @Override
    public int calculateNewsPrice(){
        int total = 300;
        if (competition.equalsIgnoreCase("Champions League"))
            total += 100;
        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))
            total += 100;
        if (player.equalsIgnoreCase("Benzema") || club.equalsIgnoreCase("Ferran Torres"))
            total += 50;
        return (total);
    }

    @Override
    public float calculateNewsPunctuation() {
        float total = 5.0f;
        if (competition.equalsIgnoreCase("Champions League"))
            total += 3.0f;
        else if (competition.equalsIgnoreCase("League"))
            total += 2.0f;
        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))
            total += 1.0f;
        if (player.equalsIgnoreCase("Benzema") || player.equalsIgnoreCase("Ferran Torres"))
            total += 1.0f;
        return (total);
    }

    public String getCompetition() {return competition;}
    public String getClub() {return club;}
    public String getPlayer() {return player;}
    public void setCompetition(String competition) {this.competition = competition;}
    public void setClub(String club) {this.club = club;}
    public void setPlayer(String player) {this.player = player;}
}
