package task3;

class Car {
    int engineTemperature = 20;

    void startEngine() {
        engineTemperature = 90;
        System.out.println("Двигатель прогрет :3");
    }

    void drive() {
        if (engineTemperature >= 90) {
            System.out.println("Поехали!");
        }
    }
}

public class Task3 {
    static void main() {
        Car car = new Car();

        System.out.println(car.engineTemperature); // Выведет, но так делать не принято ^^

        car.drive(); // Ничего не выведет

        car.startEngine();
        car.drive();
    }
}
