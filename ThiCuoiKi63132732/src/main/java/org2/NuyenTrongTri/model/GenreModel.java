package org2.NuyenTrongTri.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Genre")
public class GenreModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long genreID;
    private String genreName;

    // Constructors
    public GenreModel(String genreName) {
        this.genreName = genreName;
    }
    public GenreModel() {
    	
    }
    // Getters and setters
    public long getGenreID() {
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