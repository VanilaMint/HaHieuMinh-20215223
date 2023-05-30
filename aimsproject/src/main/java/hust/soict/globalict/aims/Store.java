package hust.soict.globalict.aims;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;

public class Store {
    private ArrayList<Media> itemInStore = new ArrayList<Media>(); 
    public void addMedia(String title){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add DVD");
        System.out.println("2. Add Book");
        System.out.println("3. Add Cd");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice==1){
            scanner = new Scanner(System.in);
            System.out.print("Enter the cost: ");
            float cost = scanner.nextFloat();
            scanner.nextLine();
            System.out.print("Enter the category: ");
            String category = scanner.nextLine().trim();

            System.out.print("Enter the director: ");
            String director = scanner.nextLine().trim();

            System.out.print("Enter the length in minutes: ");
            int length = scanner.nextInt();
            scanner.nextLine();
            DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
            this.itemInStore.add(dvd);
        }
        if(choice==2){
            scanner = new Scanner(System.in);
            System.out.print("Enter the cost: ");
            float cost = scanner.nextFloat();
            scanner.nextLine();
            System.out.print("Enter the category: ");
            String category = scanner.nextLine().trim();
            Book book = new Book(title, category, cost);
            System.out.println("Enter list of authors(have a space in between authors):");
            String input=scanner.nextLine().trim();
            String[] authors= input.split("\\s+");
            for (String author : authors) {
                book.addAuthor(author);
            }
            this.itemInStore.add(book);
        }
        if(choice == 3 ){
            scanner = new Scanner(System.in);
            System.out.print("Enter the cost: ");
            float cost = scanner.nextFloat();
            scanner.nextLine();
            System.out.print("Enter the category: ");
            String category = scanner.nextLine().trim();

            System.out.print("Enter the director: ");
            String director = scanner.nextLine().trim();

            System.out.print("Enter the length in minutes: ");
            int length = scanner.nextInt();
            scanner.nextLine();
            CompactDisc cd = new CompactDisc(title, category, director, length, cost);
            System.out.print("Enter the number of tracks for the CD: ");
            int i = scanner.nextInt();
            for(int j=1;j<=i;j++){
                System.out.print("Enter track"+String.valueOf(j)+"'s title: ");
                String tracktitle= scanner.next().trim();
                System.out.print("Enter track"+String.valueOf(j)+"'s length: ");
                int tracklength= scanner.nextInt();
                scanner.nextLine();
                cd.addTrack(new Track(tracktitle,tracklength));
            }
            this.itemInStore.add(cd);
        }
        return;
    }
    public void removeMedia(Media tmp){
        this.itemInStore.remove(tmp);
        System.out.println("Media has been removed");
        return;
    }
    public void printStore(){
        System.out.println("***********************CART***********************");
        System.out.println("Items in store:");
        int i=0;
        for(Media tmp: this.itemInStore){
            System.out.println(String.valueOf(i+1)+". "+tmp.toString());
            i++;
        }
        System.out.println("***************************************************");
    }
    public Media find(String name){
        for(Media tmp: itemInStore){
            if(tmp.getTitle().equals(name))return tmp;
        }
        return null;
    }
}
