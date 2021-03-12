package com.revature.services;

import com.revature.beans.Author;
import com.revature.data.AuthorDAO;
import com.revature.data.DAOFactory;
import com.revature.data.hibernate.AuthorHibernate;
import com.revature.exceptions.NonUniqueUsernameException;

public class AuthorServiceImpl implements AuthorService{
	private AuthorDAO authorDAO;
	
	public AuthorServiceImpl() {
		authorDAO = DAOFactory.getAuthorDAO();
	}
	
	public Author getByUsername(String username) {
		return authorDAO.getByUsername(username);
	}

	@Override
	public void update(Author a) {
		authorDAO.update(a);
		
	}

	@Override
	public Author create(Author a) throws NonUniqueUsernameException{
		a.setPoints(100);
		return authorDAO.create(a);
	}
}
