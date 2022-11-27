package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
		//	MyClass obj1 = MyClass.getInstance();
		//	MyClass obj2 = MyClass.getInstance();
		//	System.out.println(obj1 == obj2);

		ManazerSkriniek m = ManazerSkriniek.getInstance(100);
		// ManazerSkriniek m = ManazerSkriniek.getInstance(); aj toto musi fungovat
		m.obsad(4);
		m.obsad(0);
		System.out.println(m.getPocetSkriniek());
		System.out.println(m.getPocetVolnych());
		System.out.println(m.getPrvaVolna());
		m.uvolni(4);
		System.out.println(m.getPocetVolnych());

		System.out.println("###########################");
		Gula gula = Gula.getInstance();
		Gula gula1 = Gula.getInstance();
		System.out.println(gula == gula1);
		System.out.println(gula.getOdpoved());
		System.out.println(gula1.getOdpoved());
    }
}
