package iterator_composite.composite_pattern;

import java.util.Iterator;

/**
 * Created by nghiapv on 07/04/2017.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();    }

    public void print(){
        System.out.print(" " + getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(" ," + getPrice());
        System.out.print("  __ " + getDescription());
    }
}
