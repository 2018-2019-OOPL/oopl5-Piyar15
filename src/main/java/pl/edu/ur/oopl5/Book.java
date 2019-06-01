package pl.edu.ur.oopl5;

public class Book {

    private String title;
    private String author;
    private int pages;
    private int year;
    private double price;

    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public Book(String title, String author, int pages, int year, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    int getPages() {
        return pages;
    }

    int getYear() {
        return year;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
