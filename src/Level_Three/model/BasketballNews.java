package Level_Three.model;

public class BasketballNews extends News{
    private String competition;
    private String club;

    public BasketballNews(String tittle, String competition, String club) {
        super (tittle);
        this.competition = competition;
        this.club = club;
        super.price = calculateNewsPrice();
        super.punctuation = calculateNewsPunctuation();
    }

    @Override
    public int calculateNewsPrice(){
        int total = 250;
        if (competition.equalsIgnoreCase("Euro League"))
            total += 75;
        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))
            total += 75;
        return (total);
    }

    @Override
    public float calculateNewsPunctuation(){
        float total = 4.0f;
        if (competition.equalsIgnoreCase("Euro League"))
            total += 3.0f;
        else if (competition.equalsIgnoreCase("ACB"))
            total += 2.0f;
        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))
            total += 1.0f;
        return (total);
    }

    public String getCompetition() {return competition;}
    public String getClub() {return club;}
    public void setCompetition(String competition) {this.competition = competition;}
    public void setClub(String club) {this.club = club;}
}
