package ru.gb.oseminar.service;

import ru.gb.oseminar.data.User;

import java.util.List;

public interface DataService {
    void UserCreate(String firstName, String secondName, String patronymic);
    List<User> getAll();
    void deletUser(Long id);
}
