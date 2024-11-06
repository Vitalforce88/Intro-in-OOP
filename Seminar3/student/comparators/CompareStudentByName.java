package Seminar3.student.comparators;

import Seminar3.student.Student;

import java.util.Comparator;

public class CompareStudentByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
