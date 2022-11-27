package com.github.adamzv;

import java.io.*;

public abstract class AbstractFileProcessor {

    // in1.txt, in2.txt, in3.txt, in4.txt -> out.txt
    public final void processAllFiles(String[] filenames) {
        // algoritmus postupneho otvarania a spracovania jednotlivych
        // suborov s pouzitim BufferedReader, BufferedWriter a metody process()
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(filenames[filenames.length - 1]));

            for (int i = 0; i < filenames.length - 1; i++) {
                BufferedReader in = new BufferedReader(new FileReader(filenames[i]));

                process(in, out);
                in.close();
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void process(BufferedReader in, BufferedWriter out);
}
