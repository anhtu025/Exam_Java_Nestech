class InternationalStudent extends UndergraduateStudent {
    private String country;

    public InternationalStudent(String studentId, String name, int age, String major, String country) {
        super(studentId, name, age, major);
        this.country = country;
    }

    @Override
    public double calculateGPA() {
        return 7.5;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Country: " + country);
        System.out.println("GPA: " + calculateGPA());
    }
}
