class TravelBlog {
    static int totalBlogs = 0;

    String name;
    int days;

    public TravelBlog(String name, int days) {
        this.name = name;
        this.days = days;
    }
}

public class Task6 {
    static void main() {
        TravelBlog tb1 = new TravelBlog("Франция", 6);
        TravelBlog.totalBlogs += 1;

        TravelBlog tb2 = new TravelBlog("Италия", 5);
        TravelBlog.totalBlogs += 1;
    }
}
