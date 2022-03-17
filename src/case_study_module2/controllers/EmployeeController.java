package case_study_module2.controllers;

import case_study_module2.models.enums.Levels;
import case_study_module2.models.enums.Position;
import case_study_module2.models.person.Employee;

public class EmployeeController extends  PersonControllers{
    protected Levels educationLevel;
    protected Position workPosition;
    protected double salary;

    public Employee getEmployeeInput(){
        super.getInformation();
        this.educationLevel = levelInput();
        this.workPosition = positionInput();
        this.salary = salaryInput();
        return new Employee(super.id,fullName,dayOfBirth,gender,passportId,phoneNumber,email,educationLevel,workPosition,salary);
    }

    public Levels levelInput(){
        for (int i = 0; i < Levels.values().length; i++) {
            System.out.println((i+1)+" : "+Levels.values()[i]);
        }
        System.out.println("Your select:");
        int index = Integer.parseInt(sc.nextLine());
        return Levels.values()[index-1];
    }

    public Position positionInput(){
        for (int i = 0; i < Position.values().length; i++) {
            System.out.println((i+1)+" : "+Position.values()[i]);
        }
        System.out.println("Your select:");
        int index = Integer.parseInt(sc.nextLine());
        return Position.values()[index-1];
    }

    public double salaryInput(){
        System.out.println("Enter his/her salary: ");
        String salary;
        do{
            salary = sc.nextLine();
            if(!validate.positiveTensNumberValidate(salary)){
                System.out.println("Wrong format ! Re-type");
            }
        }while(!validate.positiveTensNumberValidate(salary));
        return Double.parseDouble(salary);
    }
}
