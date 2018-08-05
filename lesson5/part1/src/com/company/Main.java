package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        MyFileFilter mFF = new MyFileFilter("doc", "txt");
        File infolder = new File("myInFolder");
        File outfolder = new File("myOutFolder");
        try {
            FileWork.copyFilesFromFolderToAnotherFolderWithFilter(infolder,outfolder,mFF);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
