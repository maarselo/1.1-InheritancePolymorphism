package Level_Three.model;

public class F1News extends News{
    private String team;

    public F1News(String tittle, String team) {
        super(tittle);
        this.team = team;
        super.price = calculateNewsPrice();
        super.punctuation = calculateNewsPunctuation();
    }

    @Override
    public int calculateNewsPrice() {
        int total = 100;
        if (team.equalsIgnoreCase("Mercedes") || team.equalsIgnoreCase("Ferrari"))
            total += 50;
        return (total);
    }

    @Override
    public float calculateNewsPunctuation() {
        float total = 4.0f;
        if (team.equalsIgnoreCase("Mercedes") || team.equalsIgnoreCase("Ferrari"))
            total += 2.0f;
        return (total);
    }

    public String getTeam() {return team;}
    public void setTeam(String team) {this.team = team;}
}
