package bai_tap.student_management.common.teacher;

import bai_tap.student_management.model.Teacher;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.List;

public class ReadFile extends Teacher {
    public ReadFile(String id, String name, LocalDate birthDate, String email, String phoneNumber, String level) {
        super(id, name, birthDate, email, phoneNumber, level);
    }

    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("persons.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            List<Teacher> teacherList = (List<Teacher>) objectIn.readObject();
            System.out.println("The list of Person objects has been deserialized from persons.ser");
            for (Teacher ignored : teacherList) {
                boolean Teacher = false;
                System.out.println(Teacher);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
