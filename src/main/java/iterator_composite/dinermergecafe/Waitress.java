package iterator_composite.dinermergecafe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nghiapv on 11/03/2017.
 */
public class Waitress {
//    Menu pancakeHouseMenu;
    Menu dinerMenu;

//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    public Waitress(Menu dinerMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
//        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
//        System.out.println("Pancake Menu: ");
//        printMenu(pancakeIterator);
        System.out.println("Diner Menu: ");
        printMenu(dinerIterator);

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
