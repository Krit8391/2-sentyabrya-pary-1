import java.lang.reflect.Field;
import java.util.Optional;

class Dictionary {
    String rus;
    String eng;

    public Dictionary(String rus, String eng) {
        this.rus = rus;
        this.eng = eng;
    }
}

public class Task5 {
    static void main() {
        Dictionary dict = new Dictionary("Питон", "Python");

        Optional<String> rusWord = getValue(dict, "rus_word");
        // Не выведится
        rusWord.ifPresent(System.out::println);

        Optional<String> rus = getValue(dict, "rus");
        // Выведется
        rus.ifPresent(System.out::println);
    }

    static Optional<String> getValue(Object obj, String field) {
        try {
            Field fld = obj.getClass().getDeclaredField(field);
            return Optional.of(String.valueOf(fld.get(obj)));
        } catch (NoSuchFieldException _) {
            return Optional.empty();
        } catch (IllegalAccessException e) {
             e.printStackTrace();
             return Optional.empty();
        }
    }
}
