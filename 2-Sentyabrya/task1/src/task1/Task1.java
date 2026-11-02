package task1;

import java.util.List;

class Cat {
    String breed;
    String name;
    int age;

    public Cat(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
}

public class Task1 {
    static void main() {
        Cat cat1 = new Cat("Сиамский", "Барск", 7);
        Cat cat2 = new Cat("Британский", "Сема", 2);
        Cat cat3 = new Cat("Сфинкс", "Виталя", 12);

        for (Cat cat : List.of(cat1, cat2, cat3)) {
            System.out.println("Порода: " + cat.breed + ", Имя: " + cat.name + ", Возраст: " + cat.age);
        }
    }
}
