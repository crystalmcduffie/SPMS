package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "draft_log")
public class DraftLog {
	@Override
	public String toString() {
		return "DraftLog [id=" + id + ", draft=" + draft + ", editor=" + editor + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn (name = "draft_id")
	private Draft draft;
	@ManyToOne
	@JoinColumn (name = "editor_id")
	private Editor editor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Draft getDraft() {
		return draft;
	}
	public void setDraft(Draft draft) {
		this.draft = draft;
	}
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	
	
}
