package com.revature.delegates;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Draft;
import com.revature.beans.DraftChange;
import com.revature.beans.DraftMessage;
import com.revature.beans.Editor;
import com.revature.beans.Pitch;
import com.revature.beans.PitchMessage;
import com.revature.beans.PitchReview;
import com.revature.services.AuthorService;
import com.revature.services.AuthorServiceImpl;
import com.revature.services.DraftService;
import com.revature.services.DraftServiceImpl;
import com.revature.services.EditorService;
import com.revature.services.EditorServiceImpl;
import com.revature.services.GenreService;
import com.revature.services.GenreServiceImpl;
import com.revature.services.MessageService;
import com.revature.services.MessageServiceImpl;
import com.revature.services.PitchService;
import com.revature.services.PitchServiceImpl;
/*
*	/message/getSentEditorPitchReviews (GET)
*	/message/getReceivedEditorPitchReviews (GET)
*/
public class MessageDelegate implements FrontControllerDelegate{
	private PitchService pitchServ = new PitchServiceImpl();
	private EditorService editorServ = new EditorServiceImpl();
	private AuthorService authorServ = new AuthorServiceImpl();
	private GenreService genreServ = new GenreServiceImpl();
	private MessageService messageServ = new MessageServiceImpl();
	private DraftService draftServ = new DraftServiceImpl();
	private ObjectMapper om = new ObjectMapper();
	Logger log = Logger.getLogger(MessageDelegate.class);

	@Override
	public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = (String) req.getAttribute("path");
		
		if(path.contains("getSentEditorPitchReviews")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<PitchReview> SEPR = messageServ.getSentEditorPitchReview(e);
				resp.getWriter().write(om.writeValueAsString(SEPR));
				
			}
		}
		else if(path.contains("getReceivedEditorPitchReviews")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<PitchReview> REPR = messageServ.getReceivedEditorPitchReview(e);
				resp.getWriter().write(om.writeValueAsString(REPR));
			}
		}
		else if(path.contains("getSentAuthorPitchReviews")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<PitchReview> SAPR = messageServ.getSentAuthorPitchReview(e);
				resp.getWriter().write(om.writeValueAsString(SAPR));
			}
		}
		else if(path.contains("getReceivedAuthorPitchReviews")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<PitchReview> RAPR = messageServ.getReceivedAuthorPitchReview(e);
				resp.getWriter().write(om.writeValueAsString(RAPR));
			}
		}
		else if(path.contains("getSentDraftChanges")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<DraftChange> SDC = messageServ.getSentDraftChange(e);
				resp.getWriter().write(om.writeValueAsString(SDC));
			}
		}
		else if(path.contains("getReceivedDraftChanges")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<DraftChange> RDC = messageServ.getReceivedDraftChange(e);
				resp.getWriter().write(om.writeValueAsString(RDC));
			}
		}
		else if(path.contains("getAuthorPitchMessages")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<PitchMessage> SPM = messageServ.getSentAuthorPitchMessages(e);
				Set<PitchMessage> RPM = messageServ.getReceivedAuthorPitchMessages(e);
				List<PitchMessage> PM = messageServ.listPitchMessagesInOrder(RPM, SPM);
				resp.getWriter().write(om.writeValueAsString(PM));
			}
		}
		else if(path.contains("getEditorPitchMessages")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<PitchMessage> SEPM = messageServ.getSentEditorPitchMessages(e);
				Set<PitchMessage> REPM = messageServ.getReceivedEditorPitchMessages(e);
				List<PitchMessage> PM = messageServ.listPitchMessagesInOrder(REPM, SEPM);
				resp.getWriter().write(om.writeValueAsString(PM));
			}
		}
		else if(path.contains("getDraftMessages")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				Set<DraftMessage> SDM = messageServ.getSentDraftMessages(e);
				Set<DraftMessage> RDM = messageServ.getReceivedDraftMessages(e);
				List<DraftMessage> DM = messageServ.listDraftMessagesInOrder(RDM, SDM);
				resp.getWriter().write(om.writeValueAsString(DM));
			}
		}
		else if(path.contains("makeE2APitchReview")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				String message = req.getParameter("message");
				String pitchId = req.getParameter("pitchId");
				
				Integer id = Integer.parseInt(pitchId);
				Pitch p = pitchServ.getPitch(id);
				
				PitchMessage pm = new PitchMessage();
				pm.setMessage(message);
				pm.setPitch(p);
				
				messageServ.sendPME2A(pm, e);
				
				
				resp.setStatus(HttpServletResponse.SC_CREATED);
			}
		}
		else if(path.contains("makeDraftChange")) {
			if("GET".equals(req.getMethod())){
				Editor e = (Editor)req.getSession().getAttribute("user");
				String message = req.getParameter("message");
				String draftId = req.getParameter("draftId");
				
				Integer id = Integer.parseInt(draftId);
				Draft d = draftServ.getDraft(id);
				
				DraftMessage dm = new DraftMessage();
				dm.setMessage(message);
				dm.setDraft(d);
				
				messageServ.sendDME2A(dm, e);
				
				resp.setStatus(HttpServletResponse.SC_CREATED);
			}
		}
	}

}
