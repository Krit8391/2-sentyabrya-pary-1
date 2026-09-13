import java.lang.reflect.Field;

class Car {
    String model;
    String color;
    String number;

    public Car(){

    }
}

public class Task3 {
    static void main() {
        Car car = new Car();
        // Рефлексия - Самоисследование и самоизменение во время работы программы
        // getDeclaredField - Возвращает описание поля в объекте(Не чувствителен к модификатору)
        try {
            Field modelField = car.getClass().getDeclaredField("model");
            Field colorField = car.getClass().getDeclaredField("color");
            Field numberField = car.getClass().getDeclaredField("number");

            modelField.set(car, "Тойота");
            colorField.set(car, "Розовый");
            numberField.set(car, "П111УУ77");
            // String.valueOf - Попытаться превратить в строку
            String color = String.valueOf(colorField.get(car));
            System.out.println(color);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
