package dom.codingdojo.abstracts;
import java.util.ArrayList;

public abstract class Art {
    private String Title;
    private String Artist;
    private String Description;
    public static ArrayList<Art>  arraymuseum = new ArrayList<Art>();
    //constructor
    public Art(String Title, String Artist, String Description) {
        this.Title = Title;
        this.Artist = Artist;
        this.Description = Description;
    }

    //setters and getters
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public abstract void WatchArt();

    //add art to museum
    public static void addArt(Art art) {
        arraymuseum.add(art);
    }

    //get art from museum
    public static Art getArt(int index) {
        return arraymuseum.get(index);
    }

    //get art from museum
    public static ArrayList<Art> getArraymuseum() {
        return arraymuseum;
    }
}
