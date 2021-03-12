package com.revature.data;

import java.util.Set;

import com.revature.beans.Genre;
import com.revature.beans.GenreCommittee;

public interface GenreDAO {
	public Set<GenreCommittee> getGenreCommittee(Genre g);


	public Set<Set<GenreCommittee>> getAllGenreCommittees();
	
	public Genre getGenre(String name);
	
	public Set<Genre> getAllGenres();
}
