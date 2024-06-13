package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class School {
     class Group {
        public static Scanner getScanner() {
            return new Scanner(in);
        }

        public static List<String> addGroups() {
            Scanner scanner = getScanner();
            List<String> groups = new ArrayList<>();
            while (groups.size() == 15) {
                System.out.println("Wpisz nazwe klasy");
                String className = scanner.nextLine();
                groups.add(className);
                System.out.println(groups);
            }
            return groups;
        }
    }
}
