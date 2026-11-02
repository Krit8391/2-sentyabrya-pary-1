package task6;

record Cords(int x, int y) {

}

class Figure {
    Cords coords;
    int width;
    String color;

    public Figure(Cords coords, int width, String color) {
        this.coords = coords;
        this.width = width;
        this.color = color;
    }
}

class Line extends Figure {
    int length;

    public Line(Cords coords, int width, String color, int length) {
        super(coords, width, color);
        this.length = length;
    }
}

class Rect extends Figure {
    int height;

    public Rect(Cords coords, int width, String color, int height) {
        super(coords, width, color);
        this.height = height;
    }
}

class Ellipse extends Figure {
    double radius;

    public Ellipse(Cords coords, int width, String color, double radius) {
        super(coords, width, color);
        this.radius = radius;
    }
}

public class Task6 {
    static void main() {

    }
}
