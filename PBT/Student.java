class Student {
    public String name;
    public String studentClass;
    public int[] marks = new int[5];

    public Student(String name, String studentClass, int[] marks) throws MarksException {
        this.name = name;
        this.studentClass = studentClass;
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new MarksException("Invalid Processing: Marks must be between 0 and 100.");
            }
        }
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public int[] getMarks() {
        return marks;
    }
}
