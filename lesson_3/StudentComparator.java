package lesson_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    public int compare(Student student, Student anotherStudent) {

        //if (student.getAverage() > anotherStudent.getAverage()) return -1;
        //if (student.getAverage() < anotherStudent.getAverage()) return 1;


        if (student.getLastName().length() > anotherStudent.getLastName().length()) {
            return -1;

        } else if (student.getLastName().length() < anotherStudent.getLastName().length()) {
            return 1;
        }
        return 0;
    }
    
}
