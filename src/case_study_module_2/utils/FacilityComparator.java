package case_study_module_2.utils;

import case_study_module_2.models.facility.Facility;

import java.util.Comparator;

public class FacilityComparator implements Comparator<Facility> {

    @Override
    public int compare(Facility o1, Facility o2) {

        return o1.getServiceName().compareTo(o2.getServiceName());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
