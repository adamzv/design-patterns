package restaurant;

public class Test {

    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent coffeeMenu = new Menu("COFFEE MENU", "Stuff to go with your afternoon coffee");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        // ponuka nasej restauracie ma 3 menu
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // naplnime ich polozkami
        pancakeHouseMenu.add(new MenuItem("A", "aaa", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("B", "bbb", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("C", "ccc", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("D", "ddd", true, 3.59));
        dinerMenu.add(new MenuItem("E", "eee", true, 2.99));
        dinerMenu.add(new MenuItem("F", "fff", false, 2.99));
        dinerMenu.add(new MenuItem("G", "ggg", false, 3.29));
        dinerMenu.add(new MenuItem("H", "hhh", false, 3.05));
        dinerMenu.add(new MenuItem("I", "iii", true, 3.99));

        dinerMenu.add(new MenuItem("J", "jjj", true, 3.89));

        // dinerMenu bude okrem predoslych poloziek obsahovat aj dalsie vnorene
        // menu s ponukou dezertov
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("K", "kkk", true, 1.59));
        dessertMenu.add(new MenuItem("L", "lll", true, 1.99));
        dessertMenu.add(new MenuItem("M", "mmm", true, 1.89));

        cafeMenu.add(new MenuItem("N", "nnn", true, 3.99));
        cafeMenu.add(new MenuItem("O", "ooo", false, 3.69));
        cafeMenu.add(new MenuItem("P", "ppp", true, 4.29));

        cafeMenu.add(coffeeMenu);

        coffeeMenu.add(new MenuItem("R", "rrr", true, 1.59));
        coffeeMenu.add(new MenuItem("S", "sss", false, 0.69));
        coffeeMenu.add(new MenuItem("T", "ttt", true, 0.89));

        // vytvorime casnicku, ktorej odovzdame referenciu na hlavny MenuComponent
        // obsahujuci Menu, ktore obsahuju MenuItem-s pripadne dalsie Menu
        Waitress waitress = new Waitress(allMenus);

        // vypiseme vsetko, co restauracia ponuka
        waitress.printMenu();
    }
}
