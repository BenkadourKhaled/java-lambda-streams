package dz.benkadour.khaled.streams;

import dz.benkadour.khaled.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.9);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa() >= 4.1);
    }


    public static void main(String[] args) {

        System.out.println("Result Of All Match : " + allMatch());
        System.out.println("***********************************");
        System.out.println("Result Of Any Match : " + anyMatch());
        System.out.println("***********************************");
        System.out.println("Result Of None Match : " + anyMatch());

    }

}
