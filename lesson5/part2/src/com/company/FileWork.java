package com.company;

import java.io.*;
import java.util.ArrayList;

public class FileWork {
    public static String getWordArrayFromFile(File in) {
        String str = "";
        String out ="";
        try (BufferedReader f = new BufferedReader(new FileReader(in))){
            for(;(str = f.readLine())!= null;){
                out += str + " ";
            }
        } catch (IOException e){
            System.out.println("ERROR");
        }
        return out;
    }
    private static String [] getArrayStringFromString(String in){
        return in.split(" ");
    }
    public static  String getSameWordsFromTwoStrings(String str1 ,String str2){
        String [] A = getArrayStringFromString(str1);
        String [] B = getArrayStringFromString(str2);
        String res = "";
        for (String i: A) {
            for (String j: B) {
                if (i.equals(j)){
                    res += j + " ";
                }
            }
        }
        return res;
    }
    public static void saveStringToFile(String str, File file){
        try (BufferedWriter f = new BufferedWriter(new FileWriter(file))){
            f.write(str);

        }catch (IOException e){
            System.out.println();
        }
    }
    public static void saveSameWordToFile(File inOne, File inTwo, File outOne){
        String str1 = getWordArrayFromFile(inOne);
        String str2 = getWordArrayFromFile(inTwo);
        String out = getSameWordsFromTwoStrings(str1,str2);
        saveStringToFile(out,outOne);
    }
}
