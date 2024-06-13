package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Group {
    public static Scanner getScanner() {
        return new Scanner(in);
    }

    public static List<String> school() {
        Scanner scanner = getScanner();
        List<String> groups = new ArrayList<>();
        while (groups.size() == 33) {
            System.out.println("Wpisze imie i nazwisko ucznia:");
            String studentName = scanner.nextLine();
            groups.add(studentName);
            System.out.println(groups);
        }
        return groups;
    }
}
