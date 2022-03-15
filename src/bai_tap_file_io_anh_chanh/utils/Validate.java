package bai_tap_file_io_anh_chanh.utils;

import java.util.regex.Pattern;

public class Validate {
    public boolean numberPlateTruckValidate(String numberPlate){
        String regEx = "^\\d{2}C-(\\d{3}\\.\\d{2})$";
        return Pattern.matches(regEx,numberPlate);
    }
    public boolean numberPlateCarValidate(String numberPlate,String carType){
        boolean checked = false;
        if("Xe Khách".equals(carType)){
            String regEx = "^\\d{2}B-(\\d{3}\\.\\d{2})$";
            checked = Pattern.matches(regEx,numberPlate);
        }else if("Xe Du Lịch".equals(carType)){
            String regEx = "^\\d{2}A-(\\d{3}\\.\\d{2})$";
            checked = Pattern.matches(regEx,numberPlate);
        }

        return checked;
    }
    public boolean numberPlateMotorbikeValidate(String numberPlate){
        String regEx = "^\\d{2}-[A-Z][\\d|A-Z]-(\\d{3}\\.\\d{2})$";
        return Pattern.matches(regEx,numberPlate);
    }


    public boolean nameOwnerValidate(String name){
        String regEx = "(([\\p{Lu}]|[A-Z])([\\p{Ll}]|[a-z])+)(\\s([\\p{Lu}]|[A-Z])([\\p{Ll}]|[a-z])+)*";

        return Pattern.matches(regEx,name);
    }
}
