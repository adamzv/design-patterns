package restaurant;

import java.util.Iterator;
import java.util.ArrayList;

// aj Menu je MenuComponent
// moze obsahovat dalsie objekty (je zlozeny)
public class Menu extends MenuComponent {

    private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // postupne prejdeme cely zoznam  tohto MenuComponent-u
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            // ak ide o MenuItem, vypise sa
            // ak ide o Menu, zavola sa rekurzivne znovu tato metoda
            // (zabezpeci sa tak vypisanie vnoreneho Menu)
            menuComponent.print();
        }
    }
}   