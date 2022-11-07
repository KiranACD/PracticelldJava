//package main.java.DesignPatterns.builder;

public class Client {
    
    public static void main(String[] args) {
        
        // Builder bld = new Builder();
        // bld.setAge(25);
        // bld.setName("Naman");
        // bld.setgradYear(2015);

        // Student st = new Student(bld);

        Student st = Student.getBuilder().setAge(25).setName("Naman").setgradYear(2015).build();
        System.out.println("Done");
    }
}