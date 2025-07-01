package Level_Three.model;

public abstract class News {
    protected String tittle;
    protected String text;
    protected float punctuation;
    protected int price;

    public News(String tittle) {
        this.tittle = tittle;
        this.text = "";
    }
    public abstract int calculateNewsPrice();
    public abstract float calculateNewsPunctuation();

    public String getTittle() {return tittle;}
    public String getText() {return text;}
    public float getPunctuation() {return punctuation;}
    public int getPrice() {return price;}
    public void setTittle(String tittle) {this.tittle = tittle;}
    public void setText(String text) {this.text = text;}
    public void setPunctuation(float punctuation) {this.punctuation = punctuation;}
    public void setPrice(int price) {this.price = price;}
}
