package restaurant1;

import java.util.ArrayList;

// casnicka ma vediet zobrazit menu restauracie
public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu; // ArrayList
    private DinerMenu dinerMenu; // pole

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // zobrazenie menu
    public void printMenu() {
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        // jeden cyklus na prechod ArrayList-om
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem);
        }

        // jeden cyklus na prechod polom
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem);
        }
    }
}
