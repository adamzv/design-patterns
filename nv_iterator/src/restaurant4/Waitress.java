package restaurant4;

import java.util.Iterator;

public class Waitress {

    // casnicka ma dva "menu" objekty
    // nemusi vediet, ake konkretne, staci, ze ich vie vytlacit
    private Menu pancakeHouseMenu; // ArrayList
    private Menu dinerMenu; // pole

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIt = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIt = dinerMenu.createIterator();

        System.out.println("MENU\n----BREAKFAST");
        printMenu(pancakeIt);
        System.out.println("\n----LUNCH");
        printMenu(dinerIt);
    }

    // jeden cyklus!, polymorfizmus! (jedna metoda je pouzitelna pre lubovolnu kolekciu
    // menu poloziek, ktora implementuje rozhranie Iterator)
    private void printMenu(Iterator<MenuItem> it) {
        while (it.hasNext()) {
            MenuItem menuItem = it.next();
            System.out.println(menuItem);
        }
    }
}
