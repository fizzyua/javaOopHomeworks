package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File a = new File("test.txt");
        FileAnalizator b = new FileAnalizator(a);
        b.getResult();
    }
}
