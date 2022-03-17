package case_study_module2.services.impl;

import case_study_module2.controllers.EmployeeController;
import case_study_module2.models.enums.Levels;
import case_study_module2.models.enums.Position;
import case_study_module2.models.person.Employee;
import case_study_module2.services.IEmployeeService;


import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {

    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();
    EmployeeController employeeController = new EmployeeController();
//    static {
//        employees.add(new Employee("1","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
//        employees.add(new Employee("2","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
//        employees.add(new Employee("3","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
//    }



    @Override
    public void add() {
        employees.add(employeeController.getEmployeeInput());
//        System.out.println("Employee Id");
//        String id = sc.nextLine();
//
//        System.out.println("Full name:");
//        String fullName = sc.nextLine();
//
//        System.out.println("Day of birth:");
//        String dob = sc.nextLine();
//
//        System.out.println("Gender:");
//        String gender = sc.nextLine();
//
//        System.out.println("Passport");
//        long idPassport = Long.parseLong(sc.nextLine());
//        System.out.println("Phone Number");
//
//        String phoneNumber = sc.nextLine();
//        System.out.println("Email");
//
//        String email = sc.nextLine();
//
//        for (int i = 0; i < Position.values().length ; i++) {
//            System.out.println(i+" : "+Position.values()[i]);
//        }
//        System.out.println("Position:");
//        int test = Integer.parseInt(sc.nextLine());
//        Position position = Position.values()[test];
//
//        System.out.println("Education level:");
//
//        for (int i = 0; i < Levels.values().length; i++) {
//            System.out.println(i+" : "+Levels.values()[i]);
//        }
//        int test1 = Integer.parseInt(sc.nextLine());
//        Levels level = Levels.values()[test1];
//
//
//
//        System.out.println("Salary: ");
//        double salary = Double.parseDouble(sc.nextLine());
//
//        Employee employee = new Employee(id,fullName,dob,gender,idPassport,phoneNumber,email,level,position,salary);
//        employees.add(employee);
    }

    @Override
    public void show() {
        for (Employee employee: employees
             ) {
            System.out.println(employee);
        }
    }

    @Override
    public void update() {
        System.out.println("Enter Employee ID");
        String id = sc.nextLine();
        for(int i = 0 ; i<employees.size();i++){

            if(employees.get(i).getId().equals(id)){
                Employee employee = employees.get(i);
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
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1: System.out.println("Enter your change: ");
                    
                    employees.get(i).setFullName(sc.nextLine());break;

                    case 2: System.out.println("Enter your change: ");

                    employees.get(i).setGender(employeeController.genderInput());break;
                    case 3:
                        for (int j = 0; j < Levels.values().length; j++) {
                            System.out.println(j+" : "+Levels.values()[j]);
                        };
                        employee.setEducationLevel(Levels.values()[Integer.parseInt(sc.nextLine())]);
                        break;
                    case 4:
                        for (int j = 0; j < Position.values().length; j++) {
                            System.out.println(j+" : "+Position.values()[j]);
                        };
                        employee.setWorkPosition(Position.values()[Integer.parseInt(sc.nextLine())]);
                        ;break;
                    case 5: System.out.println("Enter your change: ");
                    employee.setPassportID(sc.nextLine());break;
                    case 6: System.out.println("Enter your change: ");
                    employee.setPhoneNumber(sc.nextLine());break;
                    case 7: System.out.println("Enter your change: ");
                    employee.setEmail(sc.nextLine());break;
                    case 8: System.out.println("Enter your change: ");
                    employee.setSalary(Double.parseDouble(sc.nextLine()));break;
                    case 0:break;
                    default:
                        System.out.println("Wrong input! Re-type");
                }
            }
        }
    }
}
