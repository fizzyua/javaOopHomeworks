package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class CloneCola {
    Queue<String> q = new ArrayDeque<String>();

    public CloneCola() {
        this.q.add("Sheldon");
        this.q.add("Leonard");
        this.q.add("Volovitc");
        this.q.add("Kutrapalli");
        this.q.add("Penny");
    }

    public void vendingMachine(int numberOfBottles){
        defaulfValue();
        for(int i = 0; i < numberOfBottles; i++){
            String t = q.remove();
            q.add(t);
            q.add(t);
        }
    }

    @Override
    public String toString() {
        return "CloneCola{" +
                "q=" + q +
                '}';
    }
    public void defaulfValue(){
        this.q.clear();
        this.q.add("Sheldon");
        this.q.add("Leonard");
        this.q.add("Volovitc");
        this.q.add("Kutrapalli");
        this.q.add("Penny");
    }
}
