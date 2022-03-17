package demo_case_study.utils;


import demo_case_study.models.facility.Facility;
import demo_case_study.models.facility.House;
import demo_case_study.models.facility.Room;
import demo_case_study.models.facility.Villa;

import java.util.regex.Pattern;

public class Validate {
    final String POSITIVE_NUMBER = "[+]\\d";
    final String POSITIVE_TENS_NUMBER = "[+]\\d*\\.?\\d*";
    final String DATE = "^([0|1|2]\\d|[3][0-1])/([0]\\d|[1][0-2])/((19)(\\d){2}|(20)(([0|1]\\d)|[2][0-2]))$";


    public boolean validateIdService(Facility facility, String idService){

        boolean checked = false;
        if(facility instanceof Villa){
            String regEx = "SVVL-\\d{4}";
            checked = Pattern.matches(regEx,idService);
        }else if(facility instanceof House){
            String regEx = "SVHO-\\d{4}";
            checked = Pattern.matches(regEx,idService);
        }else if(facility instanceof Room){
            String regEx = "SVRO-\\d{4}";
            checked = Pattern.matches(regEx,idService);
        }

        return checked;
    }

    public boolean stringValidate(String name){
        String regEx ="^[A-Z][a-z]+";
        return  Pattern.matches(regEx,name);
    }

//    public boolean usableArea(String area){
//        return Pattern.matches(POSITIVE_TENS_NUMBER,area);
//    }
//
//    public boolean rentFee(String fee){
//        String regEx = "[+]?\\d*\\.?\\d*";
//        return Pattern.matches(regEx,fee);
//    }

    public boolean positiveNumberValidate(String checkingString){
        return !Pattern.matches(POSITIVE_NUMBER, checkingString);
    }

    public boolean positiveTensNumberValidate(String checkingString){
        return !Pattern.matches(POSITIVE_TENS_NUMBER, checkingString);
    }

    public boolean validateDate(String checkingString){
        return Pattern.matches(DATE,checkingString);
    }

}
