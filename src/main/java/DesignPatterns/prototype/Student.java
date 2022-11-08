
public class Student implements Clonable<Student> {
    int age;
    String name;
    String batch;
    double averageBatchPsp;
    double studentPsp;

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

    public Student clone() {
        Student copy = new Student();
        copy.age = this.age;
        copy.name = this.name;
        copy.batch = this.batch;
        copy.averageBatchPsp = this.averageBatchPsp;
        copy.studentPsp = this.studentPsp;
        return copy;
    }
}