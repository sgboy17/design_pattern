package iterator_composite.composite_pattern;

/**
 * Created by nghiapv on 07/04/2017.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent dissertMenu = new Menu("DISSERT MENU", "Dissert");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Cafe");
        MenuComponent allMenu = new Menu("ALL MENU", "All");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        dinerMenu.add(new MenuItem("Apple Pie", "Apple Pie cake", 1.59, true));

        dinerMenu.add(dissertMenu);
        dissertMenu.add(new MenuItem("Meat Pie", "Meat Pie cake", 2.59, false));
        dissertMenu.add(new MenuItem("Lemon Pie", "Lemon Pie cake", 1.59, true));

        Waitress waitress = new Waitress(allMenu);
        waitress.printVegetarian();

    }



}
