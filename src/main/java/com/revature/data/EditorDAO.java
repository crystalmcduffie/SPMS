package com.revature.data;

import java.util.Set;

import com.revature.beans.Editor;

public interface EditorDAO {
	public Editor getByUsername(String username);
	public void update(Editor ed);
	public Set<Editor> getAll();
}
