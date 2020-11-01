package com.ncs.green;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping(value = "/blist")
	public ModelAndView blist(ModelAndView mv) {
		
		mv.addObject("list",service.blist());
		 
		mv.setViewName("board/blist");
		
		return mv;
	}

}
