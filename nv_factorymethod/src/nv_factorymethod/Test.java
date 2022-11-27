package nv_factorymethod;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // vytvorime americku pizzeriu
        Pizzeria america = new AmericanStylePizzeria();
        // objedname pizzu
        Pizza pizza = america.orderPizza("hawai");

        // TO DO:
        // vymeňte americkú pizzeriu za taliansku a objednajte si pizzu
        Pizzeria talianska = new ItalianStylePizzeria();
        pizza = talianska.orderPizza("hawai");
        
       
    }

}
