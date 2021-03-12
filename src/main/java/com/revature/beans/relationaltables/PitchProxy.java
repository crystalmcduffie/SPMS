package com.revature.beans.relationaltables;

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

import com.revature.beans.Pitch;


public class PitchProxy {
	private Integer id;
	private String authorInfo;
	private String storyTitle;
	private String completionDate;
	private String storyType;
	private String genre;
	private String tagLine;
	private String description;
	private byte[] attachments;
	private boolean onHold;
	private String timestamp;
	private String stage;
	private String priority;
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
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getStoryType() {
		return storyType;
	}
	public void setStoryType(String storyType) {
		this.storyType = storyType;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
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
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	

}
