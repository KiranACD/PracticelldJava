package main.java.accessModifiersCheck;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        // Cannot access name
        // Cannot access batchId as it has default accessmodifier
        // Cannot access psp as it is protected. If client is a child class of Student, then can access
        student.universityName = "FGH";
    }
}