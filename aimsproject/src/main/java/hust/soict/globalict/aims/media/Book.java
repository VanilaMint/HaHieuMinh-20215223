package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.*;
public class Book{
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();
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