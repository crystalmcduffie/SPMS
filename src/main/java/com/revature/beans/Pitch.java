package com.revature.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "pitch")
//@IdClass(Task.class)
public class Pitch implements Comparable<Pitch> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (name ="author_info")
	private String authorInfo;
	@Column (name = "story_title")
	private String storyTitle;
	@Column (name = "completion_date")
	private java.sql.Date completionDate;
	@ManyToOne
	@JoinColumn (name = "story_type_id")
	private StoryType storyType;
	@ManyToOne
	@JoinColumn (name = "genre_id")
	private Genre genre;
	@Column (name = "tag_line")
	private String tagLine;
	private String description;
	private byte[] attachments;
	@Column (name = "on_hold")
	private boolean onHold;
	@Column (name = "timestamp")
	private java.sql.Date timestamp;
	@ManyToOne
	@JoinColumn (name="stage_id")
	private PitchStage stage;
	private String priority;
	
	public java.sql.Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(java.sql.Date timestamp) {
		this.timestamp = timestamp;
	}

	public java.sql.Date convertDatetoSQL(java.util.Date completion_date){
		java.sql.Date sqlDate = new java.sql.Date(completion_date.getTime());
		return sqlDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthorInfo() {
		return authorInfo;
	}

	public void setAuthorInfo(String authorInfo) {
		this.authorInfo = authorInfo;
	}

	public String getStoryTitle() {
		return storyTitle;
	}

	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}

	public java.sql.Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(java.sql.Date completionDate) {
		this.completionDate = completionDate;
	}

	public StoryType getStoryType() {
		return storyType;
	}

	public void setStoryType(StoryType storyType) {
		this.storyType = storyType;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getTagLine() {
		return tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getAttachments() {
		return attachments;
	}

	public void setAttachments(byte[] attachments) {
		this.attachments = attachments;
	}

	public boolean isOnHold() {
		return onHold;
	}

	public void setOnHold(boolean onHold) {
		this.onHold = onHold;
	}

	public java.sql.Date getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(java.sql.Date timestamp) {
		this.timestamp = timestamp;
	}

	public PitchStage getStage() {
		return stage;
	}

	public void setStage(PitchStage stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "Pitch [id=" + id + ", authorInfo=" + authorInfo + ", storyTitle=" + storyTitle + ", completionDate="
				+ completionDate + ", storyType=" + storyType + ", genre=" + genre + ", tagLine=" + tagLine
				+ ", description=" + description + ", attachments=" + Arrays.toString(attachments) + ", onHold="
				+ onHold + ", timestamp=" + timestamp + ", stage=" + stage + ", priority=" + priority + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(attachments);
		result = prime * result + ((authorInfo == null) ? 0 : authorInfo.hashCode());
		result = prime * result + ((completionDate == null) ? 0 : completionDate.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (onHold ? 1231 : 1237);
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((stage == null) ? 0 : stage.hashCode());
		result = prime * result + ((storyTitle == null) ? 0 : storyTitle.hashCode());
		result = prime * result + ((storyType == null) ? 0 : storyType.hashCode());
		result = prime * result + ((tagLine == null) ? 0 : tagLine.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
		Pitch other = (Pitch) obj;
		if (!Arrays.equals(attachments, other.attachments))
			return false;
		if (authorInfo == null) {
			if (other.authorInfo != null)
				return false;
		} else if (!authorInfo.equals(other.authorInfo))
			return false;
		if (completionDate == null) {
			if (other.completionDate != null)
				return false;
		} else if (!completionDate.equals(other.completionDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (onHold != other.onHold)
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (stage == null) {
			if (other.stage != null)
				return false;
		} else if (!stage.equals(other.stage))
			return false;
		if (storyTitle == null) {
			if (other.storyTitle != null)
				return false;
		} else if (!storyTitle.equals(other.storyTitle))
			return false;
		if (storyType == null) {
			if (other.storyType != null)
				return false;
		} else if (!storyType.equals(other.storyType))
			return false;
		if (tagLine == null) {
			if (other.tagLine != null)
				return false;
		} else if (!tagLine.equals(other.tagLine))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Pitch o) {
		return this.getId().compareTo(o.getId());
	}

	
}
