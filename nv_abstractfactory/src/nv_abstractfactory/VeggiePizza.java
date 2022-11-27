package nv_abstractfactory;

import java.util.Arrays;

public class VeggiePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();

                System.out.println("\t" + dough);
                System.out.println("\t" + sauce);
                System.out.println("\t" + cheese);
                System.out.println("\t" + Arrays.asList(veggies));
	}
}
