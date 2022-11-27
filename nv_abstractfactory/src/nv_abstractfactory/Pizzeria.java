package nv_abstractfactory;


public abstract class Pizzeria {
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

        // abstraktna tovarenska metoda
        public abstract Pizza createPizza(String type);
}
