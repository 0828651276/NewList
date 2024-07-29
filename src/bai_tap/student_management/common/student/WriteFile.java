package bai_tap.student_management.common.student;

import bai_tap.student_management.model.Student;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile extends Student {
    public static void main(String[] args) {
        try (FileOutputStream fileOut = new FileOutputStream("persons.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            Object studentList = new Object();
            objectOut.writeObject(studentList);
            System.out.println("The list of Person objects has been serialized to persons.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
