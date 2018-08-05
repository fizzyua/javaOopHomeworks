package com.company;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Group implements MilitarRegistration {
    private Student[] students = new Student[10];

    public void addStudentToGroup(Student student) throws MyException {
        for (int i = 0; i < 10; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("student has been added on position " + i);
                return;
            }
        }
        throw new MyException();
    }

    public Student findStudentByLastName(String lastName) {
        Student example = new Student();
        for (int i = 0; i < 10; i++) {
            if (students[i] != null) {
                if (students[i].getLastName().equals(lastName)) {
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
            for (int i = 0; i < 10; i++) {
                if (i < 9) {
                    if (students[i] == null) {
                        swapStudents(i, i + 1, students);
                    }
                }
            }

        }
    }

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

    public static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + (students == null ? null : Arrays.asList(students)) +
                '}';
    }

    private int getInteractiveAge() {
        int age = 0;
        for (; ; ) {
            try {
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is a student?", "Add new student", JOptionPane.QUESTION_MESSAGE));
            } catch (Exception e) {
            }
            if (age > 0) break;
        }
        return age;
    }

    private String getInteractiveSex() {
        String[] sexenam = {"male", "female"};
        String sex = "";
        for (; ; ) {
            try {
                sex = (String) JOptionPane.showInputDialog(null, "What gender is a student?", "Add new student", JOptionPane.QUESTION_MESSAGE, null, sexenam, sexenam[0]);
            } catch (Exception e) {
            }
            if (sex != "") break;
        }
        return sex;

    }

    private String getInteractiveFirstName() {
        String firstName = "";
        for (; ; ) {
            try {
                firstName = JOptionPane.showInputDialog(null, "What is the name of the student?", "Add new student", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception e) {
            }
            if (!firstName.equals("")) break;
        }
        return firstName;
    }

    private String getInteractiveLastName() {
        String lastName = "";
        for (; ; ) {
            try {
                lastName = JOptionPane.showInputDialog(null, "What is the last name of the student?", "Add new student", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception e) {
            }
            if (!lastName.equals("")) break;
        }
        return lastName;
    }

    private String getInteractiveGroup() {
        String group = "";
        for (; ; ) {
            try {
                group = JOptionPane.showInputDialog(null, "in which group will the student study?", "Add new student", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception e) {
            }
            if (!group.equals("")) break;
        }
        return group;
    }

    public void interactiveAddStudent() {
        int age = getInteractiveAge();
        String sex = getInteractiveSex();
        String firstName = getInteractiveFirstName();
        String lastName = getInteractiveLastName();
        String group = getInteractiveGroup();
        Student student = new Student(age, sex, firstName, lastName, group);
        try {
            this.addStudentToGroup(student);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
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
        for (int i = 0; i < 10; i++) {
            res += order[i] + ") " + tst[i] + "\n";
        }
        return res;
    }

    @Override
    public Student[] getDraftee() {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getAge() > 18 && students[i].getSex().toLowerCase() == "male")
                count++;
        }
        Student[] out = new Student[count];
        count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getAge() > 18 && students[i].getSex().toLowerCase() == "male") {
                out[count] = students[i];
                count++;
            }
        }
        return out;
    }

    private Student[] getStudentsFromStr(String str) throws MyException {
        String[] rows = str.split("\r\n");
        Student[] students = new Student[rows.length];
        for (int i = 0; i < rows.length; i++) {
            String[] parametrs = rows[i].split(";");
            addStudentToGroup(new Student(Integer.parseInt(parametrs[0]),parametrs[1],parametrs[2],parametrs[3],parametrs[4]));
        }
        return students;
    }

    public void createGroupFromFile(File file) throws MyException {
        ArrayList<String> st= new ArrayList<>();
        try(DataInputStream f = new DataInputStream(new FileInputStream(file))) {
            byte [] bytes = f.readAllBytes();
            String str1 = new String(bytes);
            Student [] stud = getStudentsFromStr(str1);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void svaeGroupToFile(File file){
        try (BufferedWriter f = new BufferedWriter(new FileWriter(file))){
            String str = "";
            for (int i = 0; i < 10; i++) {
                if (students[i] != null) {
                    str += students[i].getAge() + ";" + students[i].getSex() + ";" + students[i].getFirstName() + ";" + students[i].getLastName() + ";" + students[i].getGroup() + "\r\n";
                }
            }
            f.write(str);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
