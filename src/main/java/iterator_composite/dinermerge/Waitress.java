package iterator_composite.dinermerge;

/**
 * Created by nghiapv on 11/03/2017.
 */
public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        dinerMenu = new DinerMenu();
        Iterator iteratorDiner = dinerMenu.createIterator();
        pancakeHouseMenu = new PancakeHouseMenu();
        Iterator iteratorPancakeHouse = pancakeHouseMenu.createIterator();
        System.out.println("Diner Menu");
        System.out.println("---------------");
        printMenu(iteratorDiner);
        System.out.println("PancakeHouse Menu");
        System.out.println("---------------");
        printMenu(iteratorPancakeHouse);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println("name: " + menuItem.getName());
            System.out.println("description: " + menuItem.getDescription());
            System.out.println("vegetarian: " + (menuItem.isVegetarian()?"yes":"no"));
            System.out.println("price: " + menuItem.getPrice());
        }

    }
}
