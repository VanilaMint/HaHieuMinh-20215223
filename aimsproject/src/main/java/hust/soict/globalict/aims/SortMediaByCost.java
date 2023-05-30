package hust.soict.globalict.aims;
import java.util.Comparator;

import hust.soict.globalict.aims.media.Media;

public class SortMediaByCost implements Comparator<Media> {
    public int compare(Media media1, Media media2) {
        int costCompare = Double.compare(media1.getCost(), media2.getCost());
        if (costCompare != 0) {
            return costCompare;
        }
        return media1.getTitle().compareTo(media2.getTitle());
    }
}