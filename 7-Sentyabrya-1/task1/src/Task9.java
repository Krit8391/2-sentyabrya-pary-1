import java.util.LinkedHashMap;
import java.util.Map;

class MediaPlayer {
    Map<String, String> files = new LinkedHashMap<>();

    public MediaPlayer() {
        files.put("filename", "неизвестно");
    }

    void open(String file) {
        files.put("filename", file);
    }

    void play() {
        System.out.println("Воспроизведение " + files.get("filename"));
    }
}

public class Task9 {
    static void main() {
        MediaPlayer media1 = new MediaPlayer();
        MediaPlayer media2 = new MediaPlayer();

        media1.open("filemedia1");
        media2.open("filemedia2");

        media1.play();
        media2.play();
    }
}
