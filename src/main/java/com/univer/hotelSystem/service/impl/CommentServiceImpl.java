package com.univer.hotelSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univer.hotelSystem.dao.CommentDAO;
import com.univer.hotelSystem.domain.Comment;
import com.univer.hotelSystem.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentDAO commentDAO;
	
	@Transactional
	public void createComment(Comment comment) {
		commentDAO.createComment(comment);
	}
	
	@Transactional
	public List<Comment> commentsList() {
		return commentDAO.commentsList();
	}
	
	@Transactional
	public void removeCommentById(Integer id) {
		commentDAO.removeCommentById(id);
	}

}
