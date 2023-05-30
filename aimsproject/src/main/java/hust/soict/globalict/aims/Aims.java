package hust.soict.globalict.aims;

import java.util.Scanner;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Media;

public class Aims{
    private static Store store = new Store();
    private static Cart cart = new Cart();
    public static int showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    public static int storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media details");
		System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    public static int mediaDetailsMenu(boolean isDisc) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if(isDisc)System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        if(isDisc)System.out.println("Please choose a number: 0-1-2");
        else System.out.println("Please choose a number: 0-1");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    public static int updateStoreMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Remove media");
        System.out.println("2. Add media");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    public static String takeUser(){
        System.out.print("Input the name of the media: ");
        Scanner scanner = new Scanner(System.in);
        String mediaInputName = scanner.nextLine().trim();
         
        return mediaInputName;
    }
    public static Media titleCheck(String mediaInputName){
        Media media=store.find(mediaInputName);
        if(media==null){
            System.out.println("Media not found");
            return null;
        }
        else return media;
    }
    public static Media takeUserTitle(){
        return titleCheck(takeUser());
    }
    public static int cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static void main(String[] args) {
        int userMenuInput=-1;
        while(userMenuInput!=0){
            userMenuInput=showMenu();
            if(userMenuInput==1){
                store.printStore();
                int userStoreInput = -1;
                while(userStoreInput!=0){
                    userStoreInput=storeMenu();
                    if(userStoreInput == 1){
                        Media media=takeUserTitle();
                        if(media==null){
                            continue;
                        }
                        else{
                            media.toString();
                            int userMediaInput=-1;
                            while(userMediaInput!=0){
                                userMediaInput=mediaDetailsMenu(media instanceof Disc);
                                if(userMediaInput==1){
                                    cart.addMedia(media);
                                }
                                if(userMediaInput==2){
                                    if(media instanceof DigitalVideoDisc){
                                        DigitalVideoDisc tmp = (DigitalVideoDisc)media;
                                        tmp.play();
                                    }
                                    if(media instanceof CompactDisc){
                                        CompactDisc tmp = (CompactDisc)media;
                                        tmp.play();
                                    }
                                }
                                if(userMediaInput==0)break;

                            }
                        }
                    }
                    if(userStoreInput==2){
                        Media media=takeUserTitle();
                        cart.addMedia(media);
                        System.out.println("There are currently "+ String.valueOf(cart.getSize())+" items in cart");
                    }
                    if(userStoreInput==3){
                        Media media=takeUserTitle();
                        if(media instanceof DigitalVideoDisc){
                            DigitalVideoDisc tmp = (DigitalVideoDisc)media;
                            tmp.play();
                        }
                        if(media instanceof CompactDisc){
                            CompactDisc tmp = (CompactDisc)media;
                            tmp.play();
                        }
                        if(media instanceof Book)System.out.println("Media can't be played");
                    }
                    if(userStoreInput==4){
                        cart.printCart();
                    }
                    if(userStoreInput==0)break;
                }
            }
            if(userMenuInput==2){
                int userUpdateStoreInput=-1;
                while(userUpdateStoreInput!=0){
                    userUpdateStoreInput=updateStoreMenu();
                    if(userUpdateStoreInput==1){
                        Media media=takeUserTitle();
                        if(media!=null)store.removeMedia(media);
                    }
                    if(userUpdateStoreInput==2){
                        String title = takeUser();
                        store.addMedia(title);
                    }
                    if(userUpdateStoreInput==0)break;
                }
            }
            if(userMenuInput==3){
                cart.printCart();
                int cartMenuInput=-1;
                while(cartMenuInput!=0){
                    cartMenuInput=cartMenu();
                    if(cartMenuInput==1){
                        System.out.println("Options: ");
		                System.out.println("--------------------------------");
		                System.out.println("1. Filter medias by Id");
		                System.out.println("2. Filter medias by title");
                        System.out.println("0. Back");
                        System.out.println("--------------------------------");
		                System.out.println("Please choose a number: 0-1-2");
                        Scanner scanner = new Scanner(System.in);
                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        if(choice == 1){
                            System.out.println("Input Id:");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            Media media=cart.search(id);
                            if(media!=null)System.out.println(media.toString());
                            else System.out.println("Media not found in cart");
                        }
                        if(choice == 2){
                            System.out.println("Input title:");
                            String title = scanner.nextLine().trim();
                            Media media=cart.search(title);
                            if(media!=null)System.out.println(media.toString());
                            else System.out.println("Media not found in cart");
                        } 
                    }
                    if(cartMenuInput==2){
                        System.out.println("Options: ");
		                System.out.println("--------------------------------");
		                System.out.println("1. Sort medias by Cost");
		                System.out.println("2. Sort medias by title");
                        System.out.println("0. Back");
                        System.out.println("--------------------------------");
		                System.out.println("Please choose a number: 0-1-2");
                        Scanner scanner = new Scanner(System.in);
                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        if(choice == 1){
                            cart.sortByCost();
                            cart.printCart();
                        }
                        if(choice == 2){
                            cart.sortByTitle();
                            cart.printCart();
                        }
                    }
                    if(cartMenuInput==3){
                        String title = takeUser();
                        Media media= cart.search(title);
                        cart.removeMedia(media);
                    }
                    if(cartMenuInput==4){
                        String title = takeUser();
                        Media media = cart.search(title);
                        if(media instanceof DigitalVideoDisc){
                            DigitalVideoDisc tmp = (DigitalVideoDisc)media;
                            tmp.play();
                        }
                        if(media instanceof CompactDisc){
                            CompactDisc tmp = (CompactDisc)media;
                            tmp.play();
                        }
                        if(media instanceof Book)System.out.println("Media can't be played");
                    }
                    if(cartMenuInput==5){
                        System.out.println("Order is placed");
                        cart=new Cart();
                    }
                    if(cartMenuInput==0)break;
                }
            }
            if(userMenuInput==0){
                System.out.println("Good bye!");
                break;
            }
        }
    }
}