package com.revature.data;

import com.revature.beans.Draft;
import com.revature.beans.DraftLog;
import com.revature.beans.DraftStage;
import com.revature.beans.Editor;

import java.util.Set;

import com.revature.beans.AuthorDraft;

public interface DraftDAO {
	public Draft getDraft(Integer id);
	public Set<Draft> getByUsername(String username);
	public void submitDraft(Draft d);
	public void addToAuthorDraft(AuthorDraft ad);
	public AuthorDraft getAuthorDraft(Draft d);
	public Set<DraftLog> getAllDraftApprovals(Draft d);
	public void updateDraft(Draft d);
	public void addToDraftLog(DraftLog dl);
	public DraftStage getDraftStage(String name);
	public Set<Draft> getAll();
	public Set<Draft> getAllPendingDrafts();
	public Set<DraftLog> getEditorDraftApprovals(Editor e);
	public void createChangeRequest(Draft d);
}
