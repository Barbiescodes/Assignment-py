public class StudentRecord {

    private String studentID;
    private String name;
    private String course;

    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

   
    public void displayInfo() {
        System.out.println("StudentID: " + studentID);
        System.out.println("Name:() " + name);
        System.out.println("Course: " + course);
    }

   
    public static void main(Stringargs) {
        StudentRecord student1 = new StudentRecord("S001", "John Doe", "Computer Science");
        student1.displayInfo();
    }
}