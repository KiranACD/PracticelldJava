
class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("Apr21");
        aprBatchStudent.setaverageBatchPsp(89.0);

        registry.register("Apr21", aprBatchStudent);

    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student st1 = studentRegistry.get("Apr21").clone();
        st1.setName("Siddhart");
        st1.setAge(24);
        st1.setstudentPsp(91.0); 
    }
}