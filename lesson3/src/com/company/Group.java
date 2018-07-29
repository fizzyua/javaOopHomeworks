package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    private Student[] students = new Student[10];

    public void addStudentToGroup(Student student) throws MyException {
        for (int i = 0; i < 10; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("student has been added on position " + i);
                break;
            }
            if (i == 9) throw new MyException();
        }
    }

    public Student findStudentByLastName(String lastName) {
        Student example = new Student();
        for (int i = 0; i < 10; i++) {
            if (students[i] != null) {
                if (students[i].getLastName() == lastName) {
                    example = students[i];
                    return example;
                }
            }
        }
        return example;
    }

    public void deleteStudentByPosition(int position) {
        if (position > 0 && position < 10 && students[position] == null)
            System.out.println("A student with such a position is not present");
        if (position < 0 || position > 10)
            System.out.println("Please recheck the position");
        if (position > 0 && position < 10 && students[position] != null) {
            students[position] = null;
            for(int i = 0; i < 10 ; i++){
                if (i < 9){
                if (students[i] == null){
                    swapStudents(i,i+1,students);
                    }
            }
        }

    }}

    private void swapStudents(int a, int b, Student[] mas) {
        Student tem = new Student();
        tem = mas[a];
        mas[a] = mas[b];
        mas[b] = tem;

    }

    private void swapInt(int a, int b, int[] mas) {
        int temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }

    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + (students == null ? null : Arrays.asList(students)) +
                '}';
    }

    public String toStringByAlfavit() {
        String res = "";
        int order[] = new int[10];
        Student[] tst = students.clone();

        for (int i = 0; i < 10; i++) order[i] = i;
        for (int i = 10 - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tst[j] != null && tst[j + 1] != null) {
                    if (isGreaterThen(tst[j].getLastName(), tst[j + 1].getLastName())) {
                        swapStudents(j, j + 1, tst);
                        swapInt(j, j + 1, order);
                    }
                }
            }
        }
        for(int i = 0; i < 10; i++){
           res += order[i] + ") " + tst[i] + "\n";
        }
        return  res;
    }
}
