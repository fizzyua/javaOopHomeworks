package com.company;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        CloneCola test = new CloneCola();
        test.vendingMachine(10);
        System.out.println(test);
        test.vendingMachine(5);
        System.out.println(test);

    }
}
