package iterator_composite.dinermerge;

/**
 * Created by nghiapv on 11/03/2017.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        Iterator iteratorPancake = pancakeHouseMenu.createIterator();
//
        DinerMenu dinerMenu = new DinerMenu();
//        Iterator iteratorDiner = dinerMenu.createIterator();
//
////        for (MenuItem menuItem: pancakeHouseMenuItems){
////            System.out.println("name: " + menuItem.getName());
////            System.out.println("description: " + menuItem.getDescription());
////            System.out.println("vegetarian: " + (menuItem.isVegetarian()?"yes":"no"));
////            System.out.println("price: " + menuItem.getPrice());
////        }
//        while (iteratorPancake.hasNext()){
//            MenuItem menuItem = (MenuItem)iteratorPancake.next();
//            System.out.println("name: " + menuItem.getName());
//            System.out.println("description: " + menuItem.getDescription());
//            System.out.println("vegetarian: " + (menuItem.isVegetarian()?"yes":"no"));
//            System.out.println("price: " + menuItem.getPrice());
//        }
//
////        for (MenuItem menuItem: dinerMenuItems
////                ) {
////            System.out.println("name: " + menuItem.getName());
////            System.out.println("description: " + menuItem.getDescription());
////            System.out.println("vegetarian: " + (menuItem.isVegetarian()?"yes":"no"));
////            System.out.println("price: " + menuItem.getPrice());
////        }
//        while (iteratorDiner.hasNext()){
//            MenuItem menuItem = (MenuItem)iteratorDiner.next();
//            System.out.println("name: " + menuItem.getName());
//            System.out.println("description: " + menuItem.getDescription());
//            System.out.println("vegetarian: " + (menuItem.isVegetarian()?"yes":"no"));
//            System.out.println("price: " + menuItem.getPrice());
//        }
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        waitress.printMenu();



    }


}
