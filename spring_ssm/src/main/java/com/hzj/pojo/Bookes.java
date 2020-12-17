package com.hzj.pojo;


public class Bookes {

    private int bookId;
    private String bookName;
    private int bookCounts;
    private String datail;

    public Bookes(String bookName, int bookCounts, String datail) {
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.datail = datail;
    }

    public Bookes() {
    }

    @Override
    public String toString() {
        return "Bookes{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCounts=" + bookCounts +
                ", datail='" + datail + '\'' +
                '}';
    }

    public long getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getBookCounts() {
        return bookCounts;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDatail() {
        return datail;
    }

    public void setDatail(String datail) {
        this.datail = datail;
    }

}
