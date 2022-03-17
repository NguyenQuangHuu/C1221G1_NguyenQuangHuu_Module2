package case_study_module2.controllers;


import case_study_module2.models.facility.House;

public class HouseController extends FacilityController {
    protected String houseIdService;
    protected String kindOfRoom;
    protected int numberFloor;

    public House houseInput(){
        super.facilityInformationInput();
        houseIdService = idHouseInput();
        kindOfRoom = kindOfRoom();
        numberFloor = numberFloor();
        return new House(serviceName,usableArea,rentExpense,maximumCapacity,rentType,houseIdService,kindOfRoom,numberFloor);
    }

    public String idHouseInput(){
        System.out.println("Enter Service ID");
        String idHouse;
        do{
            idHouse = sc.nextLine();
        }while (!validate.validateIdServiceHouse(idHouse));
        return sc.nextLine();
    }

    public String kindOfRoom(){
        String kind;
        do{
            System.out.println("Enter kind of room");
            kind=sc.nextLine();
        }while (!validate.nameValidate(kind));
        return kind;
    }

    public int numberFloor(){
        String floor;
        do{
            System.out.println("Enter numbers floor");
            floor = sc.nextLine();

        }while (!validate.positiveNumberValidate(floor));
        return Integer.parseInt(floor);
    }
}
