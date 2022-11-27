package com.github.adamzv;

import java.io.*;
import java.util.Calendar;

public abstract class Game {
    protected String playerName;

    public final void run() {
        beforePlaying();
        play();
        afterPlaying();
        if (isLoggingOn()) {
            saveToFile();
        }
    }

    private void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));
            String msg = this.getClass().getSimpleName() + " played by " + playerName + " on ";
            msg += Calendar.getInstance().getTime().toString() + "> ";
            msg += getResults();
            bw.write(msg + "\n");
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    protected abstract void play();

    protected void beforePlaying() {
    }

    protected void afterPlaying() {
    }

    protected boolean isLoggingOn() {
        return true;
    }

    protected String getResults() {
        return "";
    }
}