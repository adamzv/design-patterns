package nv_abstractfactory;

public class ItalianPizzeria extends Pizzeria {

	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ItalianPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Italian Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Italian Style Veggie Pizza");

		} else {
                    // ina
                }
		return pizza;
	}
}
