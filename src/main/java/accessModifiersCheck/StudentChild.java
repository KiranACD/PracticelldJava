package main.java.accessModifiersCheck;

import accessModifiers.Student;

public class StudentChild extends Student {

    public void doSomething() {
        this.psp = 91.0;
        this.universityName = "IJK";
        // Cannot access this.name
        // Cannot access this.batchId
    }

    public static void main(String[] args){
        Student st = new Student();
        // Cannot access st.psp here
        // Cannot access st.name
        // Cannot access st.batchId
        st.universityName = "LMN";
    }

}