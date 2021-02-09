package task6;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>(List.of(new Student[] {
        new Student("Student 1", "Group 1", 1, new int[] { 5, 3, 4, 5, 1 }),
        new Student("Student 2", "Group 2", 1, new int[] { 5, 3, 5, 1, 5 }),
        new Student("Student 3", "Group 3", 1, new int[] { 3, 5, 1, 5, 5 }),
        new Student("Student 4", "Group 4", 1, new int[] { 4, 4, 2, 5, 5 }),
        new Student("Student 5", "Group 5", 1, new int[] { 1, 1, 3, 3, 4 }),
    }));

    Student.checkStudents(studentList);
    Student.printStudents(studentList, 2);
  }
}
