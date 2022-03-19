package case_study_module2.controllers;

import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;

import java.util.ArrayList;
import java.util.List;

public class RoomController extends FacilityController {
    protected String roomIdServices;
    protected String servicesIncluded;

    public Room roomInput(){
        super.facilityInformationInput();
        roomIdServices = idRoomInput();
        servicesIncluded = includedServices();
        return new Room(roomIdServices,serviceName,usableArea,rentExpense,maximumCapacity,rentType,servicesIncluded);
    }

    public String idRoomInput(){
        System.out.println("Enter Service ID");
        String idRoom;
        do{
            idRoom = sc.nextLine();
        }while (!validate.validateIdServiceRoom(idRoom));
        return sc.nextLine();
    }
    public String includedServices(){
        System.out.println("Enter included services");
        return sc.nextLine();
    }

    public List<String> writeRoomToCSV(List<Room> rooms){
        List<String> stringList = new ArrayList<>();
        for (Room room:
                rooms) {
            stringList.add(room.facilityToString());
        }
        return stringList;
    }
}
