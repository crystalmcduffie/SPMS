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

@Entity (name = "pitch_log")
public class PitchLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn (name = "pitch_id")
	private Pitch pitch;
	@ManyToOne
	@JoinColumn (name = "editor_id")
	private Editor editor;
	@ManyToOne
	@JoinColumn (name = "stage_id")
	private PitchStage pitchStage;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pitch getPitch() {
		return pitch;
	}
	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	public PitchStage getPitchStage() {
		return pitchStage;
	}
	public void setPitchStage(PitchStage pitchStage) {
		this.pitchStage = pitchStage;
	}
	
}
