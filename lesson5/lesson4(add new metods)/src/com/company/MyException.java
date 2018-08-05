package com.company;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return  "The group is overcrowded";
    }
}
