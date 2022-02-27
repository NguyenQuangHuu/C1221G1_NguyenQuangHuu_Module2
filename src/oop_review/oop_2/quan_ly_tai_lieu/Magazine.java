package oop_review.oop_2.quan_ly_tai_lieu;

public class Magazine extends File{
    private int releaseNumbers;
    private int releaseMonth;

    public Magazine() {
    }


    public Magazine(String fileCode, String publisher, int release, int releaseNumbers, int releaseMonth) {
        super(fileCode, publisher, release);
        this.releaseNumbers = releaseNumbers;
        this.releaseMonth = releaseMonth;
    }

    public Magazine(int releaseNumbers, int releaseMonth) {
        this.releaseNumbers = releaseNumbers;
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseNumbers() {
        return releaseNumbers;
    }

    public void setReleaseNumbers(int releaseNumbers) {
        this.releaseNumbers = releaseNumbers;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseDay(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return super.toString()+", Magazine{" +
                "releaseNumbers=" + releaseNumbers +
                ", releaseDay='" + releaseMonth + '\'' +
                '}';
    }
}
