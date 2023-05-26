package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.*;
public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title) {
        super(title);
    }
    public void addAuthor(String name){
        authors.remove(name);
        authors.add(name);
        return;
    }
    public void removeAuthor(String name){
        authors.remove(name);
        return;
    }

}