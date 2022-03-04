package dom.codingdojo.models;
import dom.codingdojo.abstracts.Art;

public class Paint extends Art {

    private final String paintType;

    //Constructor
    public Paint(String Title, String Artist, String Description, String paintType) {
        super(Title, Artist, Description);
        this.paintType = paintType;
        //add paint to museum
        addArt(this);
    }

    //Getters and Setters
    public String getPaintType() {
        return paintType;
    }

    @Override
    public void WatchArt() {
        System.out.println("Watching Paint");
        System.out.println("Title: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("Description: " + getDescription());
        System.out.println("Paint Type: " +  getPaintType());
        System.out.println("");
    }
}
