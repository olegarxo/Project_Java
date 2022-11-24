package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StadyGroupService;

import java.util.List;

public class FormStadyGroup {
    private List<Long> listID;
    private final StadyGroupService stadyGroupService = new StadyGroupService();
    public List<Long> GetStudentID(StudyGroup somGroup){
        List<User> listStady = somGroup.getStudentList();
        User Teacher = somGroup.getTeacher();
        for (User item: listStady) {
           this.listID.add(((Student) item).getStudentID());
        }
        return this.listID;
        public List<Long> GetStudentID(StudyGroup somGroup){

        }


        }
    }
}
