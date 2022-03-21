package case_study_module2.utils;

import case_study_module2.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDateO1 = LocalDate.parse(o1.getStartsDay(),formatter);
        LocalDate startDateO2 = LocalDate.parse(o2.getStartsDay(),formatter);
        LocalDate endDateO1 = LocalDate.parse(o2.getStartsDay(),formatter);
        LocalDate endDateO2 = LocalDate.parse(o2.getStartsDay(),formatter);
        if(startDateO1.compareTo(startDateO2)>0){
            return 1;
        }else if(startDateO1.compareTo(startDateO2)<0){
            return -1;
        }else{
            if(endDateO1.compareTo(endDateO2)>0){
                return -1;
            }else if(endDateO1.compareTo(endDateO2)<0){
                return 1;
            }else{
                return 1;
            }
        }
    }

}
