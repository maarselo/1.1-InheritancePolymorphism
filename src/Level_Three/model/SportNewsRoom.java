package Level_Three.model;

import java.util.ArrayList;

public class SportNewsRoom {
    private ArrayList<Editor> editors = null;

    public SportNewsRoom() {
        this.editors = new ArrayList<>();
    }

    public void addEditor(Editor e) {
        if (e == null)
            throw new NullPointerException("The object cannot be null.");
        this.editors.add(e);
        System.out.println("Added Successfully");
    }

}
