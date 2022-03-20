package case_study_module2.controllers;

import case_study_module2.models.facility.Villa;

import java.util.ArrayList;
import java.util.List;

public class VillaController extends FacilityController{

    protected String idVilla;
    protected String kindOfRoom;
    protected double swimmingPool;
    protected int numberFloor;

    public Villa villaInput(){
        super.facilityInformationInput();
        idVilla = idVillaInput();
        kindOfRoom = kindOfRoom();
        swimmingPool = usableAreaSwimmingPoolInput();
        numberFloor = numberFloor();
        return new Villa(idVilla,serviceName,usableArea,rentExpense,maximumCapacity,rentType,kindOfRoom,swimmingPool,numberFloor);
    }

    public String idVillaInput(){
        String idVilla;
        do{
            System.out.println("Enter Service ID");
            idVilla = sc.nextLine();
        }while (!validate.validateIdServiceVilla(idVilla));
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

    public double usableAreaSwimmingPoolInput(){
        String usable;
        double usableDouble;
        do{
            System.out.println("Enter swimming pool area");
            usable = sc.nextLine();
            usableDouble = Double.parseDouble(usable);
        }while(!validate.positiveTensNumberValidate(usable) && usableDouble <=30 );
        return usableDouble;
    }

    public List<String> writeVillaToCSV(List<Villa> villas){
        List<String> stringList = new ArrayList<>();
        for (Villa villa:
             villas) {
            stringList.add(villa.facilityToString());
        }
        return stringList;
    }
}
