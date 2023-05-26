package hust.soict.globalict.aims.media;

public class Disc extends Media{
    protected int length;
    protected String director;
    public Disc(String title, String category, String director, int length,float cost) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
    public Disc(String title) {
        super(title);
    }
    public Disc(String title, String category,float cost) {
        super(title, category, cost);
    }
    
}
