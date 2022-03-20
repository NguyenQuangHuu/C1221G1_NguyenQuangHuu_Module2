package case_study_module2.controllers;

import case_study_module2.models.enums.Gender;
import case_study_module2.models.person.Employee;
import case_study_module2.models.person.Person;
import case_study_module2.utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonControllers {

    protected String id;
    protected String fullName;
    protected String dayOfBirth;
    protected Gender gender;
    protected String passportId;
    protected String phoneNumber;
    protected String email;

    public void getInformation() {
        this.id = idInput();
        this.fullName = nameInput();
        this.dayOfBirth = dayOfBirth();
        this.gender = genderInput();
        this.passportId = passportInput();
        this.phoneNumber = phoneNumberInput();
        this.email = emailInput();
    }

    Validate validate = new Validate();

    Scanner sc = new Scanner(System.in);

    public String idInput() {
        String id;
        boolean checkId;// sử dụng để check tồn tại id
        do {
            System.out.print("ID: ");
            id = sc.nextLine();
        } while (!validate.positiveNumberValidate(id));
        return id;
    }


    public String nameInput() {
        System.out.print("Enter his/her name: ");
        boolean nameValidate;
        String name;
        do {
            name = sc.nextLine();
            nameValidate = validate.nameValidate(name);
        } while (!nameValidate);
        return name;
    }

    public String dayOfBirth() {
        System.out.print("Enter his/her birthday: ");
        String dayOfBirth;
        do {
            dayOfBirth = sc.nextLine();
            if (!validate.validateDate(dayOfBirth)) {
                System.out.println("Wrong format! Please re-type");
            }
        } while (!validate.validateDate(dayOfBirth));
        return dayOfBirth;
    }

    public Gender genderInput() {
        System.out.print("Choose gender: ");
        for (int i = 0; i < Gender.values().length; i++) {
            System.out.println((i + 1) + " : " + Gender.values()[i]);
        }
        System.out.println("Your choice:");
        int gender = Integer.parseInt(sc.nextLine());
        return Gender.values()[gender-1];
    }

    public String passportInput() {
        System.out.print("Enter his/her passport id: ");
        String passportId;
        do {
            passportId = sc.nextLine();
            if (!validate.positiveNumberValidate(passportId) || passportId.length() != 9) {
                System.out.println("Wrong format! Please re-type");
            }
        } while (!validate.positiveNumberValidate(passportId) || passportId.length() != 9);
        return passportId;
    }

    public String phoneNumberInput() {
        System.out.print("Enter his/her phone number: ");
        String phoneNumber;
        do {
            phoneNumber = sc.nextLine();
            if (!validate.positiveNumberValidate(phoneNumber) || phoneNumber.length() != 9) {
                System.out.println("Wrong format! Please re-type");
            }
        } while (!validate.positiveNumberValidate(phoneNumber) || phoneNumber.length() != 9);
        return phoneNumber;
    }

    public String emailInput() {
        System.out.print("Enter his/her email: ");
        String email;
        do {
            email = sc.nextLine();
            if (!validate.validateEmail(email)) {
                System.out.println("Wrong format! Please re-type");
            }
        } while (!validate.validateEmail(email));
        return email;
    }

//    public List<String> writePersonToCSV(List<Person> personList){
//        List<String> stringList = new ArrayList<>();
//        for (Person person:
//                personList) {
//            stringList.add(person.personToString());
//        }
//        return stringList;
//    }


}
