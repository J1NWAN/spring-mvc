package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.service.NoticeService;
import com.newlectureweb.entity.Notice;

public class ListController implements Controller {
	
	@Autowired
	private NoticeService noticeService; 

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("notice.list");
//		mv.setViewName("/notice/index.jsp");
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list", list);
		return mv;
	}

}
