package dz.benkadour.khaled.streams;

import dz.benkadour.khaled.data.Student;
import dz.benkadour.khaled.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        // Student name and activities in map
        Predicate<Student> studentPredicate = (name) -> name.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = (name) -> name.getGpa() >= 3.9;
        Map<String, List<String>> studentsMap = StudentDataBase.getAllStudents()
                .stream()
                .peek((student -> {
                    System.out.println( "---------"+ student);
                }))
                .filter(studentPredicate)
                .peek((student -> {
                    System.out.println( "** After First Filter **"+ student);
                }))
                .filter(studentGpaPredicate)
                .peek((student -> {
                    System.out.println( "// After Second Filter //"+ student);
                }))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentsMap);
    }

}
