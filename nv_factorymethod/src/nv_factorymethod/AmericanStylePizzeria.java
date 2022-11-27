package nv_factorymethod;

/**
 *
 * @author KI
 */
public class AmericanStylePizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new AmericanStyleCheesePizza();
        } else if (type.equals("hawai")) {
            pizza = new AmericanStyleHawaiPizza();
        } else if (type.equals("salami")) {
            pizza = new AmericanStyleSalamiPizza();
        }

        return pizza;
    }
}
