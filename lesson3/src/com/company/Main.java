package com.company;
import java.util.*;
import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args) {
        double a;
        for(;;){

            try{
                a=Double.valueOf(JOptionPane.showInputDialog("Input double number"));
                if(a < 0){
                    throw  new NagativeValueException();
                }
                break;
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"Error number format");
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error number format");
            }
            catch (NagativeValueException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        System.out.println(a);
    }
}