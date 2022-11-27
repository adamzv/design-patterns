public class Test {

    public static void main(String[] args) {
        Beverage b = new Espresso();
        System.out.println(b.getDescription() + " " + 
                           String.format("%.2f", b.cost()) + " €");

        Beverage b2 = new DarkRoast();
        b2 = new Sugar(b2);
        b2 = new Sugar(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " " + 
                           String.format("%.2f",b2.cost()) + " €");
        System.out.println(b2.toString());

        
        Beverage b3 = new Sugar(new Milk(new Decaf()));
        System.out.println(b3.getDescription() + " " + 
                           String.format("%.2f",b3.cost()) + " €");

        Beverage b4 = new Sugar(new Sugar(new Milk(new Espresso())));
        System.out.println(b4.getDescription() + " " + String.format("%.2f", b4.cost()) + " e");
    }
}
