package task8;

import java.util.ArrayList;
import java.util.List;

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

    void draw() {
        System.out.println("Рисуется фигура");
    }
}

class Line extends Figure {
    int length;

    public Line(Cords coords, int width, String color, int length) {
        super(coords, width, color);
        this.length = length;
    }

    void draw() {
        System.out.println("Рисуется линия");
    }
}

class Rect extends Figure {
    int height;

    public Rect(Cords coords, int width, String color, int height) {
        super(coords, width, color);
        this.height = height;
    }

    void draw() {
        System.out.println("Рисуется прямоугольник");
    }
}

class Ellipse extends Figure {
    double radius;

    public Ellipse(Cords coords, int width, String color, double radius) {
        super(coords, width, color);
        this.radius = radius;
    }

    void draw() {
        System.out.println("Рисуется эллипс");
    }
}

class Triangle extends Figure {
    public Triangle(Cords coords, int width, String color) {
        super(coords, width, color);
    }

    void draw() {
        System.out.println("Рисуется треугольник");
    }
}

public class Task8 {
    static void main() {
        List<Figure> figures = new ArrayList<>();

        figures.add(new Line(new Cords(8, 9), 10, "Синий", 25));
        figures.add(new Rect(new Cords(2, 2), 5, "Красный", 10));
        figures.add(new Ellipse(new Cords(1, 1), 7, "Фиолетовый <3", 11));
        figures.add(new Triangle(new Cords(4, 7), 9, "Розовый"));

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
