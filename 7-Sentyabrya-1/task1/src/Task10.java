import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Graph {
    static final int[] LIMIT_Y = { 0, 10 };

    List<Integer> data = new ArrayList<>();

    void setData(List<Integer> data) {
        this.data = new ArrayList<>(data);

    }

    void draw() {
        String result = data.stream()
                .filter(x -> x >= LIMIT_Y[0] && x <= LIMIT_Y[1])
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}

public class Task10 {
    static void main() {
        Graph graph1 = new Graph();
        graph1.setData(List.of(10, -5, 100, 20, 0, 80, 45, 2, 5, 7));
        graph1.draw();
    }
}
