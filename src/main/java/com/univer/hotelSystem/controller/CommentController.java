package com.univer.hotelSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.univer.hotelSystem.domain.Comment;
import com.univer.hotelSystem.service.CommentService;

@Controller
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value="/postComment", method=RequestMethod.POST)
	public String leaveComment(@ModelAttribute("comment") Comment comment){
		commentService.createComment(comment);
		
		return "home";
	}
	
}
