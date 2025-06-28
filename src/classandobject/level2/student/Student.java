package classandobject.level2.student;

public class Student {
    // Attributes of the Student class
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize the Student object
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    public char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 40)
            return 'D';
        else
            return 'F';
    }

    // Method to display details and grade
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}