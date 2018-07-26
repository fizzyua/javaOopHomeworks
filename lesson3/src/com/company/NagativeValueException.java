package com.company;

public class NagativeValueException extends Exception{
    @Override
    public String getMessage(){
        return "You imput negative value";
    }
}
