package com.revature.data;

import com.revature.beans.Author;
import com.revature.beans.AuthorPitch;
import com.revature.beans.Editor;
import com.revature.beans.EditorPitch;
import com.revature.beans.Pitch;
import com.revature.beans.PitchLog;
import com.revature.beans.PitchStage;
import com.revature.beans.StoryType;

public interface PitchDAO {
	public Pitch getPitch(Integer id);
	public StoryType getStoryType(String name);
	public Pitch createPitch(Pitch p);
	public void updatePitch(Pitch p);
	public void addToAuthorPitch(AuthorPitch ap);
	public AuthorPitch getAuthorPitch(Pitch p);
	public void addToPitchLog(PitchLog pl);
	public void addToEditorPitch(EditorPitch ep);
	public EditorPitch getEditorPitch(Pitch p);
	public void updateEditorPitch(EditorPitch ep);
	public void deleteEditorPitch(EditorPitch ep);
	public PitchStage getPitchStage(String name);

}
