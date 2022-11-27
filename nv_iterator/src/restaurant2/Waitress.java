package restaurant2;

public class Waitress {

    // TO DO: casnicka je este stale naprogramovana s pouzitim konkretnych tried
    //        (vylepsime v dalsej verzii)
    private PancakeHouseMenu pancakeHouseMenu; // ArrayList
    private DinerMenu dinerMenu; // pole

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
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
