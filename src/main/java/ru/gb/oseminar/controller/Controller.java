package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void creatUser(String firstName, String secondName, String patronymic){
        userService.UserCreate(firstName, secondName, patronymic);
        List<User> students = userService.getAll();
        studentView.SendOnConsole(students);

    }
}
