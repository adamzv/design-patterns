package nv_simplefactory;

/**
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vytvorime pizzeriu
        Pizzeria casaMia = new Pizzeria(new SimplePizzaFactory());

        // objedname pizzu
        Pizza pizza = casaMia.orderPizza("cheese");
        System.out.println(pizza.getName() + " is ready!");

        pizza = casaMia.orderPizza("hawai");
        System.out.println(pizza.getName() + " is ready!");

        // TO DO:
        // a) objednajme si inú pizzu
        // b) pridajme do ponuky vlastný produkt (nejaú inú pizzu)
        pizza = casaMia.orderPizza("salami");
        System.out.println(pizza.getName() + " is ready!");

        pizza = casaMia.orderPizza("tuna");
        System.out.println(pizza.getName() + " is ready!");
    }

}
