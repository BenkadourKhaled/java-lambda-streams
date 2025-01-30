package dz.benkadour.khaled.streams;

import dz.benkadour.khaled.data.Student;
import dz.benkadour.khaled.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        List<String> studentNames = StudentDataBase.getAllStudents()
                .stream()// Stream<Students>
                //Student As an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toList()); ///List<String>
        return studentNames;
    }

    public static Set<String> namesSet() {
        Set<String> studentNames = StudentDataBase.getAllStudents()
                .stream()// Stream<Students>
                //Student As an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toSet()); // Set<String>
        return studentNames;
    }

    public static void main(String[] args) {

        System.out.println(namesList());
        System.out.println("*******************");
        System.out.println(namesSet());

    }

}
