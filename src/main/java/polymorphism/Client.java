package main.java.polymorphism;

public class Client {

    public static void main(String[] args) {
        A a = new C();
        a.companyName = "Google"; // This should be an error.
    }
}