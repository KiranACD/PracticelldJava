public class Student implements Clonable<Student> {
    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatch() {
        return this.batch;
    }

    public void setaverageBatchPsp(double avgPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public double getaverageBatchPsp() {
        return this.averageBatchPsp;
    }

    public void setstudentPsp(double psp) {
        this.studentPsp = psp;
    }

    public double getstudentPsp() {
        return this.studentPsp;
    }

    Student() {}

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.studentPsp = student.studentPsp;
        this.averageBatchPsp = student.averageBatchPsp;
        this.batch = student.batch;
    }

    public Student clone() {
        return new Student(this);
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.batch);
        System.out.println(this.averageBatchPsp);
        System.out.println(this.studentPsp);
    }
}