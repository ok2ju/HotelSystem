package com.univer.hotelSystem.service;

import java.util.List;

import com.univer.hotelSystem.domain.Comment;

public interface CommentService {
	
	public void createComment(Comment comment);
	
	public List<Comment> commentsList();
	
	public void removeCommentById(Integer id);
	
}
