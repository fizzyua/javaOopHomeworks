package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileAnalizator {
    private List<Character> letters = new ArrayList<>();
    private List<Integer> freq = new ArrayList<>();

    public FileAnalizator(File file) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int symbol = bufferedReader.read();
            while (symbol != -1) {
                analyzideSymbol(symbol);
                symbol = bufferedReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void incrementList(int position){
        int i = this.freq.get(position);
        i++;
        this.freq.set(position,i);
    }
    private void analyzideSymbol(int sym){
        char c = Character.toLowerCase((char) sym);
        String str = "" + c;
        if (!str.matches("[a-z]|[A-Z]]"))return;
        for (int i = 0; i < this.letters.size(); i++){
            if(this.letters.get(i).equals(c)){
                incrementList(i);
                return;
            }
        }
        this.letters.add(c);
        this.freq.add(1);
    }
    public void getResult(){
        for(int i = 0; i < freq.size(); i++){
            for(int j = i; j < freq.size(); j++){
                if (freq.get(i) < freq.get(j)){
                    Collections.swap(freq,i,j);
                    Collections.swap(letters,i,j);
                }
            }
        }
        for(int i = 0; i < freq.size(); i++){
            System.out.println(letters.get(i) + " -> " + freq.get(i));
        }
    }
}