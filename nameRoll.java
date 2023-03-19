public class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ashish";
        student.roll_no = 120;
        System.out.println("Name: " + student.name);
        System.out.println("Roll No.: " + student.roll_no);
    }
}
