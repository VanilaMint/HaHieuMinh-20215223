package hust.soict.globalict.aims.media;
public class DigitalVideoDisc extends Disc{
    private static int nbDigitalVideoDiscs = 0;
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
    public DigitalVideoDisc(String title){
        super(title);
        updateid();
    }
    public DigitalVideoDisc(String title, String category,String director, int length,float cost){
        super(title, category, director , length,cost);
        updateid();
    }
    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
        updateid();
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
    
    