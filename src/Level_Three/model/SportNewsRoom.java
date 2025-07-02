package Level_Three.model;

import java.util.ArrayList;

public class SportNewsRoom {
    private ArrayList<Editor> editors = null;

    public SportNewsRoom() {
        this.editors = new ArrayList<>();
    }

    public void addEditor(String name, String dni) {
        Editor e = new Editor(name, dni);
        this.editors.add(e);
        System.out.println("Added Successfully");
    }

    public int deleteEditor(String dni) {
        int signal = 0;
        for (Editor e : editors) {
            if (e.getDni().equals(dni)) {
                editors.remove(e);
                signal = 1;
            }
        }
        return (signal);
    }

    public void deleteNews(String dni, String tittle) {
        if (dni == null || tittle == null)
            throw new NullPointerException("The object to search cannot be null.");
        for (Editor e : editors) {
            if (e.getDni().equals(dni)) {
                int i = editors.indexOf(e); break;
            }
        }
        News <ArrayList> news = editor.get(i).ge
        for (News n : ){
            if (n.getTittle().equals(tittle)) {
                editors.get(i).getNews().remove(n);
                System.out.println("Deleted Successfully");
            }
        }



    }

}
