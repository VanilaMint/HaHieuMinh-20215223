package hust.soict.globalict.aims.media;
public class DigitalVideoDisc extends Media{
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;
    public int getId() {
        return id;
    }
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
    public String toString(){
        String tmp=this.title;
        if(this.category!=null)tmp+=" - " + category;
        if(this.director!=null)tmp+=" - " + director;
        if(this.length!=0)tmp+=" - " + String.valueOf(length);
        if(this.cost != 0.0f)tmp+=": "+String.valueOf(cost)+" $";
        return tmp;
    }
}
    
    