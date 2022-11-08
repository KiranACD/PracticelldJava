
class IntelligentStudent extends Student {
    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq(int iq) {
        return this.iq;
    }

    IntelligentStudent() {}

    IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public void print() {
        super.print();
        System.out.println(this.iq);
    }
}