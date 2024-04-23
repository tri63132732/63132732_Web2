package org2.NuyenTrongTri.model;

public class StoryModel {
    private int storyID;
    private String storyName;
    private String storyDescription;
    private String storyComment;

    // Constructors


    public void Story(int storyID, String storyName, String storyDescription, String storyComment) {
        this.storyID = storyID;
        this.storyName = storyName;
        this.storyDescription = storyDescription;
        this.storyComment = storyComment;
    }

    // Getters and setters
    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public String getStoryDescription() {
        return storyDescription;
    }

    public void setStoryDescription(String storyDescription) {
        this.storyDescription = storyDescription;
    }

    public String getStoryComment() {
        return storyComment;
    }

    public void setStoryComment(String storyComment) {
        this.storyComment = storyComment;
    }
}