package ru.matyunin.inno.homework7.task1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        final String inputFile = "input.txt";

        //используем TreeSet для исключения повторения слов, для сортировки используем собственный Comparator IgnoreCaseComparator
        Set<String> wordsSet = new TreeSet<>(new IgnoreCaseComparator());

        //считываем слова из файла в TreeSet
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {
            while (bufferedReader.ready()) {
                wordsSet.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //выводим слова в файл
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(
                             new OutputStreamWriter(
                                     new FileOutputStream("result.txt")))) {
            for (String out : wordsSet) {
                bufferedWriter.write(out);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
