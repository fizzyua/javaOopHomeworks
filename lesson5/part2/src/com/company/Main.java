package com.company;


import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        File one = new File("a.txt");
        File two = new File("b.txt");
        File out = new File("c.txt");
        FileWork.saveSameWordToFile(one,two,out);

    }
}
