package dz.benkadour.khaled.streams;

import dz.benkadour.khaled.data.Student;
import dz.benkadour.khaled.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printStudentsActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        return studentActivities;
    }

    public static Long printStudentsActivitiesCount() {
        Long noOfStudentActivities = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)
                .distinct() // Stream<String> --> With distinct Function performed
                .count();
        return noOfStudentActivities;
    }

    public static void main(String[] args) {

        System.out.println(printStudentsActivities());
        System.out.println("***************************");
        System.out.println(printStudentsActivitiesCount());

    }

}
