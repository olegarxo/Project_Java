package ru.gb.oseminar.data;

public class Student extends User{
    Long studentID;

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Student(String firstName, String secondName, String patronymic, Long studentID) {
        super(firstName, secondName, patronymic);
        this.studentID = studentID;
    }

}
