package case_study_module_2.models.person;

public class Membership {
    private String typeMember;

    public Membership(String typeMember) {
        this.typeMember = typeMember;
    }

    public String getTypeMember() {
        return typeMember;
    }

    public void setTypeMember(String typeMember) {
        this.typeMember = typeMember;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "typeMember='" + typeMember + '\'' +
                '}';
    }
}
