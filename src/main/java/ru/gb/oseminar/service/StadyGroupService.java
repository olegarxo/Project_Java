package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StadyGroupService implements DataService {

    public StudyGroup GenerateStudyGroup(Teacher teacher, List<Student> listStudent){

        return null;
    }


    @Override
    public void UserCreate(String firstName, String secondName, String patronymic) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void deletUser(Long id) {

    }
}
