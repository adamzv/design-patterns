package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
	    Lampa lampa = new Lampa();
	    Garaz garaz = new Garaz();
	    Roleta roleta = new Roleta();

		Ovladac ovladac = new Ovladac(4);

	    Command cmd1 = new LampaZapniSa(lampa);
	    Command cmd2 = new LampaVypniSa(lampa);
	    Command cmd3 = new GarazOtvorSa(garaz);
	    Command cmd4 = new GarazZatvorSa(garaz);
	    Command cmd5 = new RoletaSpustiSa(roleta);
	    Command cmd6 = new RoletaVytiahniSa(roleta);

	    Command[] cmds = {cmd1, cmd3, cmd6};
	    Command[] cmds1 = {cmd2, cmd4, cmd5};
	    MacroCommand macro = new MacroCommand(cmds);
		MacroCommand macro1 = new MacroCommand(cmds1);

	    ovladac.setCommand(0, cmd1, cmd2);
	    ovladac.setCommand(1, cmd3, cmd4);
	    ovladac.setCommand(2, cmd5, cmd6);
		ovladac.setCommand(3, macro, macro1);

	    ovladac.onBtnPressed(0);
	    ovladac.offBtnPressed(0);
		ovladac.onBtnPressed(1);
		ovladac.offBtnPressed(1);
		ovladac.onBtnPressed(2);
		ovladac.offBtnPressed(2);

		ovladac.undoBtnPressed();

		System.out.println();
		ovladac.onBtnPressed(3);
		System.out.println();
		ovladac.offBtnPressed(3);
    }
}
