package com.company;

public class Student extends Human{
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(int age, String sex, String firstName, String lastName, String group) {
        super(age, sex, firstName, lastName);
        this.group = group;
    }


    public Student() {
    }

    @Override
    public String toString() {
        return "Student{"+
                "age=" + this.getAge() +
                ", sex='" + this.getSex() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public Student getLoverStudentByLastName(Student a,Student b){
        if (a.getLastName().equals(b.getLastName())) return a;
        else  return b;
    }

}
