package ss5_access_modifier_static_method.bai_tap.students;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Cena");
        student.setClasses("WWE");
        //Không thể tham chiếu đến phương thức ở class Student từ biến tham chiếu student
        System.out.println(student.toString());
    }
}
