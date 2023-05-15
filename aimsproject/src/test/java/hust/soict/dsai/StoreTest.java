package hust.soict.dsai;
public class StoreTest {
    public static void main(String[] args) {
        Store aStore= new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Alters", 87, 19.95f);
        aStore.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        aStore.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","animation", 18.99f);
        aStore.addDVD(dvd3);
        aStore.printStore();
        aStore.removeDVD(dvd3);
        aStore.printStore();
    }
}
