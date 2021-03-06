package com.revature.data.hibernate;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.revature.beans.Author;
import com.revature.beans.Draft;
import com.revature.beans.DraftStage;
import com.revature.beans.Editor;
import com.revature.beans.Genre;
import com.revature.beans.StoryType;
import com.revature.services.AuthorService;
import com.revature.services.AuthorServiceImpl;
import com.revature.services.DraftService;
import com.revature.services.DraftServiceImpl;
import com.revature.services.EditorService;
import com.revature.services.EditorServiceImpl;

public class DraftHibernateTest {
	private static DraftService draftServ;
	private static AuthorService authorServ;
	private static EditorService editorServ;
	private Logger log = Logger.getLogger(DraftHibernateTest.class);

	@BeforeAll
	public static void setup() {
		draftServ = new DraftServiceImpl();
		authorServ = new AuthorServiceImpl();
		editorServ = new EditorServiceImpl();
	}

//	@Test
//	public void testGetDraft() {
//		Draft d = draftServ.getDraft(1);
//		log.debug(d);
//	}
	
//	@Test
//	public void testSubmitDraft() {
//		Author a = authorServ.getByUsername("bailey");
//		Draft d = new Draft();
//		d.setDraft("test");
//		StoryType st = new StoryType();
//		st.setStoryType("novella");
//		st.setId(2);
//		d.setStoryType(st);
//		Genre g = new Genre();
//		g.setId(1);
//		g.setName("romance");
//		d.setGenre(g);
//		draftServ.submitDraft(a, d);
//	}
//	
//	@Test
//	public void testUpdateDraft() {
//		Draft d = draftServ.getDraft(8);
//		DraftStage ds = d.getStage();
//		ds.setId(2);
//		ds.setName("approved");
//		d.setStage(ds);
//		draftServ.updateDraft(d);
//	}
//	@Test
//	public void testApproveDraft() {
//		Editor e = editorServ.getByUsername("gabriel");
//		Draft d = draftServ.getDraft(11);
//		draftServ.approveDraft(e, d);
//	}
	
//	@Test
//	public void testGetAllDrafts() {
//		Set<Draft> drafts = draftServ.getAll();
//		for(Draft d : drafts) {
//			log.debug(d);
//		}
//	}
	
//	@Test
//	public void testGetAllPendingDrafts() {
//		Set<Draft> drafts = draftServ.getAllPendingDrafts();
//		for(Draft d : drafts) {
//			log.debug(d);
//		}
//	}
	
	@Test
	public void testSortDrafts() {
		Author a = authorServ.getByUsername("derrick");
		List<Draft> orderedDrafts = draftServ.listDraftsInOrder(a.getDrafts());
		for(Draft d : orderedDrafts) {
			log.debug(d.getId());
		}
	}
}
