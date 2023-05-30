package hust.soict.globalict.aims;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class toStringtest {
    public static void main(String[] args) {
        List<Media> medialist = new ArrayList<Media>();
        Book book = new Book("random book title","Random book catgory", 5f);
        DigitalVideoDisc dvd = new  DigitalVideoDisc("The Lion King","Animation","Roger Alters", 87, 19.95f);
        CompactDisc cd = new CompactDisc("music disc", "pop", "random artist", 89, 20.00f);
        medialist.add(book);
        medialist.add(dvd);
        medialist.add(cd);
        for(Media tmp: medialist){
            System.out.println(tmp.toString());
        }
    }
}
