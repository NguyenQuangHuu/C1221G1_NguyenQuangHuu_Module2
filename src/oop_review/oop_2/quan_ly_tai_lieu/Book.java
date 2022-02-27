package oop_review.oop_2.quan_ly_tai_lieu;

public class Book extends File {
    private String authorsName;
    private int pageNumber;


    public Book() {

    }

    public Book(String authorsName, int pageNumber) {
        this.authorsName = authorsName;
        this.pageNumber = pageNumber;
    }

    public Book(String fileCode, String publisher, int releaseNumber, String authorsName, int pageNumber) {
        super(fileCode, publisher, releaseNumber);
        this.authorsName = authorsName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return super.toString()+" Book{" +
                "authorsName='" + authorsName + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
