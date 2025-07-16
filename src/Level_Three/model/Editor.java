package Level_Three.model;

import java.util.ArrayList;

public class Editor {
    private String name;
    private final String dni;
    static double salary = 1500;
    private ArrayList<News> news = null;

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.news = new ArrayList<>();
    }


    public void addNews(News n) {
        news.add(n);
    }
    public void deleteNews(News n) {
        news.remove(n);
    }

    public News getNewByTittle(String tittle) {
        for (News n : news) {
            if (n.getTittle().equalsIgnoreCase(tittle))
                return(n);
        }
        return (null);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDni() {return dni;}
    public static double getSalary() {return salary;}
    public static void setSalary(double salary) {Editor.salary = salary;}
    public ArrayList<News> getNews() {return news;}
}
