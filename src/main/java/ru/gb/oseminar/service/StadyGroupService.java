package ru.gb.oseminar.service;

import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.List;

public class StadyGroupService{
    private StudyGroup studyGroup;

    public StudyGroup getStudyGroup(Teacher teacher, List<User> list) {
       return this.studyGroup = new StudyGroup(teacher, list);
    }

    public StadyGroupService(){
        this.studyGroup = new StudyGroup(studyGroup.getTeacher(), studyGroup.getStudentList());
    }


}
