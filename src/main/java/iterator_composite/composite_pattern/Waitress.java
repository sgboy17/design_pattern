package iterator_composite.composite_pattern;

import java.util.Iterator;

/**
 * Created by nghiapv on 07/04/2017.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarian(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("---Vegetarian menu---");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){ }
        }

    }

}
