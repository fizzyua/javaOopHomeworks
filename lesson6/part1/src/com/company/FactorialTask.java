package com.company;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
    private int number;

    public FactorialTask(int number) {
        super();
        this.number = number;
    }

    public FactorialTask() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static BigInteger calculateFactorial(int n){
        BigInteger factorial = new BigInteger("1");
        for(int i =1; i <= n; i++){
            factorial = factorial.multiply(new BigInteger("" + i));
        }
        return factorial;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
            System.out.println(th.getName() + " -> " + number +  "! = " + calculateFactorial(number));

    }
}
