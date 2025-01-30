package dz.benkadour.khaled.streams;
import dz.benkadour.khaled.data.Student;
import dz.benkadour.khaled.data.StudentDataBase;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;

public class StreamsFilterExamples {

    public static List<Student> filterStudents() {
        Predicate<Student> predicateGender = (student -> student.getGender().equals("female"));
        Predicate<Student> predicateGpa = (student -> student.getGpa() >= 3.9);
        return StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .filter(predicateGender) //Stream<Student> -> Filters and sends only the students whose gender is female
                .filter(predicateGpa)
                .collect(toList());
    }

    public static void main(String[] args) {

        filterStudents().forEach(System.out::println);

    }

}
