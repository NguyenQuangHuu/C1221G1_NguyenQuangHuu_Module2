package demo_case_study.models.person;

public class Employee extends Person {
    private AcademicLevel educationLevel;
    private Position workPosition;
    private double salary;


    public Employee() {
    }

    public Employee(String id, String fullName, String dayOfBirth, String gender, long passportID, String phoneNumber, String email, AcademicLevel educationLevel, Position workPosition, double salary) {
        super(id, fullName, dayOfBirth, gender, passportID, phoneNumber, email);
        this.educationLevel = educationLevel;
        this.workPosition = workPosition;
        this.salary = salary;
    }

    public AcademicLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(AcademicLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Position getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(Position workPosition) {
        this.workPosition = workPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Mã nhân viên :" + this.getId() + " , họ và tên: " + this.getFullName() + " , giới tính: " + this.getGender() + " , trình độ học vấn " + this.getEducationLevel() + " , chức vụ: " + this.getWorkPosition() + " , CMND : " + this.getPassportID() + " , số điện thoại: " + this.getPhoneNumber() + " , email: "+this.getEmail();
    }
}
