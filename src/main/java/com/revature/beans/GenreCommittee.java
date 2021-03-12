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
@Table (name = "genre_committees")
public class GenreCommittee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn (name = "genre_id")
	private Genre genre;
	@ManyToOne
	@JoinColumn (name = "editor_id")
	private Editor editor;
	@ManyToOne
	@JoinColumn (name = "editor_status_id")
	private EditorStatus editorStatus;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	public EditorStatus getEditorStatus() {
		return editorStatus;
	}
	public void setEditorStatus(EditorStatus editorStatus) {
		this.editorStatus = editorStatus;
	}
	
	
}
