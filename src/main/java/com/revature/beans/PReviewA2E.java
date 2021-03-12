package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "p_review_a2e")
public class PReviewA2E {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@OneToOne
	@JoinColumn (name = "pitch_review_id")
	PitchReview pitchReview;
	@ManyToOne
	@JoinColumn (name = "sender_id")
	Author author;
	@ManyToOne
	@JoinColumn (name = "receiver_id")
	Editor editor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PitchReview getPitchReview() {
		return pitchReview;
	}
	public void setPitchReview(PitchReview pitchReview) {
		this.pitchReview = pitchReview;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((editor == null) ? 0 : editor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pitchReview == null) ? 0 : pitchReview.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PReviewA2E other = (PReviewA2E) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (editor == null) {
			if (other.editor != null)
				return false;
		} else if (!editor.equals(other.editor))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pitchReview == null) {
			if (other.pitchReview != null)
				return false;
		} else if (!pitchReview.equals(other.pitchReview))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PReviewA2E [id=" + id + ", pitchReview=" + pitchReview + ", author=" + author + ", editor=" + editor
				+ "]";
	}
	
}

