class Client {

    public static void fillRegistry(StudentRegistry registry) {
        IntelligentStudent aprBatchStudent = new IntelligentStudent();
        aprBatchStudent.setBatch("intApr21");
        aprBatchStudent.setaverageBatchPsp(89.0);

        registry.register("intApr21", aprBatchStudent);

    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student st1 = studentRegistry.get("intApr21").clone();
        st1.setName("Siddhart");
        st1.setAge(24);
        st1.setstudentPsp(91.0);
        if (st1 instanceof IntelligentStudent) {
            ((IntelligentStudent) st1).setIq(180);
        }

        st1.print();
    }
}