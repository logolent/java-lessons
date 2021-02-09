package task6;

import java.util.Arrays;
import java.util.List;

public class Student {
  private String name;
  private String group;
  private int course;
  private int[] subjectGrades;

  Student(String name, String group, int course, int[] subjectGrades) {
    this.name = name;
    this.group = group;
    this.course = course;
    this.subjectGrades = subjectGrades;
  }

  public String getName() {
    return name;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public double getAverageGrade() {
    return Arrays.stream(subjectGrades).average().getAsDouble();
  }

  public static void checkStudents(List<Student> students) {
    for (int i = students.size() - 1; i >= 0; i--) {
      Student student = students.get(i);
      if (student.getAverageGrade() < 3.0) {
        students.remove(student);
      } else {
        student.setCourse(student.getCourse() + 1);
      }
    }
  }

  public static void printStudents(List<Student> students, int course) {
    for (Student student : students) {
      if (student.getCourse() == course) {
        System.out.println(student.getName());
      }
    }
  }
}
