package ss16_io_text.bai_tap.read_csv;

public class Country {
    private int zipCode;
    private String shortName;
    private String fullNameCountry;

    public Country() {
    }

    public Country(int zipCode, String shortName, String fullNameCountry) {
        this.zipCode = zipCode;
        this.shortName = shortName;
        this.fullNameCountry = fullNameCountry;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullNameCountry() {
        return fullNameCountry;
    }

    public void setFullNameCountry(String fullNameCountry) {
        this.fullNameCountry = fullNameCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "zipCode=" + zipCode +
                ", shortName='" + shortName + '\'' +
                ", fullNameCountry='" + fullNameCountry + '\'' +
                '}';
    }

    public String getInformation(){
        return this.getZipCode()+","+this.getShortName()+","+this.getFullNameCountry();
    }
}
