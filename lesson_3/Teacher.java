package lesson_3;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;
    private String lastName;
    private List<StudentGroup> groups;

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

       
    }

    public String toString() {
        return String.format("Name: %s  Lastname: %s", name, lastName);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void addGroup(StudentGroup studentGroup) {
        groups.add(studentGroup);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public int getNumberOfGroups() {
        return groups.size();
    }

}