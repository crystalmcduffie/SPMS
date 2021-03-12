package com.revature.services;

import java.util.Set;

import com.revature.beans.Draft;
import com.revature.beans.Editor;
import com.revature.beans.Genre;
import com.revature.beans.GenreCommittee;

public interface GenreService {
	public Set<GenreCommittee> getGenreCommittee(Genre g);
	public Set<Set<GenreCommittee>> getAllGenreCommittees();
	public Genre getGenre (String name);
	public Set<Genre> getAllGenres();
	public Set<Draft> getDraftsInGenre(Editor e);
}
