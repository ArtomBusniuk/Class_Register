package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class StudentService {
    public static Scanner getScanner() {
        return new Scanner(in);
    }
    public static List<String> addStudents() {
        Scanner scanner = getScanner();
        List<String> studentsList = new ArrayList<>();
        while (true) {
            System.out.println("Wpisze imie i nazwisko ucznia:");
            String studentName = scanner.nextLine();
            studentsList.add(studentName);
            System.out.println(studentsList);
        }
    }
}
