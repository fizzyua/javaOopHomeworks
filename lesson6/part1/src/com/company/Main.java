package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        for(int i =0; i < 100;i++){
            FactorialTask task = new FactorialTask(i+1);
            Thread th = new Thread(task);
            th.start();
        }
    }
}
