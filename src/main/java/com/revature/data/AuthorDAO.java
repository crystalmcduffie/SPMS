package com.revature.data;

import com.revature.beans.Author;
import com.revature.exceptions.NonUniqueUsernameException;

public interface AuthorDAO {
	public Author getByUsername(String username);
	public void update(Author a);
	public Author create(Author a) throws NonUniqueUsernameException;
	
}
