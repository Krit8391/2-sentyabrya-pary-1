import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

record Data(StreamData data, boolean result) {

}

class StreamData {
    Map<String, String> values = new LinkedHashMap<>();

    boolean create(String[] fields, List<String> values) {
        if (fields.length != values.size()) {
            return false;
        }

        for (int i = 0; i < fields.length; i++) {
            this.values.put(fields[i], values.get(i));
        }
        return true;

    }
}

class StreamReader {
    static final String[] FIELDS = {"id", "title", "pages"};

    Data readLines() {
        List<String> values = new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .map(String::strip)
                .toList();

        StreamData sd = new StreamData();
        boolean res = sd.create(FIELDS, values);
        return new Data(sd, res);
    }
}

public class Task11 {
    static void main() {
        StreamReader sr = new StreamReader();

        Data res = sr.readLines();
        System.out.println(res);

    }
}
