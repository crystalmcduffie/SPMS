package com.revature.data;

import com.revature.data.hibernate.*;

public class DAOFactory {
	
	public static AuthorDAO getAuthorDAO() {
		return new AuthorHibernate();
	}
	
	public static DraftDAO getDraftDAO() {
		return new DraftHibernate();
	}
	
	public static EditorDAO getEditorDAO() {
		return new EditorHibernate();
	}

	public static GenreDAO getGenreDAO() {
		return new GenreHibernate();
	}
	
	public static MessageDAO getMessageDAO() {
		return new MessageHibernate();
	}
	
	public static PitchDAO getPitchDAO() {
		return new PitchHibernate();
	}
}
