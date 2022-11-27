package nv_factorymethod;

/**
 *
 * @author KI
 */
public abstract class Pizzeria {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
