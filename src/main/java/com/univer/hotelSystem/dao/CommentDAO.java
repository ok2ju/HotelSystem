package com.univer.hotelSystem.dao;

import java.util.List;

import com.univer.hotelSystem.domain.Comment;

public interface CommentDAO {
	
	public void createComment(Comment comment);
	
	public List<Comment> commentsList();
	
	public void removeCommentById(Integer id);
}
