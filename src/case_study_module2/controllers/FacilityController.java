package case_study_module2.controllers;

import case_study_module2.models.enums.RentType;
import case_study_module2.utils.Validate;

import java.util.Scanner;

public class FacilityController {

    Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();

    protected String serviceName;
    protected double usableArea;
    protected double rentExpense;
    protected int maximumCapacity;
    protected RentType rentType;


    public void facilityInformationInput(){
        serviceName = serviceNameInput();
        usableArea = usableAreaInput();
        rentExpense = rentExpense();
        maximumCapacity = capacity();
        rentType = rentTypeInput();
    }


    public RentType rentTypeInput(){
        for (int i = 0; i < RentType.values().length; i++) {
            System.out.println((i+1)+" "+RentType.values()[i]);
        }
        int choose = 0;
        System.out.println("Enter your choice");
        while(choose<=0 || choose>=5){
            try{
                choose = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format. Please Re-type");
                choose = Integer.parseInt(sc.nextLine());
            }
        }
        return RentType.values()[choose];
    }

    public String serviceNameInput(){

        String serviceName;
        do{
            System.out.println("Enter service name:");
            serviceName = sc.nextLine();
        }while (!validate.nameValidate(serviceName));
        return serviceName;
    }

    public double usableAreaInput(){
        String area ;
        double areaParseDouble = 0;
        System.out.println("Enter usable area:");
        do{
            area= sc.nextLine();
            try{
                areaParseDouble = Double.parseDouble(area);
            }catch (NumberFormatException e){
                System.out.println("Wrong format");
            }

        }while (!validate.positiveTensNumberValidate(area) && areaParseDouble<=30);
        return Double.parseDouble(area);
    }

    public double rentExpense(){
        String rent ;
        System.out.println("Enter rent expense:");
        do{
            rent= sc.nextLine();
        }while (!validate.positiveTensNumberValidate(rent));
        return Double.parseDouble(rent);
    }

    public int capacity(){
        String capacity ;
        System.out.println("Enter maximum capacity:");
        do{
            capacity = sc.nextLine();
        }while (!validate.positiveNumberValidate(capacity) || Integer.parseInt(capacity)>=20 || Integer.parseInt(capacity)<=0);
        return Integer.parseInt(capacity);
    }

}
