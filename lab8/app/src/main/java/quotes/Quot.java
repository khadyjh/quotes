package quotes;

public class Quot {
    private String author;
    private String text;

    public Quot(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "quot{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
