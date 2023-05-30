package hust.soict.globalict.aims;

import java.util.Comparator;

import hust.soict.globalict.aims.media.Media;

public class SortMediaByTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int costCompare = media1.getTitle().compareTo(media2.getTitle());
        if (costCompare != 0) {
            return costCompare;
        }
        return Double.compare(media1.getCost(), media2.getCost());
    }

}