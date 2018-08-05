package com.company;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.io.File;


public class Main {
    public static void main(String [ ] args) {
        Group a = new Group();
        File b = new File("a.csv");
        File c = new File("b.csv");
        try {
            a.createGroupFromFile(b);
        }catch (MyException e){
            e.getMessage();
        }
        System.out.println(a.toStringByAlfavit());
        try {
            a.addStudentToGroup(new Student(27,"male","Anton","Grigorenko","CE-210"));
        }catch (MyException e){
            e.getMessage();
        }
        a.svaeGroupToFile(c);
    }


}


