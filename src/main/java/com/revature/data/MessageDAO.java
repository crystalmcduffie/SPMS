package com.revature.data;

import com.revature.beans.PitchMessage;
import com.revature.beans.PitchReview;

import java.util.Set;

import com.revature.beans.Author;
import com.revature.beans.DChangeA2E;
import com.revature.beans.DChangeE2A;
import com.revature.beans.DMessageA2E;
import com.revature.beans.DMessageE2A;
import com.revature.beans.DraftChange;
import com.revature.beans.DraftMessage;
import com.revature.beans.Editor;
import com.revature.beans.PMessageA2E;
import com.revature.beans.PMessageE2A;
import com.revature.beans.PMessageE2E;
import com.revature.beans.PReviewA2E;
import com.revature.beans.PReviewE2A;
import com.revature.beans.PReviewE2E;

public interface MessageDAO {
	public PitchReview getPitchReviewById(Integer id);
	public DraftChange getDraftChangeById(Integer id);
	
	public void addPitchMessage(PitchMessage pm);
	public void addToPMessageA2E(PMessageA2E pmae);
	public void addToPMessageE2A(PMessageE2A pmea);
	public void addToPMessageE2E(PMessageE2E pmee);
	
	public void addPitchReview(PitchReview pr);
	public void addToPReviewA2E(PReviewA2E prae);
	public void addToPReviewE2A(PReviewE2A prea);
	public void addToPReviewE2E(PReviewE2E pree);
	
//	public PitchReview getPitchReview(Editor e);
	public PReviewA2E getPReviewA2E(PitchReview pr);
	public PReviewE2A getPReviewE2A(PitchReview pr);
	public PReviewE2E getPReviewE2E(PitchReview pr);
	
	
	public void deletePitchReview(PitchReview pr);
	public void deleteFromPReviewA2E(PReviewA2E prae);
	public void deleteFromPReviewE2A(PReviewE2A prea);
	public void deleteFromPReviewE2E(PReviewE2E pree);
	
	public void addDraftMessage(DraftMessage dm);
	public void addToDMessageA2E(DMessageA2E dmae);
	public void addToDMessageE2A(DMessageE2A dmea);
	
	public void addDraftChange(DraftChange dc);
	public void addToDChangeA2E(DChangeA2E dcae);
	public void addToDChangeE2A(DChangeE2A dcea);
	
//	public DraftChange getDraftChange(Editor e);
	public DChangeA2E getDChangeA2E(DraftChange dc);
	public DChangeE2A getDChangeE2A(DraftChange dc);
	
	public void deleteDraftChange(DraftChange dc);
	public void deleteFromDChangeA2E(DChangeA2E dcae);
	public void deleteFromDChangeE2A(DChangeE2A dcea);
	
	public Set<DraftMessage> getReceivedDraftMessages(Editor e);
	public Set<DraftMessage> getReceivedDraftMessages(Author a);
	public Set<DraftMessage> getSentDraftMessages(Editor e);
	public Set<DraftMessage> getSentDraftMessages(Author a);
	
	public Set<PitchMessage> getReceivedEditorPitchMessages(Editor e);
	public Set<PitchMessage> getReceivedAuthorPitchMessages(Editor e);
	public Set<PitchMessage> getSentEditorPitchMessages(Editor e);
	public Set<PitchMessage> getSentAuthorPitchMessages(Editor e);
	
	public Set<PitchMessage> getReceivedPitchMessages(Author a);
	public Set<PitchMessage> getSentPitchMessages(Author a);
	
	public Set<DraftChange> getReceivedDraftChange(Editor e);
	public Set<DraftChange> getSentDraftChange(Editor e);
	public Set<DraftChange> getReceivedDraftChange(Author a);
	public Set<DraftChange> getSentDraftChange(Author a);
	
	public Set<PitchReview> getReceivedEditorPitchReview(Editor e);
	public Set<PitchReview> getReceivedAuthorPitchReview(Editor e);
	public Set<PitchReview> getSentEditorPitchReview(Editor e);
	public Set<PitchReview> getSentAuthorPitchReview(Editor e);
	
	public Set<PitchReview> getReceivedPitchReview(Author a);
	public Set<PitchReview> getSentPitchReview(Author a);
	
}
