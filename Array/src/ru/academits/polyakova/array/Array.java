package ru.academits.polyakova.array;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Оксана" +
                "\\IdeaProjects\\AcademITSchool\\Array\\src\\ru\\academits\\polyakova" +
                "\\array\\input.txt"));
        ) {
            while (scanner.hasNext()) {
                String string = scanner.nextLine();
                String[] numbers = string.split(", ");
                for (String e : numbers) {
                    System.out.print(e + " ");
                }
                System.out.println();
                int[] array = new int[numbers.length];
                for (String i : numbers) {
                    for (int e : array) {
                        e = Integer.parseInt(i);
                        System.out.print(e + " ");
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        array[j] = Integer.parseInt(numbers[i]);

                    }
                }
                for (int e : array) {
                    System.out.print(e + " ");
                }

            }
        }

    }
}
