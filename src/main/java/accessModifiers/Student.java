package main.java.accessModifiers;

public class Student {
    private String name;
    int batchId;
    protected double psp;
    public String universityName;

    void changeBatch(int newBatchId) {
        name = "Naman";
        batchId = newBatchId;
        psp = 90.0;
        universityName = "ABC";
    }
}
