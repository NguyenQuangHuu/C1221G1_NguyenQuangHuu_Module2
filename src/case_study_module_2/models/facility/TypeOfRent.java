package case_study_module_2.models.facility;

public class TypeOfRent {
    private String nameType;

    public TypeOfRent(String nameType) {
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return "nameType='" + nameType + " ";
    }
}
