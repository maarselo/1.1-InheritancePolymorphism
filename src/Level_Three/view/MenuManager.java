package Level_Three.view;

import Level_Three.model.*;
import Level_Three.services.EditorService;
import Level_Three.services.NewsService;

import java.util.Scanner;

public class MenuManager {
    public static Scanner keyboard = new Scanner(System.in);
    public static EditorService editorService = new EditorService();

    public static void run () {
        int option = 0;
        do {
            System.out.println(MenuTexts.menu);
            option = keyboard.nextInt();
            keyboard.nextLine();
            switch (option) {
                case 1 -> addEditor();
                case 2 -> deleteEditor();
                case 3 -> addNewsToEditor();
                case 4 -> deleteNews();
                case 5 -> showAllNewsByEditor();
                case 6 -> calculateScore();
                case 7 -> calculatePrice();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }
    public static void addEditor() {
        System.out.print("What is the name of the editor:");
        String name = keyboard.nextLine();
        System.out.print("What is the dni of the editor:");
        String dni = keyboard.nextLine();
        editorService.addEditor(name, dni);
    }
    public static void deleteEditor() {
        System.out.print("What is the dni of the editor to delete:");
        String dni = keyboard.nextLine();
        editorService.deleteEditor(dni);
    }
    public static void addNewsToEditor(){
        System.out.print("What is the dni of the editor to add the news:");
        String dni = keyboard.nextLine();
        Editor editor = editorService.getEditorByDni(dni);
        if (editor == null) {
            System.out.println("Editor not found.");return;
        }
        System.out.println("Type of new:\n1.Soccer\n2.Basketball\n3.Tennis\n4.F15.Motorcycling\nPut in text");
        String type = keyboard.nextLine().toLowerCase();
        System.out.print("Which is the tittle: ");
        String tittle = keyboard.nextLine();

        News news = null;
        switch (type) {
            case ("soccer") -> {
                System.out.print("Competition: ");
                String competition = keyboard.nextLine();
                System.out.print("Club: ");
                String club = keyboard.nextLine();
                System.out.print("Player: ");
                String player = keyboard.nextLine();
                news = new SoccerNews(tittle, competition, club, player);
            }
            case "basketball" -> {
                System.out.print("Competition: ");
                String competition = keyboard.nextLine();
                System.out.print("Club: ");
                String club = keyboard.nextLine();
                news = new BasketballNews(tittle, competition, club);
            }
            case "tennis" -> {
                System.out.print("Competition: ");
                String competition = keyboard.nextLine();
                System.out.print("Tennis player: ");
                String player = keyboard.nextLine();
                news = new TennisNews(tittle, competition, player);
            }
            case "f1" -> {
                System.out.print("Team: ");
                String team = keyboard.nextLine();
                news = new F1News(tittle, team);
            }
            case "motorcycling" -> {
                System.out.print("Team: ");
                String team = keyboard.nextLine();
                news = new MotorcyclingNews(tittle, team);
            }
            default -> System.out.println("Invalid option");
        }
        NewsService.addNewsToEditor(news, editor);
    }
    public static void deleteNews() {
        System.out.print("What is the dni of the editor:");
        String dni = keyboard.nextLine();
        Editor editor = editorService.getEditorByDni(dni);
        if (editor == null)
            System.out.println("Not found the editor");
        System.out.print("What is the tittle of the new to delete:");
        String tittle = keyboard.nextLine();
        News newsToDelete = null;
        for (News n : editor.getNews()) {
            if (n.getTittle().equalsIgnoreCase(tittle)) {
                newsToDelete = n;
                break;
            }
        }

        if (newsToDelete == null) {
            System.out.println("News not found.");
            return;
        }
        NewsService.deleteNewsToEditor(newsToDelete, editor);
    }

    public static void showAllNewsByEditor() {
        System.out.print("Enter the DNI of the editor: ");
        String dni = keyboard.nextLine();
        Editor editor = editorService.getEditorByDni(dni);

        if (editor == null) {
            System.out.println("Editor not found.");
            return;
        }

        if (editor.getNews().isEmpty()) {
            System.out.println("This editor has no news.");
            return;
        }

        System.out.println("News by " + editor.getName() + ":");
        for (News n : editor.getNews()) {
            System.out.println("- " + n.getTittle());
        }
    }

    public static void calculateScore() {
        News news = getNewsByEditorAndTittle();
        if (news != null) {
            System.out.println("Score: " + news.calculateNewsPunctuation());
        }
    }

    public static void calculatePrice() {
        News news = getNewsByEditorAndTittle();
        if (news != null) {
            System.out.println("Price: " + news.calculateNewsPrice() + " €");
        }
    }


    private static News getNewsByEditorAndTittle() {
        System.out.print("Enter the DNI of the editor: ");
        String dni = keyboard.nextLine();
        Editor editor = editorService.getEditorByDni(dni);

        if (editor == null) {
            System.out.println("Editor not found.");
            return null;
        }

        System.out.print("Enter the title of the news: ");
        String title = keyboard.nextLine();

        for (News n : editor.getNews()) {
            if (n.getTittle().equalsIgnoreCase(title)) {
                return n;
            }
        }

        System.out.println("News not found.");
        return null;
    }



}
