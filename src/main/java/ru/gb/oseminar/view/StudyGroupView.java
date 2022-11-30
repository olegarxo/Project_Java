package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView {
    public void ShowStudyGroup(StudyGroup studyGroup){
        Logger logger = Logger.getLogger(StudyGroupView.class.getName());
        logger.info(studyGroup.toString());
    }
    public void ShowStudyGroup(List<StudyGroup> studyGroups){
        Logger logger = Logger.getLogger(StudyGroupView.class.getName());
        for (StudyGroup group: studyGroups) {
            logger.info(group.toString());
        }

    }
    public void ShowStudents(List<User> studentsList){
        Logger logger = Logger.getLogger(StudyGroupView.class.getName());
        for (User student: studentsList) {
            System.out.println(student.getFirstName()+ " " +
                    student.getSecondName() + " " +
                    student.getPatronymic() + " - " + ((Student)student).getGroupID() + " группа");
        }
    }

}
