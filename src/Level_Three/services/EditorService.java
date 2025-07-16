package Level_Three.services;

import Level_Three.model.Editor;

import java.util.ArrayList;

public class EditorService {
    private ArrayList<Editor> editors = null;

    public EditorService() {
        this.editors = new ArrayList<>();
    }

    public void addEditor(String name, String dni) {
        if (getEditorByDni(dni) != null){
            System.out.println("The editor is already.");return;
        }
        editors.add(new Editor(name, dni));
        System.out.println("Added Successfully.");
    }

    public void deleteEditor(String dni) {
        Editor e = getEditorByDni(dni);
        if (e == null){
            System.out.println("Not found the editor.");return;
        }
        editors.remove(e);
        System.out.println("Delete Successfully.");
    }

    public Editor getEditorByDni(String dni){
        for (Editor e : editors) {
            if (e.getDni().equalsIgnoreCase(dni))
                return (e);
        }
        return (null);
    }
    public ArrayList<Editor> getEditors() {return editors;}
}
