package org2.NuyenTrongTri.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="book")
public class BookModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID;
    private String bookName;
    private String bookDescription;
    private String bookComment;

    @ManyToOne
    @JoinColumn(name="authorID")
    private AuthorModel author;



    @ManyToOne
    @JoinColumn(name="genreID")
    private GenreModel genre;

    // Constructors

    public BookModel(int bookID, String bookName, String bookDescription, String bookComment) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.bookComment = bookComment;
    }

    // Getters and setters
    public int getbookID() {
        return bookID;
    }

    public void setbookID(int bookID) {
        this.bookID = bookID;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public String getbookDescription() {
        return bookDescription;
    }

    public void setbookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getbookComment() {
        return bookComment;
    }

    public void setbookComment(String bookComment) {
        this.bookComment = bookComment;
    }
}
