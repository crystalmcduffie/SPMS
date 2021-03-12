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
@Table (name = "pmessage_e2e")
public class PMessageE2E {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@ManyToOne
	@JoinColumn (name = "message_id")
	PitchMessage pitchMessage;
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
	public PitchMessage getPitchMessage() {
		return pitchMessage;
	}
	public void setPitchMessage(PitchMessage pitchMessage) {
		this.pitchMessage = pitchMessage;
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
		result = prime * result + ((pitchMessage == null) ? 0 : pitchMessage.hashCode());
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
		PMessageE2E other = (PMessageE2E) obj;
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
		return "PMessageE2ESent [id=" + id + ", pitchMessage=" + pitchMessage + ", senderEditor=" + senderEditor
				+ ", receiverEditor=" + receiverEditor + "]";
	}

}
