package main.java.accessModifiers;

public class Client {
    
    public static void main(String[] args) {
        Student student = new Student();
        // Cannot access name from here as it is private
        student.batchId = 123;
        student.psp = 100.0;
        student.universityName = "DEF";
    }
}