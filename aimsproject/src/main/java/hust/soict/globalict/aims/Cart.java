package hust.soict.globalict.aims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.globalict.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERS=20;
    private List<Media> itemsOrdered = new ArrayList<Media>(); 
    public void addMedia(Media tmp){
        if(this.itemsOrdered.size()==20){
            System.out.println("The cart is already full");
            return;
        }
        this.itemsOrdered.add(tmp);
        System.out.println("An item has been added to cart");
        return;
    }
    public void removeMedia(Media tmp){
        if(tmp == null){
            System.out.println("Item not found in cart");
            return;
        }
        this.itemsOrdered.remove(tmp);
        System.out.println("The item is no longer in the cart");
        return;
    }
    public float totalCost(){
        float total=0;
        for(Media tmp: this.itemsOrdered){
            total+=tmp.getCost();
        }
        return total;
    }
    public void printCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i=0;
        for(Media tmp: this.itemsOrdered){
            System.out.println(String.valueOf(i+1)+". "+tmp.toString());
            i++;
        }
        System.out.println("Total cost: "+String.valueOf(totalCost()));
        System.out.println("***************************************************");
    }
    public Media search(Media med){
        for(Media tmp : this.itemsOrdered){
            if(tmp.equals(med)){
                //System.out.println(tmp.toString());
                return tmp;
            }
        }
        //System.out.println("No item matching this title was found");
        return null;
    }
    public Media search(int id){
        for(Media tmp: this.itemsOrdered){
            if(tmp.getId()==id){
                //System.out.println(tmp.toString());
                return tmp;
            }
        }
        //System.out.println("No item matching this id was found");
        return null;
    }
    public Media search(String title){
        for(Media tmp: this.itemsOrdered){
            if(tmp.getTitle().compareTo(title)==0){
                //System.out.println(tmp.toString());
                return tmp;
            }
        }
        return null;
        //System.out.println("No item matching this title was found");
    }
    public void sortByCost(){
        SortMediaByCost costComparator = new SortMediaByCost();
        Collections.sort(this.itemsOrdered, costComparator);
        return;
    }
    public void sortByTitle(){
        Collections.sort(this.itemsOrdered,new SortMediaByTitle());
        return;
    }
    public int getSize(){
        return this.itemsOrdered.size();
    }
}
