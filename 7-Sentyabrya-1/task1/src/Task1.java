class DataBase {
    int pk;
    String title;
    String author;
    int views;
    int comments;

    public DataBase(int pk, String title, String author, int views, int comments) {
        this.pk = pk;
        this.title = title;
        this.author = author;
        this.views = views;
        this.comments = comments;
    }
}

public class Task1 {
    static void main(String[] args) {
        DataBase base = new DataBase(
                1,
                "Классы и объекты",
                "Сергей Балакирев",
                14356,
                12
        );
    }
}