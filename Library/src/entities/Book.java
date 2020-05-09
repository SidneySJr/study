package entities;

/**
 * @author sidney
 */
public class Book {

    private static int cod;
    private int year;
    private Author author;
    private String title;
    private String publishingCompany;
    private String situation;

    public Book(int year, Author author, String title, String publishingCompany) {
        cod++;
        this.year = year;
        this.author = author;
        this.title = title;
        this.publishingCompany = publishingCompany;
        this.situation = "Disponivel";
    }

    public int getCod() {
        return cod;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "Book: "
                + "\nYear: " + year
                + "\nAuthor: " + author
                + "\nTitle: " + title
                + "\nPublishing Company: " + publishingCompany
                + "\nSituation: " + situation;
    }

}
