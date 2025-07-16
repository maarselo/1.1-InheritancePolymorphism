package Level_Three.services;

import Level_Three.model.Editor;
import Level_Three.model.News;

public class NewsService {
    public static void addNewsToEditor(News news, Editor editor) {
        if (getNewsByTittle(news, editor) != null) {
            System.out.println("This editor have the news already.");
            return;
        }
        editor.addNews(news);
        System.out.println("Added Successfully.");
    }

    public static void deleteNewsToEditor(News news, Editor editor) {
        if (getNewsByTittle(news, editor) == null) {
            System.out.println("This editor don't have this news."); return;
        }
        editor.deleteNews(news);
        System.out.println("Delete Successfully.");
    }



    public static News getNewsByTittle(News news, Editor editor) {
        for (News n : editor.getNews()) {
            if (n.getTittle().equalsIgnoreCase(news.getTittle()))
                return (n);
        }
        return (null);
    }
}
