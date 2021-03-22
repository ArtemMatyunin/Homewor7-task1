package ru.matyunin.inno.homework7.task1;

import java.util.Comparator;

public class IgnoreCaseComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
