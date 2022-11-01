package main.java.inheritance;

public class Instructor extends User {
    String batchName;
    double averageRating;

    public void scheduleClass() {
        System.out.println("Scheduling a class...");
    }
}