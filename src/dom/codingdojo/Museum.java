package dom.codingdojo;
import dom.codingdojo.models.Paint;
import dom.codingdojo.models.Sculpture;

public class Museum {
    public static void main(String[] args) {
        // Create 3 instances of paints and 2 instances of sculptures
        Paint paint = new Paint("The Starry Night", "Vincent Van Gogh", "19th century\", \"The Starry Night is an oil painting of the Cézanne ceiling by the French artist Vincent van Gogh. The painting is in oil format and is finished in June 1889. It is sold at the Louvre in Paris, France, and is part of the collection of Vincent van Gogh's paintings.","Oil on Canvas");
        Paint paint2 = new Paint("The Kiss", "Vincent Van Gogh", "19th century\", \"The Kiss is an oil painting of the Cézanne ceiling by the French artist Vincent van Gogh. The painting is in oil format and is finished in June 1889. It is sold at the Louvre in Paris, France, and is part of the collection of Vincent van Gogh's paintings.","Oil on Canvas");
        Paint paint3 = new Paint("The Night Watch", "Vincent Van Gogh", "19th century\", \"The Night Watch is an oil painting of the Cézanne ceiling by the French artist Vincent van Gogh. The painting is in oil format and is finished in June 1889. It is sold at the Louvre in Paris, France, and is part of the collection of Vincent van Gogh's paintings.","Oil on Canvas");


        Sculpture sculpture = new Sculpture("David", "Michelangelo", "15th century\", \"David is a sculpture of Michelangelo's David, a famous Renaissance sculptor and painter. The sculpture is located in the Louvre in Paris, France, and is part of the collection of Michelangelo's sculptures.","Bronze");
        Sculpture sculpture2 = new Sculpture("Last Supper", "Michelangelo", "15th century\", \"Last Supper is a sculpture of Michelangelo's Last Supper, a famous Renaissance sculptor and painter. The sculpture is located in the Louvre in Paris, France, and is part of the collection of Michelangelo's sculptures.","Bronze");

        paint.WatchArt();
        paint2.WatchArt();
        paint3.WatchArt();
        sculpture.WatchArt();
        sculpture2.WatchArt();
    }
}
