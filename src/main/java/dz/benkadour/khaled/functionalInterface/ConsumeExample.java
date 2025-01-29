package dz.benkadour.khaled.functionalInterface;

import dz.benkadour.khaled.data.Student;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import static dz.benkadour.khaled.data.StudentDataBase.getAllStudents;

public class ConsumeExample {
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
    public static void printName() {
        List<Student> students = getAllStudents();
        students.forEach(c2);
    }

    public static void printNameAndActivities() {

        List<Student> students = getAllStudents();
        students.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesUsingCondition() {
        List<Student> students = getAllStudents();
        students.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c3.andThen(c4).accept(student);
            }
        }));
    }


    public static void main(String[] args) {

        printName();
        System.out.println("************************************");
        printNameAndActivities();
        System.out.println("************************************");
        printNameAndActivitiesUsingCondition();
    }

}
