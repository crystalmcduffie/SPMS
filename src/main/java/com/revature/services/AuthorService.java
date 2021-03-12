package com.revature.services;

import com.revature.beans.Author;
import com.revature.exceptions.NonUniqueUsernameException;

public interface AuthorService {
	public Author getByUsername(String username);
	public void update(Author a);
	public Author create(Author a) throws NonUniqueUsernameException;
}
