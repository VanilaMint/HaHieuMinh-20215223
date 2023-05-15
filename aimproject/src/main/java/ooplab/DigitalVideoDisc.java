package ooplab;
public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle() {
        return title;
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
    private void updateid(){
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String titles) {
        updateid();
        this.title = titles;
    }
    public DigitalVideoDisc(String titles, String category, float cost) {
        updateid();
        this.title = titles;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String titles, String category, String director, int length, float cost) {
        updateid();
        this.title = titles;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public DigitalVideoDisc(String titles, String category, String director, float cost) {
        updateid();
        this.title = titles;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    
}
    
    