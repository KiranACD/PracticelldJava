//package main.java.DesignPatterns.builder;

public class Builder {
    
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;
    
    public String getName(){
        return this.name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge(){
        return this.age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public double getPsp(){
        return this.psp;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public String getunivName(){
        return this.univName;
    }

    public Builder setUnivName(String univName) {
        this.univName = univName;
        return this;
    }
    
    public String getBatch(){
        return this.batch;
    }

    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public long getId(){
        return this.id;
    }

    public Builder setId(long id) {
        this.id = id;
        return this;
    }

    public int getgradYear(){
        return this.gradYear;
    }

    public Builder setgradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Student build() {
        // Validation begins
        if (this.gradYear > 2022) {
            throw new IllegalArgumentException("Grad year cannot be greater than 2022");
        }
        // Validation ends
        return new Student(this);
    }
}
