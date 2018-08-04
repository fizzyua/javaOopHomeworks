package com.company;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        Student a = new Student(20, "male", "Mykhailo", "Romanko", "CE-208");
        Student b = new Student(19, "female", "Marina", "Koval", "CE-208");
        Student c = new Student(18, "male", "Vasiliy", "Nevskiy", "CE-208");
        Student d = new Student(30, "male", "Roman", "Sokol", "CE-208");
        Student k = new Student(18, "male", "Valeriy", "Orlov", "CE-208");
        Student f = new Student(25, "male", "Dmitriy", "Kireev", "CE-208");
        Student g = new Student(19, "female", "Anna", "Koresh", "CE-208");
        Student u = new Student(21, "female", "Galina", "Kasatka", "CE-208");
        Student h = new Student(27, "female", "Yulia", "Koval", "CE-208");
        Student j = new Student(29, "female", "Dasha", "Askotova", "CE-208");
        Student l = new Student(235, "female", "Maria", "Hupal", "CE-208");


        Group newGroup = new Group();
        try {
            newGroup.addStudentToGroup(a);
            newGroup.addStudentToGroup(b);
            newGroup.addStudentToGroup(c);
            newGroup.addStudentToGroup(d);
            newGroup.addStudentToGroup(k);
            newGroup.addStudentToGroup(f);
            newGroup.addStudentToGroup(g);
            newGroup.addStudentToGroup(u);
            newGroup.addStudentToGroup(h);
            newGroup.addStudentToGroup(j);
            newGroup.addStudentToGroup(l);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(newGroup.findStudentByLastName("Romanko").toString());
        newGroup.deleteStudentByPosition(5);
        newGroup.interactiveAddStudent();
        System.out.println(newGroup.toStringByAlfavit());


       /* newGroup.interactiveAddStudent();*/
        Student [] tst = newGroup.getDraftee();
        for (Student stud: tst) {
            System.out.println(stud);
        }


        }
    }

