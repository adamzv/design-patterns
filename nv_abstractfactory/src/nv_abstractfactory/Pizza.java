package nv_abstractfactory;

public abstract class Pizza {
	protected String name;

	protected Dough dough;  // cesto
	protected Sauce sauce;  // omacka
	protected Veggies veggies[]; // zelenina
	protected Cheese cheese; // syr
	
	public abstract void prepare();

	public void bake() {
		System.out.println("Baking for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Placing pizza in official box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}



}
