package ss5_access_modifier_static_method.thuc_hanh.static_method;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BMIT";
    Student(int r,String name){
        this.rollNo = r;
        this.name = name;
    }

    static void change(){
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student  student1 = new Student(123,"Nam");
        Student  student2 = new Student(234,"Nữ");
        Student  student3 = new Student(345,"LGBT");
        student1.display();
        student2.display();
        student3.display();
    }
}

