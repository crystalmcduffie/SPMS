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
@Table (name = "dchange_e2a")
public class DChangeE2A {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@OneToOne
	@JoinColumn (name = "draft_change_id")
	DraftChange draftChange;
	@ManyToOne
	@JoinColumn (name = "receiver_id")
	Author author;
	@ManyToOne
	@JoinColumn (name = "sender_id")
	Editor editor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public DraftChange getDraftChange() {
		return draftChange;
	}
	public void setDraftChange(DraftChange draftChange) {
		this.draftChange = draftChange;
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
		result = prime * result + ((draftChange == null) ? 0 : draftChange.hashCode());
		result = prime * result + ((editor == null) ? 0 : editor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		DChangeE2A other = (DChangeE2A) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (draftChange == null) {
			if (other.draftChange != null)
				return false;
		} else if (!draftChange.equals(other.draftChange))
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
		return true;
	}
	@Override
	public String toString() {
		return "DChangeE2A [id=" + id + ", draftChange=" + draftChange + ", author=" + author + ", editor=" + editor
				+ "]";
	}

}
