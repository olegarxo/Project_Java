package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StudyGroupComparator;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.StudyGroupView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class Controller {
    private final UserService userService = new UserService();
    public final StudentView studentView = new StudentView();

    public void creatUser(String firstName, String secondName, String patronymic) {
        userService.UserCreate(firstName, secondName, patronymic);
        List<User> students = userService.getAll();
        studentView.SendOnConsole(students);
    }

    private List<Long> listID = new ArrayList<>();
    private Long teacherID;
    private StudyGroupService studyGroupService = new StudyGroupService();
    private StudyGroup studyGroup;
    private StudyGroupView studyGroupView = new StudyGroupView();
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
        studyGroupView.ShowStudyGroup(studyGroupService.formirateStudyGroup(teacher, list));
        return studyGroup = studyGroupService.formirateStudyGroup(teacher, list);
    }
    public StudyGroup FormirateGroup(Teacher teacher, int count){
        studyGroup = studyGroupService.formirateStudyGroup(teacher, count);
        studyGroupView.ShowStudyGroup(studyGroup);
        return studyGroup;

    }
    public void ShowSortGroup(List<User> studentList){
        Collections.sort(studentList, new StudyGroupComparator());
        Logger logger = Logger.getAnonymousLogger();
        logger.info(studentList.toString());
    }
    public void SortStudent(List<StudyGroup> studyGroups){
        List<User> students = new ArrayList<>();
        for (StudyGroup studyGroup1:studyGroups){
            students.addAll(studyGroup1.getStudentList());
        }
        students.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getSecondName().equalsIgnoreCase(o2.getSecondName())){
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getSecondName().compareTo(o2.getSecondName());
            }
        });
        studyGroupView.ShowStudents(students);
    }
}



