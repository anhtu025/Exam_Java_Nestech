class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String studentId, String name, int age, String researchTopic) {
        super(studentId, name, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public double calculateGPA() {
        return 7.2;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("GPA: " + calculateGPA());
    }
}
