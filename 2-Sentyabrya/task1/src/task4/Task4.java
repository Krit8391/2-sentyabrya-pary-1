package task4;

import java.util.List;

class Graph {
    int x;
    int y;
    double scale;

    public Graph(int x, int y, double scale) {
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    void move(int dx, int dy) {
        x = dx;
        y = dy;
    }

    void changeScale(double factor) {
        scale = factor;
    }

    public String toString() {
        return "X: " + x + ", Y: " + y + ", Scale: " + scale;
    }
}

public class Task4 {
    static void main() {
        Graph graph1 = new Graph(1, 1, 1.5);
        Graph graph2 = new Graph(2, 3, 1.1);
        Graph graph3 = new Graph(5, 9, 1.0);

        graph1.move(5, 7);
        graph2.changeScale(1.5);

        for (Graph graph : List.of(graph1, graph2, graph3)) {
            System.out.println(graph);
        }
    }
}
