package ss12_framework_tree_map.thuc_hanh.sap_xep;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentTest.Student> {
    @Override
    public int compare(StudentTest.Student o1, StudentTest.Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}