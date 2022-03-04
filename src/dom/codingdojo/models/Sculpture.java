package dom.codingdojo.models;
import dom.codingdojo.abstracts.Art;

public class Sculpture extends Art {

    private final String material;

    public Sculpture(String Title, String Artist, String Description,String material) {
        super(Title, Artist, Description);
        this.material = material;
        addArt(this);
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    @Override
    public void WatchArt() {
        System.out.println("Watching a sculpture");
        System.out.println("Title: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("Description: " + getDescription());
        System.out.println("Material: " +  getMaterial());
        System.out.println("");
    }
}
