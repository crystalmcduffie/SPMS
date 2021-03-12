package com.revature.data.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.revature.beans.Author;
import com.revature.beans.Draft;
import com.revature.beans.DraftMessage;
import com.revature.beans.Pitch;
import com.revature.services.AuthorService;
import com.revature.services.AuthorServiceImpl;

public class AuthorHibernateTest {
	private static AuthorService authorServ;
	private Logger log = Logger.getLogger(AuthorHibernateTest.class);
	
	@BeforeAll
	public static void setup() {
		authorServ = new AuthorServiceImpl();
	}
	
	@Test
	public void getByUsernameTest() {
		Author a = authorServ.getByUsername("derrick");
		//log.debug(a.toString());
		System.out.println(a.getUsername() + a.getId() + a.getPassword() + a.getPoints());
		Set<Pitch> pitches = new HashSet<>();
		pitches.addAll(a.getPitches());
		for(Pitch pitch : pitches) {
			
			System.out.println(pitch.toString());
		}
		Set<Draft> drafts = new HashSet<>();
		drafts.addAll(a.getDrafts());
		for(Draft draft : drafts) {
			System.out.println(draft.toString());
		}
//		Set<DraftMessage> receivedDM = new HashSet<>();
//		receivedDM.addAll(a.getReceivedDraftMessages());
//		for(DraftMessage draftMessage : receivedDM) {
//			System.out.println(draftMessage.toString());
//		}
//		Set<DraftMessage> sentDM = new HashSet<>();
//		sentDM.addAll(a.getSentDraftMessages());
//		for(DraftMessage draftMessage : sentDM) {
//			System.out.println(draftMessage.toString());
//		}
	}
}
