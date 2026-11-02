package task9;

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

    Cords getCoords() {
        return coords;
    }

    void setCoords(Cords coords) {
        this.coords = coords;
    }

    double calculateArea() {
        return 0;
    }
}

class Circle extends Figure {
    double radius;

    public Circle(Cords coords, int width, String color, double radius) {
        super(coords, width, color);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square extends Figure {
    double side;

    public Square(Cords coords, int width, String color, double side) {
        super(coords, width, color);
        this.side = side;
    }

    double calculateArea() {
        return Math.pow(side, 2);
    }
}

public class Task9 {
    static void main() {
        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle(new Cords(1, 1), 10, "Красный", 5));
        figures.add(new Circle(new Cords(2, 5), 13, "Хакки", 8));
        figures.add(new Square(new Cords(5, 5), 2, "Синий", 4));
        figures.add(new Square(new Cords(1, 8), 3, "Фиолетовый", 7));
        figures.add(new Square(new Cords(6, 5), 6, "Серый", 10));

        for (Figure figure : figures) {
            System.out.println("Площадь: " + figure.calculateArea());
        }
    }
}
