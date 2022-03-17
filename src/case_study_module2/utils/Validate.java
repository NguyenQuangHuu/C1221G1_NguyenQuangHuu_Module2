package case_study_module2.utils;

import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;

import java.util.regex.Pattern;

public class Validate {
    final String POSITIVE_NUMBER = "[+]?\\d+";
    final String POSITIVE_TENS_NUMBER = "[+]?\\d*\\.?\\d*";
    final String DATE = "^([012]\\d|[3][0-1])/([0]\\d|[1][0-2])/((19)(\\d){2}|(20)(([01]\\d)|[2][0-2]))$";
    final String VIETNAMESE_NAME = "^((\\p{Lu}(\\p{Ll})+)(\\s)?)+$";
    final String EMAIL = "^([a-z]\\w+@[a-z]{2,}\\.)\\w{2,10}(\\.\\w{2,3})?$";

    public boolean nameValidate(String name){
        return Pattern.matches(VIETNAMESE_NAME,name);
    }


    public boolean validateIdServiceVilla(String idService){
        String regEx = "SVVL-\\d{4}";
        return Pattern.matches(regEx,idService);
    }
    public boolean validateIdServiceHouse(String idService){
        String regEx = "SVHO-\\d{4}";
        return Pattern.matches(regEx,idService);
    }
    public boolean validateIdServiceRoom(String idService){
        String regEx = "SVRO-\\d{4}";
        return Pattern.matches(regEx,idService);
    }



    public boolean stringValidate(String name){
        String regEx ="^[A-Z][a-z]+";
        return Pattern.matches(regEx, name);
    }


    public boolean positiveNumberValidate(String checkingString){
        return Pattern.matches(POSITIVE_NUMBER, checkingString);
    }

    public boolean positiveTensNumberValidate(String checkingString){
        return Pattern.matches(POSITIVE_TENS_NUMBER, checkingString);
    }

    public boolean validateDate(String checkingString){
        return Pattern.matches(DATE, checkingString);
    }

    public boolean validateEmail(String email){
        return Pattern.matches(EMAIL,email);
    }

}
