package ooplab;
public class DigitalVideoDisc {
    private String titles;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle() {
        return titles;
    }
    public void setTitle(String titles) {
        this.titles = titles;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public DigitalVideoDisc(String titles) {
        this.titles = titles;
    }
    public DigitalVideoDisc(String titles, String category, float cost) {
        this.titles = titles;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String titles, String category, String director, int length, float cost) {
        this.titles = titles;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public DigitalVideoDisc(String titles, String category, String director, float cost) {
        this.titles = titles;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    
}
    
    