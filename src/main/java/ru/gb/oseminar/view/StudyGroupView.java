package ru.gb.oseminar.view;

import ru.gb.oseminar.data.StudyGroup;

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
}
