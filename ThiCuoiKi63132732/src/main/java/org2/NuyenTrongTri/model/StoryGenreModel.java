package org2.NuyenTrongTri.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="StoryGenre")
public class StoryGenreModel {
	@Id
    private int storyID;
    private int genreID;

    // Constructors


    public StoryGenreModel(int storyID, int genreID) {
        this.storyID = storyID;
        this.genreID = genreID;
    }

    // Getters and setters
    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }
}
