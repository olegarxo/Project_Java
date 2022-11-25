package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StadyGroupService;
import ru.gb.oseminar.view.StudyGroupView;

import java.util.ArrayList;
import java.util.List;

public class FormStadyGroup {
    List<Long> listID = new ArrayList<>();
    Long teacherID;
    StadyGroupService stadyGroupService = new StadyGroupService();
    StudyGroup studyGroup;
    StudyGroupView studyGroupView = new StudyGroupView();
    public List<Long> GetStudentID(StudyGroup somGroup) {
        List<User> listStady = somGroup.getStudentList();
        for (User item : listStady) {
            listID.add(((Student) item).getStudentID());
        }
        return this.listID;
    }

    public Long GetTeacherID(StudyGroup somGroup){
        teacherID = somGroup.getTeacher().getTeacherID();
        return this.teacherID;
    }
    public StudyGroup FormirateGroup(Teacher teacher, List<User> list){
        studyGroupView.ShowStudyGroup(stadyGroupService.getStudyGroup(teacher, list));
        return studyGroup = stadyGroupService.getStudyGroup(teacher, list);
    }
}
