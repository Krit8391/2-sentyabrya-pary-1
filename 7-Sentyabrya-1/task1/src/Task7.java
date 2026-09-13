import java.util.LinkedHashMap;
import java.util.Map;

record Cords(int x, int y) {

}

class Figure {
    static String typeFig = "ellipse";
    static String color = "red";


    Map<String, Object> attrs = new LinkedHashMap<>();

    public Figure() {

    }
}

public class Task7 {
    static void main() {
        Figure fig1 = new Figure();
        Cords startPt = new Cords(10, 5);
        Cords endPt = new Cords(100, 20);

        fig1.attrs.put("start_pt", startPt);
        fig1.attrs.put("end_pt", endPt);
        fig1.attrs.put("color", "blue");
        printKEys(fig1.attrs);
        fig1.attrs.remove("color");
        printKEys(fig1.attrs);

    }

    static void printKEys(Map<String, Object> map){
        String result = map.keySet().stream()
                .reduce((k1 , k2) -> k1 + " " + k2)
                .orElse("");
        System.out.println(result);
    }
}
