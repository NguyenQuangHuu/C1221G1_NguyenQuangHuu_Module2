package case_study_module2.services.impl;

import case_study_module2.controllers.EmployeeController;

import case_study_module2.models.person.Employee;
import case_study_module2.services.IEmployeeService;
import case_study_module2.utils.ReadAndWriteFile;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    final String EMPLOYEES_FILE = "src\\case_study_module2\\data\\employees.csv";

    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = readAndWriteFile.readFileEmployee(EMPLOYEES_FILE);
    EmployeeController employeeController = new EmployeeController();
//    static {
//        employees.add(new Employee("1","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
//        employees.add(new Employee("2","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
//        employees.add(new Employee("3","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
//    }




    @Override
    public void add() {
        employees.add(employeeController.getEmployeeInput());
        readAndWriteFile.writeFile(EMPLOYEES_FILE,employeeController.writeEmployeeToCSV(employees));
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
        employees.forEach(System.out::println);
        String id = sc.nextLine();
        boolean exist = false;
        while(!exist){
            while("".equals(id)){
                System.out.println("Wrong input! Please Re-type");
                id = sc.nextLine();
            }
            for (Employee employee : employees) {
                if (employee.getId().equals(id)) {
                    exist = true;
                    employeeController.employeeEdit(employee);
                }
            }
            if(!exist){
                System.out.println("No exist! Please re-type");
                id = sc.nextLine();
            }
        }

    }
}
