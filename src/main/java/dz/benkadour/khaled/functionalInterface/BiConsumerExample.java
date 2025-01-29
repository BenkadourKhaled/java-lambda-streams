package dz.benkadour.khaled.functionalInterface;

import dz.benkadour.khaled.data.Student;
import dz.benkadour.khaled.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name + " : " + activities);
        };
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("A : " + a + ", B : " + b);
        };

        biConsumer.accept("JAVA7", "JAVA8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication is : " + (a*b));
        };
        multiply.accept(10, 20);


        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("Division is : " + (a/b));
        };
        division.accept(20, 10);

        System.out.println("----------------------------------------");
        multiply.andThen(division).accept(10, 5);
        System.out.println("----------------------------------------");

        nameAndActivities();

    }

}
