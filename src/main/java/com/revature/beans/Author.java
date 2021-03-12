package com.revature.beans;

import java.util.Set;

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
import javax.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	@Column (name = "psswd")
	private String password;
	@OneToMany (fetch=FetchType.EAGER)
	@JoinTable(name="author_pitch", 
	joinColumns=@JoinColumn(name="author_id"),
	inverseJoinColumns=@JoinColumn(name="pitch_id"))
	private Set<Pitch> pitches;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinTable(name="author_draft", 
	joinColumns=@JoinColumn(name="author_id"),
	inverseJoinColumns=@JoinColumn(name="draft_id"))
	private Set<Draft> drafts;
//	@OneToMany (fetch=FetchType.EAGER)
//	@JoinTable(name="dmessage_e2a",
//	joinColumns=@JoinColumn(name="receiver_id"),
//	inverseJoinColumns=@JoinColumn(name="message_id_e2a"))
//	private Set<DraftMessage> receivedDraftMessages;
//	@OneToMany (fetch=FetchType.EAGER)
//	@JoinTable(name="dmessage_a2e",
//	joinColumns=@JoinColumn(name="sender_id"),
//	inverseJoinColumns=@JoinColumn(name="message_id_a2e"))
//	private Set<DraftMessage> sentDraftMessages;	
//	@OneToMany (fetch = FetchType.EAGER)
//	@JoinTable(name = "dchange_a2e",
//	joinColumns=@JoinColumn(name="sender_id"),
//	inverseJoinColumns=@JoinColumn(name="draft_change_id_a2e"))
//	private Set<DraftChange> draftChangeResponses;
//	@OneToMany (fetch = FetchType.EAGER)
//	@JoinTable(name = "dchange_e2a",
//	joinColumns=@JoinColumn(name="receiver_id"),
//	inverseJoinColumns=@JoinColumn(name="draft_change_id_e2a"))
//	private Set<DraftChange> draftChangeRequests;
//	@OneToMany (fetch=FetchType.EAGER)
//	@JoinTable(name="pmessage_e2a",
//	joinColumns=@JoinColumn(name="receiver_id"),
//	inverseJoinColumns=@JoinColumn(name="message_id_e2a"))
//	private Set<PitchMessage> receivedPitchMessages;
//	@OneToMany (fetch=FetchType.EAGER)
//	@JoinTable(name="pmessage_a2e",
//	joinColumns=@JoinColumn(name="sender_id"),
//	inverseJoinColumns=@JoinColumn(name="message_id_a2e"))
//	private Set<PitchMessage> sentPitchMessages;
//	@OneToMany (fetch=FetchType.EAGER)
//	@JoinTable(name="p_review_e2a",
//	joinColumns=@JoinColumn(name="receiver_id"),
//	inverseJoinColumns=@JoinColumn(name="pitch_review_id_e2a"))
//	private Set<PitchReview> pitchReviewRequests;
//	@OneToMany (fetch=FetchType.EAGER)
//	@JoinTable(name="p_review_a2e",
//	joinColumns=@JoinColumn(name="sender_id"),
//	inverseJoinColumns=@JoinColumn(name="pitch_review_id_a2e"))
//	private Set<PitchReview> pitchReviewResponses;
	private Integer points;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Pitch> getPitches() {
		return pitches;
	}
	public void setPitches(Set<Pitch> pitches) {
		this.pitches = pitches;
	}
	public Set<Draft> getDrafts() {
		return drafts;
	}
	public void setDrafts(Set<Draft> drafts) {
		this.drafts = drafts;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drafts == null) ? 0 : drafts.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pitches == null) ? 0 : pitches.hashCode());
		result = prime * result + ((points == null) ? 0 : points.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Author other = (Author) obj;
		if (drafts == null) {
			if (other.drafts != null)
				return false;
		} else if (!drafts.equals(other.drafts))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pitches == null) {
			if (other.pitches != null)
				return false;
		} else if (!pitches.equals(other.pitches))
			return false;
		if (points == null) {
			if (other.points != null)
				return false;
		} else if (!points.equals(other.points))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", username=" + username + ", password=" + password + ", pitches=" + pitches
				+ ", drafts=" + drafts + ", points=" + points + "]";
	}

}
