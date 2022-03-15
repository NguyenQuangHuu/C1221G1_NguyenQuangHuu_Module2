package case_study_module_2.services.impl;


import case_study_module_2.models.facility.Facility;
import case_study_module_2.models.facility.House;
import case_study_module_2.models.facility.Room;
import case_study_module_2.models.facility.Villa;
import case_study_module_2.services.IFacilityService;
import case_study_module_2.utils.Validate;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    Scanner sc = new Scanner(System.in);
    static Map<String,Integer> rentType = new LinkedHashMap<>();

    ArrayList<Facility> facilityArrayList = new ArrayList<>();

    Validate validate = new Validate();

//    static{
//        facilityArrayList.add(new Room("Room-1",25.0,100.0,4,"ngày","hồ bơi, phòng gym, ăn sáng"));
//        facilityArrayList.add(new Room("Room-1",25.0,100.0,4,"ngày","hồ bơi, phòng gym, ăn sáng"));
//        facilityArrayList.add(new Room("Room-1",25.0,100.0,4,"ngày","hồ bơi, phòng gym, ăn sáng"));
//        facilityArrayList.add(new Room("Room-1",25.0,100.0,4,"ngày","hồ bơi, phòng gym, ăn sáng"));
//        facilityArrayList.add(new Room("Room-1",25.0,100.0,4,"ngày","hồ bơi, phòng gym, ăn sáng"));
//        for (int i = 0; i < facilityArrayList.size(); i++) {
//            if(!rentType.containsKey(facilityArrayList.get(i).getServiceName())) {
//                rentType.put(facilityArrayList.get(i).getServiceName(), 1);
//            }else{
//                rentType.replace(facilityArrayList.get(i).getServiceName(),rentType.get(facilityArrayList.get(i).getServiceName())+1);
//            }
//        }
//        System.out.println(rentType);
//
//    }

    final int VILLA = 1;
    final int HOUSE = 2;
    final int ROOM = 3;
    final int EXIT = 4;

    @Override
    public void add() {
        int choice=0;
        while(choice<1||choice>4){
            System.out.println("Choose your services:\n" +
                    "1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "Enter your choice:");
            choice = Integer.parseInt(sc.nextLine());
            if(choice<1||choice>4){
                System.out.println("Not exist this services, please re-type!");
            }
        }
        System.out.println("Name Services: ");
        String name;
        do{
            name = sc.nextLine();

        }while (!validate.stringValidate(name));

        System.out.println("Usable area: ");
        String usableCheck;
        double usable;
        do{
            usableCheck = sc.nextLine();
            usable = Double.parseDouble(usableCheck);
        }while (!validate.positiveTensNumberValidate(usableCheck) && usable <= 30 );

        System.out.println("Rent fee: ");
        String rentFee;
        do{
            rentFee = sc.nextLine();
        }while (!validate.positiveTensNumberValidate(rentFee));
        double rent = Double.parseDouble(rentFee);

        System.out.println("Capacity: ");
        String numberCapacity;
        int capacity;
        do{
            numberCapacity = sc.nextLine();
            capacity = Integer.parseInt(numberCapacity);
        }while (!validate.positiveNumberValidate(numberCapacity) && !(capacity>20 || capacity<=0));


        System.out.println("Type Service: ");
        String type;
        do{
            type = sc.nextLine();
        }while (!validate.stringValidate(type));
        switch (choice){
            case VILLA:
                System.out.println("Kind Of Room :");
                String kindOfRoom;
                do{
                    kindOfRoom = sc.nextLine();
                }while (!validate.stringValidate(kindOfRoom));
                System.out.println("Swimming Pool Area usable:");
                String areaUsable;
                double swimmingPool;
                do{
                    areaUsable = sc.nextLine();
                    swimmingPool = Double.parseDouble(areaUsable);
                }while (!validate.positiveTensNumberValidate(areaUsable) && swimmingPool <= 30 );

                System.out.println("Number of Floor:");
                String numbersOfFloor;
                int floor;
                do{
                    numbersOfFloor = sc.nextLine();

                }while(!validate.positiveNumberValidate(numbersOfFloor));
                floor = Integer.parseInt(numbersOfFloor);
                Villa villa = new Villa(name,usable,rent,capacity,type,kindOfRoom,swimmingPool,floor);
                facilityArrayList.add(villa);
                break;
            case HOUSE:
                System.out.println("Kind Of Room : ");
                String roomTypes;
                do{
                    roomTypes = sc.nextLine();
                }while(!validate.stringValidate(roomTypes));

                System.out.println("Number of Floor: ");
                int number = Integer.parseInt(sc.nextLine());
                House house = new House(name,usable,rent,capacity,type,roomTypes,number);
                facilityArrayList.add(house);
                break;
            case ROOM:
                System.out.println("Free services included");
                String freeServices = sc.nextLine();
                Room room = new Room(name,usable,rent,capacity,type,freeServices);
                facilityArrayList.add(room);
                break;
            case EXIT:break;

        }

    }

    @Override
    public void show() {
        facilityArrayList.forEach(System.out::println);
    }

    @Override
    public void update() {

    }



    @Override
    public void displayMaintenance() {
        Iterator<String> iterator = rentType.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            if(rentType.get(key)>=5){
                System.out.println(key + " : "+rentType.get(key));
            }
        }
    }
}