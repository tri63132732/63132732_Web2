package org2.NuyenTrongTri.model;

public class AuthorModel {
    private int authorID;
    private String authorName;
    private String authorAlias;
    private String authorEmail;
    // Constructors

    public void Author(int authorID, String authorName, String authorAlias, String authorEmail) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.authorAlias = authorAlias;
        this.authorEmail = authorEmail;
    }

    // Getters and setters
    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
    public String getAuthorAlias() {
        return authorAlias;
    }

    public void setAuthorAlias(String authorAlias) {
        this.authorAlias = authorAlias;
    }
    
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail= authorEmail;
    }
}