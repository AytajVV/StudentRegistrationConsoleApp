/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Student;
import java.util.Scanner;
import main.Config;

/**
 *
 * @author aytaj.veyisli
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("Name");
        String surname = InputUtil.requireText("Surname");
        int age = InputUtil.requireNumber("Age");
        String className = InputUtil.requireText("Class Name");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i + 1) + ". " + st.getFullInfo());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students would you like register?");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Registration is done successfully");
        StudentUtil.printAllRegisteredStudents();
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("name, surname or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }

        }

        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found] = st;
                found++;
            }

        }
        return result;
    }

    public static void updateStudentWithNewObject() {
        StudentUtil.printAllRegisteredStudents();

        int i = InputUtil.requireNumber("Nechenci telebede deyishiklik etmek isteyirsiniz? ");

        System.out.println("Yeni melumatlari daxil edin: ");

        Student s = StudentUtil.fillStudent();
        Config.students[i - 1] = s;

    }

    public static void updateStudentWithSplit() {
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requireNumber("Nechenci telebede deyishiklik etmek isteyirsiniz? ");

        System.out.println("Yeni melumatlari daxil edin: ");
        //Student s = StudentUtil.fillStudent();
        Student selectedStudent = Config.students[i - 1];
        String changeParams = InputUtil.requireText("Neyi deyishmek isteyirsiz? meselen : name,surname,age,classname");

        String[] parameters = changeParams.split(",");
        for (int j = 0; j < parameters.length; j++) {
            String param = parameters[i];
            if (param.equalsIgnoreCase("name")) {
                selectedStudent.setName(InputUtil.requireText("Name"));
            }else if (param.equalsIgnoreCase("surname")) {
                selectedStudent.setSurname(InputUtil.requireText("Surname"));
            }else if (param.equalsIgnoreCase("age")) {
                selectedStudent.setAge(InputUtil.requireNumber("Age"));
            }else if (param.equalsIgnoreCase("classname")) {
                selectedStudent.setClassName(InputUtil.requireText("Class name"));
            }
        }

    }

    public static void updateStudentWithSameObject() {
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requireNumber("Nechenci telebede deyishiklik etmek isteyirsiniz? ");

        System.out.println("Yeni melumatlari daxil edin: ");
        //Student s = StudentUtil.fillStudent();
        Student selectedStudent = Config.students[i - 1];
        String changeParams = InputUtil.requireText("Neyi deyishmek isteyirsiz? meselen : 'name', 'surname', 'age', 'classname' ");

        if (changeParams.contains("'name'")) {
            selectedStudent.setName(InputUtil.requireText("Name"));
        }

        if (changeParams.contains("'surname'")) {
            selectedStudent.setSurname(InputUtil.requireText("Surname"));
        }

        if (changeParams.contains("'age'")) {
            selectedStudent.setAge(InputUtil.requireNumber("Age"));
        }

        if (changeParams.contains("'classname'")) {
            selectedStudent.setClassName(InputUtil.requireText("Class name"));
        }

    }
}
