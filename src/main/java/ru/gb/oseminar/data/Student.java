package ru.gb.oseminar.data;

public class Student extends User{
    private Long studentID;
    private int groupID;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
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
