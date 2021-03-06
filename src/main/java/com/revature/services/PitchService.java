package com.revature.services;

import java.util.List;
import java.util.Set;

import com.revature.beans.Author;
import com.revature.beans.Editor;
import com.revature.beans.Pitch;
import com.revature.beans.PitchStage;
import com.revature.beans.StoryType;

public interface PitchService{
//CRUD
	//If CreatePitch returns "insufficient points", the pitch
	//was created and placed on hold.
	//If it returns "pitch created" then the pitch process
	//has started
	//If it returns "error" then something went wrong in the DB
	public Pitch getPitch(Integer id);
	public Pitch createPitch(Author a, Pitch p);
	public String calculatePriority(Pitch p);
	public void approvePitch(Pitch p);
	//general editor cannot be the same as the assistant editor
	public void assignPitch(Pitch p);
	public void updatePitch(Pitch p);
	public void cancelPitch(Pitch p);
	public void rejectPitch(Pitch p);
	public PitchStage getPitchStage(String name);
	public StoryType getStoryType(String name);
	public Set<Pitch> getApprovedPitches(Author a);
	public Set<Pitch> getPitchesOnHold(Author a);
	public Set<Pitch> getSeniorEditorPitches(Editor e);
	public List<Pitch> listPitchesInOrder(Set<Pitch> pitches);
}
