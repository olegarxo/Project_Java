package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudyGroupService {
    Random random = new Random();
    List<String> firstName = new ArrayList<>(Arrays.asList("Смирнов","Иванов","Сидаров","Белов","Петров","Плюхин","Карпов"));
    List<String> secondName =  new ArrayList<>(Arrays.asList("Олег","Андрей","Иван","Дмитрий","Владислав","Михаил","Александр"));
    List<String> patronymic = new ArrayList<>(Arrays.asList("Николаевич","Михайлович","Александрович","Олегович","Владиславович","Петрович","Дмитревич"));
    private int count = 0;
    private  final List<StudyGroup> studyGroupList;
    private StudyGroup studyGroup;

    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }
    public StudyGroup getStudyGroup(int numberGroup){
        try {
            return studyGroupList.get(numberGroup - 1);
        }catch (Exception e){
        }
        throw new IllegalArgumentException("Такой группы нет");
    }

    public StudyGroup formirateStudyGroup(Teacher teacher, List<User> list) {
        this.studyGroup = new StudyGroup(teacher, list);
        this.studyGroupList.add(this.studyGroup);
        count++;
        System.out.printf("Вы создали %d-ю группу%n", count);
        return this.studyGroup;
    }
    public StudyGroup formirateStudyGroup(Teacher teacher, int countStudent) {
        List<User> listStudent = new ArrayList<>();
        for (Integer i = 0; i < countStudent; i++){
            String fistname = this.firstName.get(random.nextInt(this.firstName.size()));
            String secondname = this.secondName.get(random.nextInt(this.secondName.size()));
            String patronymic = this.patronymic.get(random.nextInt(this.patronymic.size()));
            Student student = new Student(fistname,secondname,patronymic, i.longValue() + 1);
            student.setGroupID(count);
            listStudent.add(student);
        }
        this.studyGroup = new StudyGroup(teacher, listStudent);
        this.studyGroupList.add(this.studyGroup);
        count++;
        System.out.printf("Вы создали %d-ю группу%n", count);
        return this.studyGroup;
    }
}
