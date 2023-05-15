package ooplab;

public class Cart {
    public static final int MAX_NUMBERS_ORDERS=20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERS];
    private int qtyOrdered = 0;
    public String addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered<20){
            qtyOrdered++;
            itemOrdered[qtyOrdered-1]=disc;
            if(qtyOrdered==20)return "Your cart is now full";
            else return "A disc has been added";
        }
        return "Your cart is already full";
    }
    public String removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i=0;i<qtyOrdered;i++){
            if(itemOrdered[i].equals(disc)){
                for(int j=i+1;j<qtyOrdered;j++){
                    DigitalVideoDisc tmp=itemOrdered[i-1];
                    itemOrdered[i-1]=itemOrdered[i];
                    itemOrdered[i]=tmp;
                }
                qtyOrdered--;
                return "A disc has been removed";
            }
        }
        return "That disc is not in your cart";
    }
    public float totalCost(){
        float total=0;
        for(int i=0;i<qtyOrdered;i++){
            total+=itemOrdered[i].getCost();
        }
        return total;
    }
}
