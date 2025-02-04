package dz.benkadour.khaled.streams;

import dz.benkadour.khaled.data.Student;
import dz.benkadour.khaled.data.StudentDataBase;

public class StreamMapReduceExample {


    private static int noOfNotBooks() {
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getNoteBooks) //Stream<Integer>
                //.reduce(0, (a, b) -> a + b);
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("noOfNoteBooks: " + noOfNotBooks());

    }

}
