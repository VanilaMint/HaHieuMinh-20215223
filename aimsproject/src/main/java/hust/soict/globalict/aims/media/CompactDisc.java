package hust.soict.globalict.aims.media;
import java.util.*;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        this.artist = director;
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title) {
        super(title);
    }

    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track){
        for(Track tmp : tracks){
            if(tmp.equals(track)){
                System.out.println("That track is already added");
                return;
            }
        }
        tracks.add(track);
        //System.out.println("Track is added");
        return;
    }
    public void removeTrack(Track track){
        if(!tracks.contains(track)){
            System.out.println("Track is not found");
            return;
        }
        tracks.remove(track);
        System.out.println("Removed track");
        return;
    }
    public int getLength(){
        for(Track tmp: tracks){
            this.length+= tmp.getLength();
        }
        return this.length;
    }
    public void play(){
        System.out.println("Playing "+ this.title + " by "+ this.artist);
        for(Track tmp : tracks){
            tmp.play();
        }
        return;
    }
    public String toString(){
        String tmp="CD - "+this.title;
        if(this.category!=null)tmp+=" - " + category;
        if(this.artist!=null)tmp+=" - " + artist;
        if(this.length!=0)tmp+=" - " + String.valueOf(length);
        if(this.cost != 0.0f)tmp+=": "+String.valueOf(cost)+" $";
        return tmp;
    }
}
