package com.company;

import java.io.*;


public class Main {
    public static void main(String [ ] args) {
        Group groupOnew = new Group();
        try {
            groupOnew.addStudentToGroup(new Student(20,"male","Mykhailo","Romanko","Ce-208"));
            groupOnew.addStudentToGroup(new Student(22,"male","Anton","Grigorenko","Ce-208"));
            groupOnew.addStudentToGroup(new Student(17,"male","Vadym","Koval","Ce-208"));
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            SerializableFileWork.saveObjectToFile(groupOnew,new File("t.group"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Group groupTwo = (Group) SerializableFileWork.loadObjectFromFile(new File("t.group"));
            System.out.println(groupTwo.toStringByAlfavit());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}


