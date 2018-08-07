package com.company;

import java.math.BigInteger;

public class Servise {
    public static int getSumFromMasInt(int [] mas){
        int sum = 0;
        for(int i =0; i < mas.length; i++){
            sum += mas[i];
        }
        return sum;
    }
}
