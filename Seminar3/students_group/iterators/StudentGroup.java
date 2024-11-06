package Seminar3.students_group.iterators;

import Seminar3.student.comparators.CompareStudentByAge;
import Seminar3.student.comparators.CompareStudentByName;
import Seminar3.student.Student;
import Seminar3.students_group.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> list;


    public StudentGroup() {
        list = new ArrayList<>();
    }


    public void addStudent(Student student){
        list.add(student);
    }


    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(list);
//        return list.listIterator()
    }

    public void sortByName(){
        list.sort(new CompareStudentByName());
    }

    public void sortByAge(){
        list.sort(new CompareStudentByAge());
    }

}
