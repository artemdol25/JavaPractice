package Task3;

public class Book {

    private int numberOfPages;
    private int yearOfPublication;
    private String name;

    public Book(int numberOfPages, int yearOfPublication) {
        this.numberOfPages = numberOfPages;
        this.yearOfPublication = yearOfPublication;
    }

    public Book() {

    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Year of publication: " + this.yearOfPublication + "   Number of pages: " + this.numberOfPages;
    }
}
