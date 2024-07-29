package bai_tap.student_management.common.teacher;

import bai_tap.student_management.model.Teacher;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class WriteFile extends Teacher {
    public WriteFile(String id, String name, LocalDate birthDate, String email, String phoneNumber, String level) {
        super(id, name, birthDate, email, phoneNumber, level);
    }

    public static void main(String[] args) {
        try (FileOutputStream fileOut = new FileOutputStream("persons.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            Object teacherList = new Object();
            objectOut.writeObject(teacherList);
            System.out.println("The list of Person objects has been serialized to persons.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

