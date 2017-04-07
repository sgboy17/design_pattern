package iterator_composite.composite_pattern;

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
}
