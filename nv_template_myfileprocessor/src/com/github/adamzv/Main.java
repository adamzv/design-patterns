package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
        MyFileProcessor mfp = new MyFileProcessor();
        String[] files = {"int1.txt", "out1.txt"};
        mfp.processAllFiles(files);
    }
}
