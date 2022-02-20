package ss5_access_modifier_static_method.bai_tap.students;

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){
    }

    protected void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
