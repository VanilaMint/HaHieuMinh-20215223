package hust.soict.globalict.aims.media;

public class Track implements Playable{
    private String title;
    private int length;
    
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Track))return false;
        Track tmp = (Track) obj;
        if(this.title.equals(tmp.title)&&this.length==tmp.length)return true;
        return false;
    }
    public void play() { 
        
        System.out.println("Playing DVD: " + this.title); 
        
        System.out.println("DVD length: " + this.length); 
        
    }   

}
