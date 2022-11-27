package restaurant5;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    // casnicka si bude pamat vsekty "menu" objekty v jednom zozname
    private ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    // tu sa udialo nieco zaujimave, casnicka si vypyta v metode
    // printMenu() iterator a kazde z ulozenych menu vypise volanim
    // printMenu ( iterator ziskany od prislusnej kolekcie )
    public void printMenu() {
        Iterator<Menu> menuIt = menus.iterator();

        while (menuIt.hasNext()) {
            Menu menu = menuIt.next();
            printMenu(menu.createIterator());
        }
    }

    // tu sa nezmenilo nic
    private void printMenu(Iterator<MenuItem> it) {
        while (it.hasNext()) {
            MenuItem menuItem = it.next();
            System.out.println(menuItem);
        }
    }
}
