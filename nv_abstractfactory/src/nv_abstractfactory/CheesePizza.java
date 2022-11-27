package nv_abstractfactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

        // pri priprave tejto pizze sa vyuziju produkty konkretnej tovarne
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
                // z tovarne ziskame potrebne produkty
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
                System.out.println("\t" + dough);
                System.out.println("\t" + sauce);
                System.out.println("\t" + cheese);
	}
}
