package restaurant2;

public class DinerMenu {

    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("A", "aaa", true, 2.99);
        addItem("B", "bbb", false, 2.99);
        addItem("C", "ccc", false, 3.29);
        addItem("D", "ddd", false, 3.05);
        addItem("E", "eee", true, 3.99);
        addItem("F", "fff", true, 3.89);
    }

    public final void addItem(String name, String description,
            boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    // kazda "Menu" trieda ma metodu, ktorej zavolanim moze klient
    // ziskat iterator (objekt, ktory mu sprostredkuje sekvencny pohyb po prvkoch
    // kolekcie)
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
//  tuto metodu uz nepotrebujeme, ani ju nechceme poskytovat, pretoze
//  nou prezradzeme implementaciu
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
}
