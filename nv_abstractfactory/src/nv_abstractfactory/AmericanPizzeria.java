package nv_abstractfactory;

public class AmericanPizzeria extends Pizzeria {
 
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		PizzaIngredientFactory ingredientFactory =  new AmericanPizzaIngredientFactory();
 
		if (type.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("American Style Cheese Pizza");
  
		} else if (type.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("American Style Veggie Pizza");
 
		} else {
                    // ina
 
		} 
		return pizza;
	}
}
