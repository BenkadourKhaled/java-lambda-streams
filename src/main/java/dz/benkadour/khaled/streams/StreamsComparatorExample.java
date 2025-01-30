package dz.benkadour.khaled.streams;
import dz.benkadour.khaled.data.Student;
import dz.benkadour.khaled.data.StudentDataBase;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;
public class StreamsComparatorExample {


    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaReversed() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("*** Students Sorted By Name : ");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("------------------------------");

        System.out.println("*** Students Sorted By Gpa : ");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("------------------------------");

        System.out.println("*** Students Sorted By Gpa reversed : ");
        sortStudentsByGpaReversed().forEach(System.out::println);
        System.out.println("------------------------------");
    }

}
