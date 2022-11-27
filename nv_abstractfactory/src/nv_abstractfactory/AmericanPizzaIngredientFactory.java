package nv_abstractfactory;

// konkretna tovaren (obsahuje tovarenske metody)
// americke pizzerie nech pouzivaju taketo cesto, takuto omacku, syr, zeleninu
public class AmericanPizzaIngredientFactory  implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThickCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom() };
		return veggies;
	}
 
}
