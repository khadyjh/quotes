package quotes;

import com.google.gson.annotations.SerializedName;

public class Quot extends QuotAPI {
//    @SerializedName("quoteAuthor")
    private String author;
//    @SerializedName("quoteText")
    private String text;


    public Quot(String author, String text) {
        super(author,text);
        this.author = author;
        this.text = text;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
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
