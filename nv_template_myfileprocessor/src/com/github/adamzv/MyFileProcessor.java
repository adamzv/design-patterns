package com.github.adamzv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class MyFileProcessor extends AbstractFileProcessor {
    @Override
    public void process(BufferedReader in, BufferedWriter out) {
        in.lines().forEach(l -> {
            try {
                out.write(String.valueOf(l.length()) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
