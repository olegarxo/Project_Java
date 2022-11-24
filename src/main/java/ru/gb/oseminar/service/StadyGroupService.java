package ru.gb.oseminar.service;

import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.List;

public class StadyGroupService{

    public StudyGroup GenerateStudyGroup(Teacher teacher, List<User> studentList){
        StudyGroup group = new StudyGroup(teacher, studentList);
        return group;
    }


}
