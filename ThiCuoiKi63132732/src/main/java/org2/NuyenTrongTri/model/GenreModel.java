package org2.NuyenTrongTri.model;

public class GenreModel {
    private int genreID;
    private String genreName;

    // Constructors
    public void Genre(int genreID, String genreName) {
        this.genreID = genreID;
        this.genreName = genreName;
    }

    // Getters and setters
    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}