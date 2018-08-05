package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWork {
    public static void copyFilesFromFolderToAnotherFolderWithFilter(File inputFolder, File outputFolder, MyFileFilter filter) throws IOException {

        File[] fileList = inputFolder.listFiles(filter);

        for (File file:fileList) {
            PrintWriter out = new PrintWriter(outputFolder.getAbsoluteFile() + "\\" + file.getName());
        }

        File[] fileListOut = outputFolder.listFiles();

        for (File file:fileList) {
            for (File buffwe: fileListOut) {
                if(file.getName().equals(buffwe.getName())){
                    StreamWork.copyFiles(file,buffwe);
                }
            }
        }
    }
}
