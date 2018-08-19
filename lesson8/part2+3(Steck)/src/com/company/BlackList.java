package com.company;

import java.io.File;
import java.io.FileFilter;

public class BlackList {
    private String [] arr;


    public BlackList(String... arr)  {
        super();
        this.arr = arr;
    }
    public boolean check (Class cl){
        String res = cl.getCanonicalName();
        int pointerIndex = res.lastIndexOf(".");
        res =  res.substring(pointerIndex + 1);
        for (String c: arr) {
            if(c.equals(res))
            return true;
        }
        return false;
    }
}
