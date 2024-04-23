package org2.NuyenTrongTri.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="StoryCategory")
public class StoryCategoryModel {
	@Id
    private int storyID;
    private int categoryID;

    // Constructors

    public StoryCategoryModel(int storyID, int categoryID) {
        this.storyID = storyID;
        this.categoryID = categoryID;
    }

    // Getters and setters
    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}
