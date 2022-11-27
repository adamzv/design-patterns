package com.github.adamzv;

import java.util.*;

public class DesignPatternsGame extends Game{

    private Scanner scanner = new Scanner(System.in);
    private String result;
    private Map<String, String> questions = Map.of("Ako sa volá návrhový vzor zabezpečujúci vznik len jednej inštancii triedy?", "singleton",
            "Ktorý návrhový vzor implementuje rozhranie, ktoré umožňuje komunikáciu medzi nekompatibilnými rozhraniami?", "adapter",
            "Ktorý návrhový vzor umožňuje upozorniť objekty na akékoľvek zmeny stavu?", "observer");

    @Override
    protected void play() {
        Random rndm = new Random();
        int num = rndm.nextInt(questions.size());

        Object question = questions.keySet().toArray()[num];
        System.out.println(question);
        String answer = scanner.nextLine();

        if (questions.get(question).equals(answer.toLowerCase())) {
            result = "Dobrá odpoveď";
        } else {
            result = "Zlá odpoveď";
        }
    }

    @Override
    protected void beforePlaying() {
        super.beforePlaying();

        System.out.println("Zadajte svoje meno: ");
        playerName = scanner.nextLine();
    }

    @Override
    protected void afterPlaying() {
        System.out.println(getResults());
    }

    @Override
    protected boolean isLoggingOn() {
        return true;
    }

    @Override
    protected String getResults() {
        return result;
    }
}
