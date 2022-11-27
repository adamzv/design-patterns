package nv_abstractfactory;

// rohranie reprezentujuce abstraktnu tovaren
// kazda konkretna tovaren ho bude implementovat
public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
 
}