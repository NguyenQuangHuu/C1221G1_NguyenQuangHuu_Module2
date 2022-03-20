package case_study_module2.models.person;

import case_study_module2.models.enums.Gender;

public abstract class Person {
    private String id;
    private String fullName;
    private String dayOfBirth;
    private Gender gender;
    private String passportID;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String fullName, String dayOfBirth, Gender gender, String passportID, String phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.passportID = passportID;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender=" + gender +
                ", passportID='" + passportID + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String personToString(){
        return this.getId() +
                " ," + this.getFullName() +
                " ," + this.getDayOfBirth()+
                " ," + this.getGender() +
                " ," + this.getPassportID() +
                " ," + this.getPhoneNumber() +
                " ,"+this.getEmail();
    }
}
