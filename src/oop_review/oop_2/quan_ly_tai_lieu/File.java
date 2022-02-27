package oop_review.oop_2.quan_ly_tai_lieu;

public class File {
    private String fileCode;
    private String publisher;
    private int release;

    public File() {
    }

    public File(String fileCode, String publisher, int release) {
        this.fileCode = fileCode;
        this.publisher = publisher;
        this.release = release;
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int get() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "File{" +
                " publisher='" + fileCode + '\'' +
                ", authorName='" + this.getPublisher() + '\'' +
                ", releaseNumber=" + release +
                '}';
    }
}
