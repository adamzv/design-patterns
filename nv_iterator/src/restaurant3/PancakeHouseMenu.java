package restaurant3;

import java.util.Iterator;
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

    // tu nastala zmena, vyuzijeme, ze ArrayList uz ma metodu iterator()
    // (nepouzijeme triedu PancakeHouseMenuIterator, netreba)
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
