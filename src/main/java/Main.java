import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.controller.FormStadyGroup;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.view.StudyGroupView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.creatUser("Oleg", "Smirnov", "Nicolaevich");
        StudyGroupView studyGroupView = new StudyGroupView();
        FormStadyGroup formStadyGroup = new FormStadyGroup();
        List<User> listStudent = new ArrayList<>(Arrays.asList(new Student("Smirnov", "Oleg", "Nikolaevich", 1L),
                                                                  new Student("Polichuk", "Mariya", "Sergeeva", 2L),
                                                                  new Student("Pluhin", "Michail", "Vladimuirovich", 2L)));
        Teacher teacher = new Teacher("elena", "burdakova", "galerova", 124l);
        formStadyGroup.FormirateGroup(teacher, listStudent);

    }
}
