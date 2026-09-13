class Goods {
    String title;
    int weight;
    String tp;
    int price;
    int inflation;

    public Goods(String title, int weight, String tp, int price, int inflation) {
        this.title = title;
        this.weight = weight;
        this.tp = tp;
        this.price = price;
        this.inflation = inflation;
    }
}


public class Task2 {
    static void main(String[] args) {
        Goods good = new Goods(
                "Мороженое",
                154,
                "Еда",
                1024,
                100
        );

        good.price = 2048;
    }
}
