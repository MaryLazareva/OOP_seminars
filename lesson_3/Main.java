package lesson_3;
//Создать класс Студент
//Создать класс УчебнаяГруппаИтератор
//Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
//Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Петров"));
        students.add(new Student("Василий", "Соловьев"));
        students.add(new Student("Михаил", "Марков"));
        students.add(new Student("Екатерина", "Ветрова"));
        students.add(new Student("Владислав", "Листьев"));
        students.add(new Student("Мария", "Петрова"));

        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Иван", "Иванов");
        Teacher teacher2 = new Teacher("Петр", "Петров");
        Teacher teacher3 = new Teacher("Сергей", "Сергеев");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        // StudentGroup group1 = new StudentGroup(1, teacher1);
        // StudentGroup group2 = new StudentGroup(2, teacher2);
        // StudentGroup group3 = new StudentGroup(3, teacher3);
        // StudentGroup group4 = new StudentGroup(4, teacher3);
        // StudentGroup group5 = new StudentGroup(5, teacher3);
        StudentGroup group6 = new StudentGroup(6, teacher1);

        //teacher1.addGroup(group6);
        System.out.println(group6);
        //System.out.println(teacher1.getGroups().get(0).getGroupNumber());
        //System.out.println(teacher1.getNumberOfGroups());
        // teacher2.getNumberOfGroups();
        // teacher3.getNumberOfGroups();


        Collections.sort(teachers, new TeacherComparator());

        TeacherIterator teacherIterator = new TeacherIterator(teachers);
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next());
        }
    }
          
}
