package case_study_module_2.models.person;

public class AcademicLevel {
    private String academicLevel;

    public AcademicLevel(String academicLevel){
        this.academicLevel = academicLevel;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    @Override
    public String toString() {
        return "AcademicLevel{" +
                academicLevel + '\'' +
                '}';
    }
}
