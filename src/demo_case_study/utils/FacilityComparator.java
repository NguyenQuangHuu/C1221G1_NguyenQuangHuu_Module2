package demo_case_study.utils;

import demo_case_study.models.facility.Facility;

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
