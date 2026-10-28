class Student {
    int studentId; 
    String studentName;
    String course;

    void displayDetails() {
        System.out.println(studentId);
        System.out.println(studentName); 
        System.out.println(course); 
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.displayDetails();
    }
}

