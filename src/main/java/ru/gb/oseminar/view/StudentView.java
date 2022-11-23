package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void SendOnConsole(List<User> students){
        Logger logger = Logger.getLogger(System.class.getName());
        for (User item: students) {
            logger.info(item.toString());
        }

    }
}
