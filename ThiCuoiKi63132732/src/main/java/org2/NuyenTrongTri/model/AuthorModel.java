package org2.NuyenTrongTri.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Author")
public class AuthorModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorID;
    private String authorName;
    private String authorAlias;
    private String authorBio;
    // Constructors

    public AuthorModel(String authorName, String authorAlias, String authorBio) {
        this.authorName = authorName;
        this.authorAlias = authorAlias;
        this.authorBio = authorBio;
    }
    
    public AuthorModel() {

	}

	// Getters and setters
    public long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Long id) {
        this.authorID = id;
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
    
    public String getAuthorBio() {
        return authorBio;
    }

    public void setAuthorBio(String authorBio) {
        this.authorBio= authorBio;
    }
    
}
