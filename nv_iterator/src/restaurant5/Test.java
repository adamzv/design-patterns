package restaurant5;

import java.util.ArrayList;

public class Test {

    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        
        // pripadne dalsie menu

        // vsetky nachystame do ArrayListu
        ArrayList<Menu> list = new ArrayList<Menu>();
        list.add(pancakeHouseMenu);
        list.add(dinerMenu);

        // v triede "casnicka" mozeme pripadne pripravit metodu addMenu na pridavanie
        // dalsich menu do interneho zoznamu
        Waitress waitress = new Waitress(list);
        waitress.printMenu();
       
    }
}
