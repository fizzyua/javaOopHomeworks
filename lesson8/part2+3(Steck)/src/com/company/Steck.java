package com.company;

import java.util.Arrays;

public class Steck {
    private Object [] steck = new Object[0];
    private BlackList bList = null;

    private void copyMasive(Object [] inMas ,Object [] outMas, int count){
        for(int i = 0; i < count; i++){
            outMas[i] = inMas[i];
        }
    }

    public Steck() {
    }
    public Steck( BlackList blackList){
        bList = blackList;
    }

    public void addElement(Object element) throws IllegalArgumentException{
        if (bList != null && bList.check(element.getClass())) {
            throw new IllegalArgumentException();
        }
        Object [] temp = new Object[steck.length + 1];
        copyMasive(steck,temp,steck.length);
        this.steck = temp;
        this.steck[steck.length - 1] = element;
    }

    @Override
    public String toString() {
        return "Steck{" +
                "steck=" + Arrays.toString(steck) +
                '}';
    }
   public Object remove(){
        Object out = steck[steck.length - 1];
        Object [] temp = new Object[steck.length - 1];
        copyMasive(steck,temp,temp.length);
        steck = temp;
        return out;
    }
    public Object getLastElement(){
        return steck[steck.length - 1];
    }
}
