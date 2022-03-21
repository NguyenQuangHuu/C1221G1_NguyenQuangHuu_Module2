package case_study_module2.controllers;

import case_study_module2.models.enums.Levels;
import case_study_module2.models.enums.Position;
import case_study_module2.models.facility.House;
import case_study_module2.models.person.Employee;
import case_study_module2.models.person.Person;

import java.util.ArrayList;
import java.util.List;

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



    public List<String> writeEmployeeToCSV(List<Employee> employees){
        List<String> stringList = new ArrayList<>();
        for (Employee employee:
                employees) {
            stringList.add(employee.personToString());
        }
        return stringList;
    }


    public void employeeEdit(Employee employee){
        System.out.println("What you want edit:\n" +
                "1. Name\n" +
                "2. Gender\n" +
                "3. Academic Level\n" +
                "4. Job Position\n" +
                "5. Passport Id\n" +
                "6. Phone Number\n" +
                "7. Email\n" +
                "8. Salary\n" +
                "0. Exit Edit\n" +
                "Your choice:");
        String choose = sc.nextLine();
        while(!validate.positiveNumberValidate(choose) || Integer.parseInt(choose)<0 || Integer.parseInt(choose)>8){
            System.out.println("Wrong input! Re-type");
            choose = sc.nextLine();
        }
        switch (choose) {
            case "1":
                System.out.println("Enter your change: ");

                employee.setFullName(nameInput());
                break;

            case "2":
                System.out.println("Enter your change: ");

                employee.setGender(genderInput());
                break;
            case "3":
//                for (int j = 0; j < Levels.values().length; j++) {
//                    System.out.println(j + " : " + Levels.values()[j]);
//                }
//                ;
                employee.setEducationLevel(levelInput());
                break;
            case "4":
                System.out.println("Enter your change: ");
//                for (int j = 0; j < Position.values().length; j++) {
//                    System.out.println(j + " : " + Position.values()[j]);
//                }
//                ;
                employee.setWorkPosition(positionInput());
                ;
                break;
            case "5":
                System.out.println("Enter your change: ");
                employee.setPassportID(passportInput());
                break;
            case "6":
                System.out.println("Enter your change: ");
                employee.setPhoneNumber(phoneNumberInput());
                break;
            case "7":
                System.out.println("Enter your change: ");
                employee.setEmail(emailInput());
                break;
            case "8":
                System.out.println("Enter your change: ");
                employee.setSalary(salaryInput());
                break;
            case "0":
                break;
        }
    }

}
