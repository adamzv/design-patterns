package nv_factorymethod;

/**
 *
 * @author KI
 */
public class AmericanStyleCheesePizza extends Pizza {

    public AmericanStyleCheesePizza() {
        name = "Cheese (American style)";

        toppings.add("mozarella");
        toppings.add("parmesan");
        toppings.add("niva");
    }

}
