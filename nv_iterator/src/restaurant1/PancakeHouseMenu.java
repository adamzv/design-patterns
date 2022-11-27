package restaurant1;

import java.util.ArrayList;

public class PancakeHouseMenu {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("G","ggg",true, 2.99);
        addItem("H","hhh",false, 2.99);
        addItem("I","iii", true, 3.49);
        addItem("J", "jjj", true, 3.59);
    }

    public final void addItem(String name, String description,
            boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
