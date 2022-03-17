package demo_case_study.models.person;

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
