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
@Table (name = "p_review_e2e")
public class PReviewE2E {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@OneToOne
	@JoinColumn (name = "pitch_review_id")
	PitchReview pitchReview;
	@ManyToOne
	@JoinColumn (name = "sender_id")
	Editor senderEditor;
	@ManyToOne
	@JoinColumn (name = "receiver_id")
	Editor receiverEditor;
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
	public Editor getSenderEditor() {
		return senderEditor;
	}
	public void setSenderEditor(Editor senderEditor) {
		this.senderEditor = senderEditor;
	}
	public Editor getReceiverEditor() {
		return receiverEditor;
	}
	public void setReceiverEditor(Editor receiverEditor) {
		this.receiverEditor = receiverEditor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pitchReview == null) ? 0 : pitchReview.hashCode());
		result = prime * result + ((receiverEditor == null) ? 0 : receiverEditor.hashCode());
		result = prime * result + ((senderEditor == null) ? 0 : senderEditor.hashCode());
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
		PReviewE2E other = (PReviewE2E) obj;
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
		if (receiverEditor == null) {
			if (other.receiverEditor != null)
				return false;
		} else if (!receiverEditor.equals(other.receiverEditor))
			return false;
		if (senderEditor == null) {
			if (other.senderEditor != null)
				return false;
		} else if (!senderEditor.equals(other.senderEditor))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PReviewE2EReceived [id=" + id + ", pitchReview=" + pitchReview + ", senderEditor=" + senderEditor
				+ ", receiverEditor=" + receiverEditor + "]";
	}

}
