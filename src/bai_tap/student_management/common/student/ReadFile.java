package bai_tap.student_management.common.student;

import bai_tap.student_management.model.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadFile extends Student {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("persons.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            List<Student> studentList = (List<Student>) objectIn.readObject();
            System.out.println("The list of Person objects has been deserialized from persons.ser");
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

