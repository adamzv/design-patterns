package nv_simplefactory;


/**
 *
 * @author KI
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
         if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("hawai")) {
            pizza = new HawaiPizza();
        } else if (type.equals("salami")) {
          pizza = new SalamiPizza();
        } else if (type.equals("tuna")) {
             pizza = new TunaAndOnionPizza();
         }
        return pizza;
    }
}