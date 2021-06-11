package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Saur Tregulov", 4, 7.5);
        Student st2 = new Student("Migkail Ivanov", 2, 8.5);
        Student st3 = new Student("Elena Sidoeova", 1, 9.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        System.out.println("--------------------------------------");
        return students;
    }


}
