class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String studentId, String name, int age, String major) {
        super(studentId, name, age);
        this.major = major;
    }

    @Override
    public double calculateGPA() {
        return 7.1;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + calculateGPA());
    }
}
