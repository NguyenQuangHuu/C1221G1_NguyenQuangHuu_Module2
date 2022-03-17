package demo_case_study.services.impl;


import demo_case_study.models.person.AcademicLevel;
import demo_case_study.models.person.Employee;
import demo_case_study.models.person.Position;
import demo_case_study.services.IEmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {

    final String RECEPTIONIST = "Lễ tân";
    final String WAITER = "Phục vụ";
    final String SPECIALIST = "Chuyên viên";
    final String SUPERVISOR = "Giám sát";
    final String MANAGER = "Quản lý";
    final String DIRECTOR = "Giám đốc";

    final String INTERMEDIATE = "Trung cấp";
    final String ASSOCIATE = "Cao đẳng";
    final String UNIVERSITY = "Đại học";
    final String POSTGRADUATE = "Sau đại học";



    public ArrayList<Position> khoiTaoMangViTri(){
        ArrayList<Position> positions = new ArrayList<>();
        positions.add(new Position(RECEPTIONIST));
        positions.add(new Position(WAITER));
        positions.add(new Position(SPECIALIST));
        positions.add(new Position(SUPERVISOR));
        positions.add(new Position(MANAGER));
        positions.add(new Position(DIRECTOR));
        return positions;
    }

    public ArrayList<AcademicLevel> khoiTaoMangTrinhDo(){
        ArrayList<AcademicLevel> academicLevels = new ArrayList<>();
        academicLevels.add(new AcademicLevel(INTERMEDIATE));
        academicLevels.add(new AcademicLevel(ASSOCIATE));
        academicLevels.add(new AcademicLevel(UNIVERSITY));
        academicLevels.add(new AcademicLevel(POSTGRADUATE));
        return academicLevels;

    }


    Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("1","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
        employees.add(new Employee("2","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
        employees.add(new Employee("3","Nguyễn Văn A","12/12","Nam",123456789,"0987654321","abc@gmail.com",new AcademicLevel("Trung cấp"),new Position("Trung cấp"),320000.0));
    }


    @Override
    public void add() {
        ArrayList<Position> positionArrayList = khoiTaoMangViTri();

        ArrayList<AcademicLevel> academicLevelArrayList = khoiTaoMangTrinhDo();

        System.out.println("Employee Id");
        String id = sc.nextLine();
        System.out.println("Full name:");
        String fullName = sc.nextLine();
        System.out.println("Day of birth:");
        String dob = sc.nextLine();
        System.out.println("Gender:");
        String gender = sc.nextLine();
        System.out.println("Passport");
        long idPassport = Long.parseLong(sc.nextLine());
        System.out.println("Phone Number");
        String phoneNumber = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();

        for (int i = 0; i < positionArrayList.size() ; i++) {
            System.out.println(i+" : "+positionArrayList.get(i));
        }
        System.out.println("Position:");
        int test = Integer.parseInt(sc.nextLine());
        Position position = positionArrayList.get(test);

        System.out.println("Education level:");

        for (int i = 0; i < academicLevelArrayList.size() ; i++) {
            System.out.println(i+" : "+academicLevelArrayList.get(i));
        }
        AcademicLevel level = academicLevelArrayList.get(Integer.parseInt(sc.nextLine()));



        System.out.println("Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        Employee employee = new Employee(id,fullName,dob,gender,idPassport,phoneNumber,email,level,position,salary);
        employees.add(employee);
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
        System.out.println("Nhập mã nhân viên muốn chỉnh sửa");
        ArrayList<AcademicLevel> academicLevels = khoiTaoMangTrinhDo();
        ArrayList<Position> positionArrayList = khoiTaoMangViTri();
        String id = sc.nextLine();
        for(int i = 0 ; i<employees.size();i++){
            if(employees.get(i).getId().equals(id)){
                System.out.println("Nhập vị trí thông tin muốn chỉnh sửa:\n" +
                        "1. Họ tên\n" +
                        "2. Giới tính\n" +
                        "3. Trình độ học vấn\n" +
                        "4. Vị trí làm việc\n" +
                        "5. Số CMND\n" +
                        "6. Số điện thoại\n" +
                        "7. Email\n" +
                        "8. Lương cơ bả\n" +
                        "0. Thoát chỉnh sửa\n" +
                        "Nhập lựa chọn của bạn:");
                int choose = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập chỉnh sửa của bạn: ");
                switch (choose){
                    case 1: employees.get(i).setFullName(sc.nextLine());break;
                    case 2: employees.get(i).setGender(sc.nextLine());break;
                    case 3:
                        for (int j = 0; j < academicLevels.size(); j++) {
                            System.out.println(j+" : "+academicLevels.get(j).getAcademicLevel());
                        };
                        employees.get(i).setEducationLevel(academicLevels.get(Integer.parseInt(sc.nextLine())));
                        break;
                    case 4:
                        for (int j = 0; j < positionArrayList.size(); j++) {
                            System.out.println(j+" : "+positionArrayList.get(j).getPosition());
                        };
                        employees.get(i).setWorkPosition(positionArrayList.get(Integer.parseInt(sc.nextLine())));
                        ;break;
                    case 5: employees.get(i).setPassportID(Long.parseLong(sc.nextLine()));break;
                    case 6: employees.get(i).setPhoneNumber(sc.nextLine());break;
                    case 7: employees.get(i).setEmail(sc.nextLine());break;
                    case 8: employees.get(i).setSalary(Double.parseDouble(sc.nextLine()));break;
                    case 0:break;
                    default:
                        System.out.println("Sai đầu vào");
                }
            }
        }
    }
}
