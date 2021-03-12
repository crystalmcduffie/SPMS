package com.revature.services;

import java.util.Set;

import com.revature.beans.Editor;
import com.revature.data.DAOFactory;
import com.revature.data.EditorDAO;
import com.revature.data.hibernate.EditorHibernate;

public class EditorServiceImpl implements EditorService {
	private EditorDAO editorDAO;
	
	public EditorServiceImpl() {
		editorDAO  = DAOFactory.getEditorDAO();
	}
	
	public Editor getByUsername(String username) {
		return editorDAO.getByUsername(username);
	}

	@Override
	public void update(Editor ed) {
		editorDAO.update(ed);
		
	}

	@Override
	public Set<Editor> getAll() {
		return editorDAO.getAll();
	}
	
}
