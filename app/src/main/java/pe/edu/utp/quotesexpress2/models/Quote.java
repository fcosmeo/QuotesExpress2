package pe.edu.utp.quotesexpress2.models;

/**
 * Created by GrupoUTP on 17/09/2016.
 */
public class Quote {
    private String phrase;
    private String author;
    private String pictureUri;

    public Quote(String phrase, String author, String pictureUri) {
        this.phrase = phrase;
        this.author = author;
        this.pictureUri = pictureUri;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPictureUri() {
        return pictureUri;
    }

    public void setPictureUri(String pictureUri) {
        this.pictureUri = pictureUri;
    }
}
