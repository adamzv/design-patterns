package nv_abstractfactory;

// konkretna tovaren (obsahuje tovarenske metody)
// talianske pizzerie nech pouzivaju taketo cesto, takuto omacku, syr, zeleninu
public class ItalianPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new Olive()  };
		return veggies;
	}


}
