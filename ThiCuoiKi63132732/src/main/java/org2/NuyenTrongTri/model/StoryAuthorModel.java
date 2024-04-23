package org2.NuyenTrongTri.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="StoryAuthor")
public class StoryAuthorModel {
	@Id
    private int storyID;
    private int authorID;

    // Constructors

    public StoryAuthorModel(int storyID, int authorID) {
        this.storyID = storyID;
        this.authorID = authorID;
    }

    // Getters and setters
    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
}
