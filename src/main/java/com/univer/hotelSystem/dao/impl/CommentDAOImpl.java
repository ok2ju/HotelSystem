package com.univer.hotelSystem.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univer.hotelSystem.dao.CommentDAO;
import com.univer.hotelSystem.domain.Comment;

@Repository
public class CommentDAOImpl implements CommentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void createComment(Comment comment) {
		sessionFactory.getCurrentSession().saveOrUpdate(comment);
	}

	@SuppressWarnings("unchecked")
	public List<Comment> commentsList() {
		return sessionFactory.getCurrentSession().createQuery("from Comment").list();
	}

	public void removeCommentById(Integer id) {
		Comment comment = (Comment) sessionFactory.getCurrentSession().load(Comment.class, id);
		
		if(comment != null){
			sessionFactory.getCurrentSession().delete(comment);
		}
	}

}
