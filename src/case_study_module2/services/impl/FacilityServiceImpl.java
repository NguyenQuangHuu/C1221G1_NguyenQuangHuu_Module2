package case_study_module2.services.impl;

import case_study_module2.controllers.FacilityController;
import case_study_module2.controllers.HouseController;
import case_study_module2.controllers.RoomController;
import case_study_module2.controllers.VillaController;
import case_study_module2.models.Booking;
import case_study_module2.models.enums.RentType;
import case_study_module2.models.facility.Facility;

import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.services.IFacilityService;
import case_study_module2.utils.ReadAndWriteFile;
import case_study_module2.utils.Validate;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Scanner sc = new Scanner(System.in);
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";

    final String VILLAS_FILE = "src\\case_study_module2\\data\\villas.csv";
    final String HOUSE_FILE = "src\\case_study_module2\\data\\houses.csv";
    final String ROOMS_FILE = "src\\case_study_module2\\data\\rooms.csv";


    public Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    public Set<Booking> bookingSet = readAndWriteFile.readFileBooking(BOOKINGS_FILE);
    public List<Facility> facilityArrayList = new ArrayList<>();

    List<Villa> villas = readAndWriteFile.readFileVilla(VILLAS_FILE);
    List<House> houses = readAndWriteFile.readFileHouse(HOUSE_FILE);
    List<Room> rooms = readAndWriteFile.readFileRoom(ROOMS_FILE);

    Validate validate = new Validate();

    VillaController villaController = new VillaController();
    HouseController houseController = new HouseController();
    RoomController roomController = new RoomController();

    final String VILLA = "1";
    final String HOUSE = "2";
    final String ROOM = "3";
    final String EXIT = "0";

    @Override
    public void add() {

        String choice;
        do {
            System.out.println("Choose your services:\n" +
                    "1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "0. Back to menu");
            System.out.print("Your choice");
            choice = sc.nextLine();
        } while (!validate.positiveNumberValidate(choice));
        while (!validate.positiveNumberValidate(choice) || Integer.parseInt(choice) < 0 || Integer.parseInt(choice) > 3) {
            System.out.println("Wrong input ! Re-type");
            choice = sc.nextLine();
        }
        switch (choice) {
            case VILLA:
                villas.add(villaController.villaInput());
                readAndWriteFile.writeFile(VILLAS_FILE, villaController.writeVillaToCSV(villas));
                break;
            case HOUSE:
                houses.add(houseController.houseInput());
                readAndWriteFile.writeFile(HOUSE_FILE, houseController.writeHouseToCSV(houses));
                break;
            case ROOM:
                rooms.add(roomController.roomInput());
                readAndWriteFile.writeFile(ROOMS_FILE, roomController.writeRoomToCSV(rooms));
                break;
            case EXIT:
                break;
        }
//        System.out.println("Name Services: ");
//        String name;
//        do{
//            name = sc.nextLine();
//
//        }while (validate.stringValidate(name));
//
//        System.out.println("Usable area: ");
//        String usableCheck;
//        double usable;
//        do{
//            usableCheck = sc.nextLine();
//            usable = Double.parseDouble(usableCheck);
//        }while (validate.positiveTensNumberValidate(usableCheck) && usable <= 30 );
//
//        System.out.println("Rent fee: ");
//        String rentFee;
//        do{
//            rentFee = sc.nextLine();
//        }while (validate.positiveTensNumberValidate(rentFee));
//        double rent = Double.parseDouble(rentFee);
//
//        System.out.println("Capacity: ");
//        String numberCapacity;
//        int capacity;
//        do{
//            numberCapacity = sc.nextLine();
//            capacity = Integer.parseInt(numberCapacity);
//        }while (validate.positiveNumberValidate(numberCapacity) && !(capacity>20 || capacity<=0));
//
//
//        System.out.println("Type Service: ");
//        for(int i=0; i < RentType.values().length;i++){
//            System.out.println((i+1)+" : "+RentType.values()[i]);
//        }
//        System.out.println("Your choice:");
//        int yourChoice = Integer.parseInt(sc.nextLine());
//        switch (choice){
//            case VILLA:
//                System.out.println("Kind Of Room :");
//                String kindOfRoom;
//                do{
//                    kindOfRoom = sc.nextLine();
//                }while (validate.stringValidate(kindOfRoom));
//                System.out.println("Swimming Pool Area usable:");
//                String areaUsable;
//                double swimmingPool;
//                do{
//                    areaUsable = sc.nextLine();
//                    swimmingPool = Double.parseDouble(areaUsable);
//                }while (validate.positiveTensNumberValidate(areaUsable) && swimmingPool <= 30 );
//
//                System.out.println("Number of Floor:");
//                String numbersOfFloor;
//                int floor;
//                do{
//                    numbersOfFloor = sc.nextLine();
//
//                }while(validate.positiveNumberValidate(numbersOfFloor));
//                floor = Integer.parseInt(numbersOfFloor);
//                Villa villa = new Villa(name,usable,rent,capacity,RentType.values()[yourChoice-1],kindOfRoom,swimmingPool,floor);
//                facilityArrayList.add(villa);
//                break;
//            case HOUSE:
//                System.out.println("Kind Of Room : ");
//                String roomTypes;
//                do{
//                    roomTypes = sc.nextLine();
//                }while(validate.stringValidate(roomTypes));
//
//                System.out.println("Number of Floor: ");
//                int number = Integer.parseInt(sc.nextLine());
//                House house = new House(name,usable,rent,capacity,RentType.values()[yourChoice-1],roomTypes,number);
//                facilityArrayList.add(house);
//                break;
//            case ROOM:
//                System.out.println("Free services included");
//                String freeServices = sc.nextLine();
//                Room room = new Room(name,usable,rent,capacity,RentType.values()[yourChoice-1],freeServices);
//                facilityArrayList.add(room);
//                break;
//            case EXIT:break;
//
//        }

    }

    @Override
    public void show() {
        facilityArrayList.addAll(villas);
        facilityArrayList.addAll(houses);
        facilityArrayList.addAll(rooms);
        facilityArrayList.forEach(System.out::println);
    }


    @Override
    public void displayMaintenance() {
//        for (int i = 0; i < bookingSet.size(); i++) {
//            bookingSet.forEach(System.out::println);
//            if(!facilityMap.containsKey(bookingSet.)) {
//                facilityMap.put(facilityArrayList.get(i), 1);
//            }else{
//                facilityMap.replace(facilityArrayList.get(i),facilityMap.get((facilityArrayList.get(i)))+1);
//            }
//
//        }
        for (Booking booking : bookingSet) {
            if (!facilityMap.containsKey(booking.getFacilityName())) {
                facilityMap.put(booking.getFacilityName(), 1);
            } else {
                facilityMap.replace(booking.getFacilityName(), facilityMap.get(booking.getFacilityName()) + 1);
            }
        }


        System.out.println("Facility available now : ");
        for(Map.Entry<Facility,Integer> facilityIntegerEntry : facilityMap.entrySet()){
            if(facilityIntegerEntry.getValue()<5){
                System.out.println("Facility Name: "+facilityIntegerEntry.getKey().getServiceName()+" - Used numsber: "+facilityIntegerEntry.getValue());
            }
        }
        System.out.println("Facility maintenance now:");
        Iterator<Facility> iterator = facilityMap.keySet().iterator();
        while (iterator.hasNext()) {
            Facility key = iterator.next();
            if(facilityMap.get(key)>=5){
                System.out.println("Facility Name: "+key.getServiceName() + " - Used numbers: " + facilityMap.get(key) + "\n");
            }
        }

    }
}
