package Level_Three.model;

public class MotorcyclingNews extends News{
    private String team;

    public MotorcyclingNews(String tittle, String team) {
        super(tittle);
        this.team = team;
        super.price = calculateNewsPrice();
        super.punctuation = calculateNewsPunctuation();
    }
    @Override
    public int calculateNewsPrice() {
        int total = 100;
        if (team.equalsIgnoreCase("Yamaha") || team.equalsIgnoreCase("Honda"))
            total += 50;
        return (total);
    }

    @Override
    public float calculateNewsPunctuation() {
        float total = 3.0f;
        if (team.equalsIgnoreCase("Yamaha") || team.equalsIgnoreCase("Honda"))
            total += 3.0f;
        return (total);
    }

    public String getTeam() {return team;}
    public void setTeam(String team) {this.team = team;}
}
