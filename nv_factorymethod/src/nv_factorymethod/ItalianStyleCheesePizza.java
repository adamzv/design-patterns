package nv_factorymethod;

/**
 *
 * @author KI
 */
public class ItalianStyleCheesePizza extends Pizza {

    public ItalianStyleCheesePizza() {
        name = "Cheese (Italian style)";

        toppings.add("mozarella");
        toppings.add("parmesan");
        toppings.add("niva");
    }

}
