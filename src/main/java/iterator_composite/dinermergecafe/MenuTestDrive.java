package iterator_composite.dinermergecafe;

/**
 * Created by nghiapv on 11/03/2017.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(dinerMenu);

        waitress.printMenu();

    }


}
