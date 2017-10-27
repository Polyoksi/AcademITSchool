package ru.academits.polyakova.array;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Array {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Оксана" +
                "\\IdeaProjects\\AcademITSchool\\Array\\src\\ru\\academits\\polyakova" +
                "\\array\\input.txt"));
        ) {
            ArrayList<Integer> array = new ArrayList<>();
            while (scanner.hasNext()) {
                array.add(scanner.nextInt());
            }
            System.out.print(array);
            System.out.println();
            System.out.println("Удаление четных элементов: ");

            for (int i = array.size() - 1; i >= 0; i--) {
                if (array.get(i) % 2 == 0) {
                    array.remove(i);
                }
            }
            System.out.print(array);
            System.out.println();

            Set<Integer> hs = new LinkedHashSet<>();
            hs.addAll(array);
            array.clear();
            array.addAll(hs);
            System.out.println("Удаление повторений: ");
            System.out.print(array);
        }
    }
}
