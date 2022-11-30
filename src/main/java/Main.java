import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.creatUser("Oleg", "Smirnov", "Nicolaevich");
        List<User> listStudent = new ArrayList<>(Arrays.asList(new Student("Smirnov", "Oleg", "Nikolaevich", 1L),
                                                                  new Student("Polichuk", "Mariya", "Sergeeva", 2L),
                                                                  new Student("Aluhin", "Michail", "Vladimuirovich", 3L)));
        Teacher teacher = new Teacher("elena", "burdakova", "galerova", 124l);
        List<StudyGroup> studyGroups = new ArrayList<>(Arrays.asList(controller.FormirateGroup(teacher, 5),
                controller.FormirateGroup(teacher, 4),
                controller.FormirateGroup(teacher, 3)));

        controller.SortStudent(studyGroups);

    }

}

