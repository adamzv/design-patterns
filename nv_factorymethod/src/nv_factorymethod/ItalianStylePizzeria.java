package nv_factorymethod;

public class ItalianStylePizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ItalianStyleCheesePizza();
        } else if (type.equals("hawai")) {
            pizza = new ItalianStyleHawaiPizza();
        } else if (type.equals("salami")) {
            pizza = new ItalianStyleSalamiPizza();
        }

        return pizza;
    }
}
