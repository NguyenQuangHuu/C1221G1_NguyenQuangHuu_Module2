package oop_review.oop_2.quan_ly_tai_lieu;

public class Newspaper extends File {
    private String releaseDay;

    public Newspaper() {
    }

    public Newspaper(String fileCode, String publisher, int release, String releaseDay) {
        super(fileCode, publisher, release);
        this.releaseDay = releaseDay;
    }

    public Newspaper(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return super.toString()+"Newspaper{" +
                "releaseDay=" + releaseDay +
                '}';
    }
}
