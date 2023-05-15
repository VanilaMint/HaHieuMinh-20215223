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
    public String addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        if(qtyOrdered+dvdList.length>20) return "Your cart can't add this much disc";
        for(int i=0;i<dvdList.length;i++){
            qtyOrdered++;
            itemOrdered[qtyOrdered-1]=dvdList[i];
            if(qtyOrdered==20)return "Your cart is now full";
        }
        return "Your disc has been added to cart";
    }
    public String addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if(qtyOrdered+2>20) return "Your cart can't add this much disc";
        for(int i=0;i<2;i++){
            qtyOrdered++;
            itemOrdered[qtyOrdered-1]=i==0?dvd1:dvd2;
            if(qtyOrdered==20)return "Your cart is now full";
        }
        return "Your disc has been added to cart";
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
    public void printCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i = 0; i<qtyOrdered; i++){
            System.out.println(String.valueOf(i+1)+". DVD - "+itemOrdered[i].toString());
        }
        System.out.println("Total cost: "+String.valueOf(totalCost()));
        System.out.println("***************************************************");
    }
    public void search(int inp){
        for(int i=0 ; i<qtyOrdered; i++){
            if(inp == itemOrdered[i].getId()){
                System.out.println("DVD - "+itemOrdered[i].toString());
                return;
            }
        }
        System.out.println("No disc matching this id was found");
    }
    public void search(String inp){
        for(int i=0 ; i<qtyOrdered; i++){
            if(itemOrdered[i].getTitle() == inp){
                System.out.println("DVD - "+itemOrdered[i].toString());
                return;
            }
        }
        System.out.println("No disc matching this title was found");
    }
}
