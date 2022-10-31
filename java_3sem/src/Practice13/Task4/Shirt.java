package Practice13.Task4;

import java.util.StringTokenizer;

public class Shirt {
    private String s;
    private String title;
    private String color;
    private String size;

    public void setInfo(String s) {
        StringTokenizer parts = new StringTokenizer(s, ",");
        this.s = parts.nextToken();
        this.title = parts.nextToken();
        this.color = parts.nextToken();
        this.size = parts.nextToken();
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "s='" + s + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
