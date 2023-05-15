package ooplab;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[10000];
    private int qty=0;
    public void addDVD(DigitalVideoDisc disc){
        itemsInStore[qty] = disc;
        qty++;
    }
    public void removeDVD(DigitalVideoDisc disc){
        for(int i=0;i < qty ;i++){
           if(itemsInStore[i].equals(disc)){
                for(int j=i+1;j<qty;j++){
                    DigitalVideoDisc tmp=itemsInStore[i-1];
                    itemsInStore[i-1]=itemsInStore[i];
                    itemsInStore[i]=tmp;
                }
                qty--;
           }
        }
    }
}
