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
@Table (name = "pmessage_a2e")
public class PMessageA2E {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@ManyToOne
	@JoinColumn (name = "message_id")
	PitchMessage pitchMessage;
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
	public PitchMessage getPitchMessage() {
		return pitchMessage;
	}
	public void setPitchMessage(PitchMessage pitchMessage) {
		this.pitchMessage = pitchMessage;
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
		result = prime * result + ((pitchMessage == null) ? 0 : pitchMessage.hashCode());
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
		PMessageA2E other = (PMessageA2E) obj;
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
		if (pitchMessage == null) {
			if (other.pitchMessage != null)
				return false;
		} else if (!pitchMessage.equals(other.pitchMessage))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PMessageA2E [id=" + id + ", pitchMessage=" + pitchMessage + ", author=" + author + ", editor=" + editor
				+ "]";
	}
	
}
