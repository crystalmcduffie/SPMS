package com.revature.services;

import java.util.HashSet;
import java.util.Set;

import com.revature.beans.Draft;
import com.revature.beans.Editor;
import com.revature.beans.Genre;
import com.revature.beans.GenreCommittee;
import com.revature.data.DAOFactory;
import com.revature.data.DraftDAO;
import com.revature.data.GenreDAO;
import com.revature.data.hibernate.GenreHibernate;

public class GenreServiceImpl implements GenreService {
	private GenreDAO genreDAO;
	private DraftDAO draftDAO;
	
	public GenreServiceImpl() {
		genreDAO = DAOFactory.getGenreDAO();
		draftDAO = DAOFactory.getDraftDAO();
	}
	
	@Override
	public Set<GenreCommittee> getGenreCommittee(Genre g) {
		return genreDAO.getGenreCommittee(g);
	}

	@Override
	public Set<Set<GenreCommittee>> getAllGenreCommittees() {
		// TODO Auto-generated method stub
		return genreDAO.getAllGenreCommittees();
	}

	@Override
	public Genre getGenre(String name) {
		return genreDAO.getGenre(name);
	}

	@Override
	public Set<Genre> getAllGenres() {
		return genreDAO.getAllGenres();
	}

	@Override
	public Set<Draft> getDraftsInGenre(Editor e) {
		Set<Set<GenreCommittee>> allGenres = getAllGenreCommittees();
		Set<Draft> allDrafts = draftDAO.getAll();
		Set<Draft> relevantDrafts = new HashSet<>();
		Set<GenreCommittee> editorGC = new HashSet<>();
		for(Set<GenreCommittee> SetGC : allGenres) {
			Set<GenreCommittee> GC = SetGC;
			for(GenreCommittee gc : GC) {
				if(gc.getEditor().getId() == e.getId()) {
					editorGC.add(gc);
				}
			}
		}
		
		for(Draft d : allDrafts) {
			for(GenreCommittee gc: editorGC) {
				if(d.getGenre().getId() == gc.getGenre().getId()) {
					if(d.getStage().getId()==1) {
						//1 is pending
						relevantDrafts.add(d);
					}
					
				}
			}
		}
		
		return relevantDrafts;
	}
	

}
