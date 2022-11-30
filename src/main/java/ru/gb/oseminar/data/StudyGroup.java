package ru.gb.oseminar.data;

import java.util.List;

public class StudyGroup {

    public StudyGroup(Teacher teacher, List<User> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    private Teacher teacher;
    private List<User> studentList;

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher= " + teacher +
                ", studentList= " + studentList +
                "} \n";
    }
}
