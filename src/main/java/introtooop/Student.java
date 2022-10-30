package main.java.introtooop;

public class Student {
    int age;
    String name;
    String batch;
    double psp;
    void changeBatch(String newBatch) {
        batch = newBatch;
    }

    void giveMockInterview() {
        System.out.println("Giving mock interview");
    }
}