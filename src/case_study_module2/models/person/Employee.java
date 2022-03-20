package case_study_module2.models.person;

import case_study_module2.models.enums.Gender;
import case_study_module2.models.enums.Levels;
import case_study_module2.models.enums.Position;

public class Employee extends Person {
    private Levels educationLevel;
    private Position workPosition;
    private double salary;


    public Employee() {
    }

    public Employee(String id, String fullName, String dayOfBirth, Gender gender, String passportID, String phoneNumber, String email, Levels educationLevel, Position workPosition, double salary) {
        super(id, fullName, dayOfBirth, gender, passportID, phoneNumber, email);
        this.educationLevel = educationLevel;
        this.workPosition = workPosition;
        this.salary = salary;
    }


    public Levels getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Levels educationLevel) {
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
        return super.toString()+ " Employee{" +
                "educationLevel=" + educationLevel +
                ", workPosition=" + workPosition +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String personToString() {
        return super.personToString()+
                " ,"+getEducationLevel()+
                " ,"+getWorkPosition()+
                " ,"+getSalary();
    }
}
