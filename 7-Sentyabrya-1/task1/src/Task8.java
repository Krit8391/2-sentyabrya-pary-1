import java.lang.reflect.Field;

class Person {
    String name;
    String job;
    String city;

    public Person(String name, String job, String city) {
        this.name = name;
        this.job = job;
        this.city = city;
    }


}

public class Task8 {
    static void main() {
        Person p1 = new Person("Сергей Балакирев", "Программист", "Москва");
        try {
            Field jobField = p1.getClass().getDeclaredField("job");
            System.out.println(true);
        } catch (NoSuchFieldException _){
            System.out.println(false);
        }
    }
}
