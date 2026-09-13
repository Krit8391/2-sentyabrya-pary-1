import java.lang.reflect.Field;

class Notes {
    int uid;
    String title;
    String author;
    int pages;


    public Notes(int uid, String title, String author, int pages) {
        this.uid = uid;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

public class Task4 {
    static void main() {
        Notes note = new Notes(
                1005435,
                "Шутка",
                "И.С. Бах",
                2
        );

        try {
            Field authorField = note.getClass().getDeclaredField("author");
            String author = String.valueOf(authorField.get(note));
            System.out.println(author);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
