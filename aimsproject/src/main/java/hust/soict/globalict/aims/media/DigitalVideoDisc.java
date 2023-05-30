package hust.soict.globalict.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    public DigitalVideoDisc(String title){
        super(title);
    }
    public DigitalVideoDisc(String title, String category,String director, int length,float cost){
        super(title, category, director , length,cost);
    }
    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
    }
    public String toString(){
        String tmp="DVD - "+this.title;
        if(this.category!=null)tmp+=" - " + category;
        if(this.director!=null)tmp+=" - " + director;
        if(this.length!=0)tmp+=" - " + String.valueOf(length);
        if(this.cost != 0.0f)tmp+=": "+String.valueOf(cost)+" $";
        return tmp;
    }
    public void play() { 

        System.out.println("Playing DVD: " + this.getTitle()); 
        
        System.out.println("DVD length: " + this.length); 
        
    }   
}
    
    