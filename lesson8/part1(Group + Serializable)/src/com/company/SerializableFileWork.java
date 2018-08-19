package com.company;

import java.io.*;

public class SerializableFileWork {
    public static void saveObjectToFile(Object obj, File file) throws IOException{
        if(obj == null){
            throw new IllegalArgumentException();
        }
        try(ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(file))){
            OOS.writeObject(obj);
        }
        catch(IOException e){
            System.out.println("ERROR save group !!!");
        }
    }


    public static Object loadObjectFromFile(File file) throws FileNotFoundException,IOException,ClassNotFoundException {
        try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
