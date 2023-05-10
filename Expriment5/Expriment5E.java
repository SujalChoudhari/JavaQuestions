import java.util.Scanner;

class Student {

  public int id;
  public String name;
  public int mathMarks;
  public int physicsMarks;
  public int chemistryMarks;
  public int total;

  Student(int id, String name, int math, int physics, int chem) {
    this.id = id;
    this.name = name;
    this.mathMarks = math;
    this.physicsMarks = physics;
    this.chemistryMarks = chem;

    this.total = math + physics + chem;
  }
}

public class Expriment5E {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of students:");
    int size = sc.nextInt();
    Student[] students = new Student[size];

    for (int i = 0; i < size; i++) {
      System.out.println(
        "Enter a Student details: id, name, math, physics, chemistry "
      );
      students[i] =
        new Student(
          sc.nextInt(),
          sc.next(),
          sc.nextInt(),
          sc.nextInt(),
          sc.nextInt()
        );
    }

    for (int i = 0; i < students.length; i++) {
      for (int j = 0; j < students.length - 1; j++) {
        if (students[i].total > students[j].total) {
          Student temp = students[i];
          students[i] = students[j];
          students[j] = temp;
        }
      }
    }

    for (Student s : students) {
      System.out.println(s.id + ":" + s.name + " -> " + s.total);
    }
  }
}
